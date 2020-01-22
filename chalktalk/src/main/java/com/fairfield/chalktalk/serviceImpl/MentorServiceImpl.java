/**
 * 
 */
package com.fairfield.chalktalk.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fairfield.chalktalk.dao.IMentorDao;
import com.fairfield.chalktalk.dto.MentorDTO;
import com.fairfield.chalktalk.dto.MentorProfileResponseDTO;
import com.fairfield.chalktalk.dto.MentorResponseDTO;
import com.fairfield.chalktalk.dto.SearchRequestDTO;
import com.fairfield.chalktalk.entities.Address;
import com.fairfield.chalktalk.entities.FileUpload;
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
	public List<MentorResponseDTO> getAllMentorApplications() {

		List<MentorResponseDTO> mentorDTOList = null ;
		try {
			List<Mentor> mentorsList = mentorDao.findAll();
			mentorDTOList = new ArrayList<MentorResponseDTO>();
			for(Mentor mentor : mentorsList) {
				if (!mentor.isApplicationAccepted()) {
					MentorResponseDTO mentorDTO = new MentorResponseDTO();
					/*mentorDTO.setAddressline1(mentor.getAddress().getAddressLine1());
					mentorDTO.setAddressline2(mentor.getAddress().getAddressLine2());
					mentorDTO.setCity(mentor.getAddress().getCity());
					mentorDTO.setCounty(mentor.getAddress().getCounty());
					mentorDTO.setLinkedInProfile(mentor.getLinkedInProfile());
					mentorDTO.setEmailId(mentor.getEmailId());*/
					mentorDTO.setMentorId(mentor.getMentorId());
					mentorDTO.setAreasOfExpertise(mentor.getAreaOfExpertise());
					mentorDTO.setMentorName(mentor.getMentorName());
					mentorDTO.setPrimaryserviceindustry(mentor.getPrimaryServiceIndustry());
					mentorDTO.setPhoneNo(mentor.getPhoneNo());
					mentorDTO.setReferredBy(mentor.getReferredBy());
					for (FileUpload UploadedFile : mentor.getFileUploads()) {
						if (UploadedFile.getWhatIsIt().equalsIgnoreCase("RESUME")) {
							mentorDTO.setResume(UploadedFile.getFilePath());
						}else if (UploadedFile.getWhatIsIt().equalsIgnoreCase("CERTIFICATE")) {
							mentorDTO.setCertificates(UploadedFile.getFilePath());
						}
					}
					mentorDTOList.add(mentorDTO);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return mentorDTOList;
		}
		return mentorDTOList;
	}
	
	@Override
	public List<MentorProfileResponseDTO> getAllMentors() {

		List<MentorProfileResponseDTO> mentorDTOList = null ;
		try {
			List<Mentor> mentorsList = mentorDao.findAll();
			mentorDTOList = new ArrayList<MentorProfileResponseDTO>();
			for(Mentor mentor : mentorsList) {
				createMentorProfileDTO(mentorDTOList, mentor);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return mentorDTOList;
		}
		return mentorDTOList;
	}
	
	@Override
	public Long addMentor(MentorDTO requestMentor) {
		Mentor mentor = null;
		try {
			mentor = new Mentor();
			mentor.setMentorName(requestMentor.getMentorName());
			mentor.setEmailId(requestMentor.getEmailId());
			mentor.setLinkedInProfile(requestMentor.getLinkedInProfile());
			mentor.setReferredBy(requestMentor.getReferredBy());
			mentor.setPhoneNo(requestMentor.getPhoneNo());
			mentor.setAreaOfExpertise(requestMentor.getAreaOfExpertise());
			mentor.setPrimaryServiceIndustry(requestMentor.getPrimaryserviceindustry());
			Address address = new Address();
			address.setAddressLine1(requestMentor.getAddressline1());
			address.setAddressLine2(requestMentor.getAddressline2());
			address.setCity(requestMentor.getCity());
			address.setCounty(requestMentor.getCounty());
			address.setState(requestMentor.getState());
			address.setCountry("USA");
			mentor.setAddress(address);
			mentorDao.create(mentor);
		} catch (Exception e) {
			return null;
		}
		return mentor.getMentorId();
	}
	
	@Override
	public Mentor getMentor(Long id) {
		Mentor mentor = null;
		try {
			 mentor = mentorDao.findOne(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return mentor;
	}
	
	@Override
	public Boolean updateMentor(Mentor mentor) {
		try {
			 mentor = mentorDao.update(mentor);
		} catch (Exception e) {
			e.printStackTrace();
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

	@Override
	public List<MentorProfileResponseDTO> getMentorSearchResults(SearchRequestDTO requestdto) {
		List<MentorProfileResponseDTO> mentorDTOList = null;
		try {
			if(requestdto.getSearchCriteria().toLowerCase().contains("mentorname".toLowerCase())) {
				List<Mentor> searchResults = mentorDao.searchByMentorName(requestdto.getSearchInput().toLowerCase());
				mentorDTOList = new ArrayList<MentorProfileResponseDTO>();
				for(Mentor mentor : searchResults) {
					createMentorProfileDTO(mentorDTOList, mentor);
				}
			} else if (requestdto.getSearchCriteria().toLowerCase().contains("skill".toLowerCase())) {
				List<Mentor> searchResults = mentorDao.searchBySkills(requestdto.getSearchInput().toLowerCase());
				mentorDTOList = new ArrayList<MentorProfileResponseDTO>();
				for(Mentor mentor : searchResults) {
					createMentorProfileDTO(mentorDTOList, mentor);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return mentorDTOList;
	}

	private void createMentorProfileDTO(List<MentorProfileResponseDTO> mentorDTOList, Mentor mentor)
			throws FileNotFoundException, IOException {
		MentorProfileResponseDTO mentorDTO = new MentorProfileResponseDTO();
		mentorDTO.setAreasOfExpertise(mentor.getAreaOfExpertise());
		mentorDTO.setCity(mentor.getAddress().getCity());
		mentorDTO.setCounty(mentor.getAddress().getCounty());
		mentorDTO.setEmailId(mentor.getEmailId());
		mentorDTO.setLinkedInProfile(mentor.getLinkedInProfile());
		mentorDTO.setMentorName(mentor.getMentorName());
		mentorDTO.setPrimaryserviceindustry(mentor.getPrimaryServiceIndustry());
		for (FileUpload UploadedFile : mentor.getFileUploads()) {
			if (UploadedFile.getWhatIsIt().equalsIgnoreCase("PROFILE_PIC")) {
				//File file = Paths.get("D:\\Softwares\\apache-tomcat-9.0.16\\webapps\\profilepics\\Mentor_361_PP.png").toFile();
				File file = new File(UploadedFile.getFilePath());
				InputStream is = new FileInputStream(file);
				String profilePic = Base64.getEncoder().encodeToString(IOUtils.toByteArray(is));
				is.close();
				mentorDTO.setProfilePic(profilePic);
			}
		}
		mentorDTOList.add(mentorDTO);
	}
}
