/**
 * 
 */
package com.fairfield.chalktalk.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fairfield.chalktalk.dao.IMentorDao;
import com.fairfield.chalktalk.dto.MentorDTO;
import com.fairfield.chalktalk.entities.Address;
import com.fairfield.chalktalk.entities.Mentor;
import com.fairfield.chalktalk.service.IMentorService;

/**
 * @author Ashwini Sajjan
 *
 */
@Service
public class MentorServiceImpl implements IMentorService{

	@Autowired
	private IMentorDao mentorDao;
	
	@Override
	public List<MentorDTO> getAllMentors() {

		List<MentorDTO> mentorDTOList = null ;
		try {
			List<Mentor> mentorsList = mentorDao.findAll();
			mentorDTOList = new ArrayList<MentorDTO>();
			for(Mentor mentor : mentorsList) {
				MentorDTO mentorDTO = new MentorDTO();
				List<String> expertise = new ArrayList<String>();
				expertise.add("Spring");
				expertise.add("Hibernate");
				mentorDTO.setAreaOfExpertise(expertise);
				mentorDTO.setLinkedInProfile(mentor.getLinkedInProfile());
				mentorDTO.setMentorName(mentor.getMentorName());
				mentorDTO.setProfilePicture(mentor.getProfilePicture());
				mentorDTO.setResume(mentor.getResume());
				mentorDTOList.add(mentorDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return mentorDTOList;
		}
		return mentorDTOList;
	}
	
	@Override
	public boolean addMentor(MentorDTO requestMentor) {
		Mentor mentor = null;
		try {
			mentor = new Mentor();
			Address address = new Address();
			mentor.setAddress(address);
			mentor.setAreaOfExpertise(requestMentor.getAreaOfExpertise());
			mentor.setEmailId(requestMentor.getEmailId());
			mentor.setLinkedInProfile(requestMentor.getLinkedInProfile());
			mentor.setMentorName(requestMentor.getMentorName());
			mentor.setReferredBy(requestMentor.getReferredBy());
			mentor.setResume(requestMentor.getResume());
			mentor.setPhoneNo(requestMentor.getPhoneNo());
			mentor.setProfilePicture(requestMentor.getProfilePicture());
			mentorDao.create(mentor);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @param mentorDAO the mentorDAO to set
	 */
	public void setMentorDAO(IMentorDao mentorDAO) {
		this.mentorDao = mentorDAO;
	}
}
