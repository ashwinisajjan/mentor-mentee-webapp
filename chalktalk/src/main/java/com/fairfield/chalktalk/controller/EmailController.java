/**
 * 
 */
package com.fairfield.chalktalk.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fairfield.chalktalk.dto.ApplicationStatusDTO;
import com.fairfield.chalktalk.entities.Mentee;
import com.fairfield.chalktalk.entities.Mentor;
import com.fairfield.chalktalk.entities.StartUpApplication;
import com.fairfield.chalktalk.service.IMenteeService;
import com.fairfield.chalktalk.service.IMentorService;
import com.fairfield.chalktalk.utility.ChacktalkUtil;

/**
 * @author Ashwini Sajjan
 *
 */
@RestController
public class EmailController {
	 
	    @Autowired
	    private MailSender mailSenderObj;
	    
	    @Autowired
		private IMentorService mentorService;
	    
	    @Autowired
		private IMenteeService menteeService;
	    
	    private String fromEmailId = "ashwinisajjan9@gmail.com"; 
	    
	    @RequestMapping(value = "/sendemail", method = RequestMethod.POST, consumes="application/json", produces="application/json")
		public ResponseEntity<Boolean> sendEmailToClient(@RequestBody ApplicationStatusDTO applicationStatusDTO) {
	    	Mentor mentor = null;
	    	StartUpApplication application = null;
	    	try {
	    		mentor = mentorService.getMentor(applicationStatusDTO.getId());
	    		String body = null;
	    		if(mentor == null) {
	    			application = menteeService.getStartUpApplication(applicationStatusDTO.getId());
	    			if(application!=null) {
	    				addMentor(application);
		    			SimpleMailMessage approvedMail = new SimpleMailMessage();
			    		approvedMail.setFrom(fromEmailId);
			    		approvedMail.setTo(application.getApplicantEmailId());
			    		approvedMail.setSubject("Your Application Status");
			    		if (applicationStatusDTO.getApplicationDecision()) {
			    			application.setApplicationAccepted(true);
			    			menteeService.updateMentor(application);
			    			body= "Congrugulations.We are pleased to say that your application is approved."
				    				+ "Please click or copy paste the following url in your browser to complete registration\n"
			    					+"Note:Register as a mentor".toUpperCase()+"link: http://localhost:8080/chalktalk/registrationform#";
			    		} else {
			    			body = "We are sorry to say that we have to deny your application.";
			    		}
			    		approvedMail.setText(body);
			    		mailSenderObj.send(approvedMail);
	    			}
	    		}
	    		if (mentor != null) {
	    			
	    			SimpleMailMessage approvedMail = new SimpleMailMessage();
		    		approvedMail.setFrom(fromEmailId);
		    		approvedMail.setTo(mentor.getEmailId());
		    		approvedMail.setSubject("Your Application Status");
		    		if (applicationStatusDTO.getApplicationDecision()) {
		    			mentor.setApplicationAccepted(true);
		    			mentorService.updateMentor(mentor);
		    			body= "Congrugulations.We are pleased to say that your application is approved."
			    				+ "Please click or copy paste the following url in your browser to complete registration\n"
		    					+"Note:Register as a Mentor".toUpperCase()+"link: http://localhost:8080/chalktalk/registrationform#";
		    		} else {
		    			mentor.setApplicationAccepted(false);
		    			mentorService.updateMentor(mentor);
		    			body = "We are sorry to say that we have to deny your application.";
		    		}
		    		approvedMail.setText(body);
		    		mailSenderObj.send(approvedMail);
	    		} if(mentor == null && application==null) {
	    			return new ResponseEntity<Boolean>(Boolean.FALSE, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
	    		}
			} catch (Exception e) {
				mentor.setApplicationAccepted(false);
    			mentorService.updateMentor(mentor);
				return new ResponseEntity<Boolean>(Boolean.FALSE, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
			}

			//Returning successful response.
			return new ResponseEntity<Boolean>(Boolean.TRUE, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
		}

		private void addMentor(StartUpApplication application) {
			Mentee mentee = new Mentee();
			mentee.setAssociateNames( Arrays.asList(application.getTeamDetails().split(",")));
			mentee.setEmailId(application.getApplicantEmailId());
			mentee.setJobRole(application.getApplicantJobRole());
			mentee.setMenteeName(application.getApplicantName());
			mentee.setPhoneNo(application.getApplicantPhoneNo());
			mentee.setStartUpExp(application.isPriorExperience());
			mentee.setStartupApplicationId(application.getApplicationId());
			menteeService.addMentee(mentee);
		}

		/**
		 * @param mentorService the mentorService to set
		 */
		public void setMentorService(IMentorService mentorService) {
			this.mentorService = mentorService;
		}
		
		

		/**
		 * @param menteeService the menteeService to set
		 */
		public void setMenteeService(IMenteeService menteeService) {
			this.menteeService = menteeService;
		}

		/**
		 * @param fromEmailId the fromEmailId to set
		 */
		public void setFromEmailId(String fromEmailId) {
			this.fromEmailId = fromEmailId;
		}
}
