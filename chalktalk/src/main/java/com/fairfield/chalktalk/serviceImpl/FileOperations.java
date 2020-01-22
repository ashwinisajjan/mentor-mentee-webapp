/**
 * 
 */
package com.fairfield.chalktalk.serviceImpl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.fairfield.chalktalk.dao.IMentorDao;
import com.fairfield.chalktalk.dao.IStartUpApplicationDao;
import com.fairfield.chalktalk.entities.FileUpload;
import com.fairfield.chalktalk.entities.Mentor;
import com.fairfield.chalktalk.entities.StartUpApplication;
import com.fairfield.chalktalk.service.IFileOperations;

/**
 * @author Ashwini Sajjan
 *
 */
public class FileOperations implements IFileOperations {

	@Autowired
	private IMentorDao mentorDao;
	
	@Autowired
	private IStartUpApplicationDao startUpApplicationDao;

	@Override
	public boolean saveFileToDisk(Long id, Map<String,MultipartFile> uploadedFileswithTypes) {
		try
		{
			Mentor mentor = mentorDao.findOne(id);
			List<FileUpload> files = new ArrayList<>();
			if(mentor!=null){
				for (Map.Entry<String, MultipartFile> entry : uploadedFileswithTypes.entrySet()) {
					MultipartFile file = entry.getValue();
					if (!file.isEmpty() && entry.getKey().equalsIgnoreCase("resume")/*&& (file.getContentType().contains("spreadsheetml") || file.getContentType().contains("ms-excel"))*/) {
						try {
							File resumesDir = new File("../webapps/resumes");
							if(!resumesDir.exists()){
								resumesDir.mkdir();
							}
							Timestamp present = new Timestamp(new java.util.Date().getTime());
							//String imageFileName = UUID.randomUUID().toString().replaceAll("-", "")+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String imageFileName = "Mentor_"+id+"_Resume"+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String finalFileName = imageFileName.toString();
							String finalFile = resumesDir.getCanonicalPath()+"/"+finalFileName;
							String imageURL = "../webapps/resumes/"+finalFileName;
							byte[] bytes = file.getBytes();
							BufferedOutputStream stream = 
									new BufferedOutputStream(new FileOutputStream(new File(resumesDir.getCanonicalPath()+"/"+finalFileName)));
							stream.write(bytes);
							stream.close();
							
							
							FileUpload resumeDoc = new FileUpload();
							resumeDoc.setFilePath(imageURL);
							resumeDoc.setFileType(file.getContentType());
							resumeDoc.setWhatIsIt("RESUME");
							files.add(resumeDoc);

						} catch (Exception e) {
							e.printStackTrace();
						}
					} else if (!file.isEmpty() && entry.getKey().equalsIgnoreCase("certificate")) {
						try {
							File resumesDir = new File("../webapps/certificates");
							if(!resumesDir.exists()){
								resumesDir.mkdir();
							}
							Timestamp present = new Timestamp(new java.util.Date().getTime());
							//String imageFileName = UUID.randomUUID().toString().replaceAll("-", "")+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String imageFileName = "Mentor_"+id+"_Certificate"+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String finalFileName = imageFileName.toString();
							String finalFile = resumesDir.getCanonicalPath()+"/"+finalFileName;
							String imageURL = "../webapps/certificates/"+finalFileName;
							byte[] bytes = file.getBytes();
							BufferedOutputStream stream = 
									new BufferedOutputStream(new FileOutputStream(new File(resumesDir.getCanonicalPath()+"/"+finalFileName)));
							stream.write(bytes);
							stream.close();
							
							
							FileUpload certificateDoc = new FileUpload();
							certificateDoc.setFilePath(imageURL);
							certificateDoc.setFileType(file.getContentType());
							certificateDoc.setWhatIsIt("CERTIFICATE");
							files.add(certificateDoc);

						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {

						try {
							File resumesDir = new File("../webapps/profilepics");
							if(!resumesDir.exists()){
								resumesDir.mkdir();
							}
							Timestamp present = new Timestamp(new java.util.Date().getTime());
							//String imageFileName = UUID.randomUUID().toString().replaceAll("-", "")+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String imageFileName = "Mentor_"+id+"_PP"+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String finalFileName = imageFileName.toString();
							String finalFile = resumesDir.getCanonicalPath()+"/"+finalFileName;
							String imageURL = "../webapps/profilepics/"+finalFileName;
							byte[] bytes = file.getBytes();
							BufferedOutputStream stream = 
									new BufferedOutputStream(new FileOutputStream(new File(resumesDir.getCanonicalPath()+"/"+finalFileName)));
							stream.write(bytes);
							stream.close();
							
							
							FileUpload profilePic = new FileUpload();
							profilePic.setFilePath(imageURL);
							profilePic.setFileType(file.getContentType());
							profilePic.setWhatIsIt("PROFILE_PIC");
							files.add(profilePic);

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				mentor.setFileUploads(files);
				mentorDao.update(mentor);
			}
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean saveStartupDocsToDisk(Long id, Map<String,MultipartFile> uploadedFileswithTypes) {
		try
		{
			StartUpApplication startup = startUpApplicationDao.findOne(id);
			List<FileUpload> files = new ArrayList<>();
			if(startup!=null){
				for (Map.Entry<String, MultipartFile> entry : uploadedFileswithTypes.entrySet()) {
					MultipartFile file = entry.getValue();
					if (!file.isEmpty() && entry.getKey().equalsIgnoreCase("businessplandoc")) {
						try {
							File startupsDir = new File("../webapps/startups");
							if(!startupsDir.exists()){
								startupsDir.mkdir();
							}
							File startupcompanyDir = new File(startupsDir.getPath()+"/"+startup.getStartUpName()+"/");
							if(!startupcompanyDir.exists()){
								startupcompanyDir.mkdir();
							}
							Timestamp present = new Timestamp(new java.util.Date().getTime());
							//String imageFileName = UUID.randomUUID().toString().replaceAll("-", "")+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String imageFileName = startup.getStartUpName()+"_"+file.getOriginalFilename();
							String finalFileName = imageFileName.toString();
							String finalFile = startupcompanyDir.getCanonicalPath()+"/"+finalFileName;
							String imageURL = "../webapps/startups/"+startup.getStartUpName()+"/"+finalFileName;
							byte[] bytes = file.getBytes();
							BufferedOutputStream stream = 
									new BufferedOutputStream(new FileOutputStream(new File(startupcompanyDir.getCanonicalPath()+"/"+finalFileName)));
							stream.write(bytes);
							stream.close();
							
							FileUpload resumeDoc = new FileUpload();
							resumeDoc.setFilePath(imageURL);
							resumeDoc.setFileType(file.getContentType());
							resumeDoc.setWhatIsIt("BUSINESSPLANDOC");
							files.add(resumeDoc);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else if (!file.isEmpty() && entry.getKey().equalsIgnoreCase("pitchDeck")) {
						try {
							File startupsDir = new File("../webapps/startups");
							if(!startupsDir.exists()){
								startupsDir.mkdir();
							}
							File startupcompanyDir = new File(startupsDir.getPath()+"/"+startup.getStartUpName()+"/");
							if(!startupcompanyDir.exists()){
								startupcompanyDir.mkdir();
							}
							Timestamp present = new Timestamp(new java.util.Date().getTime());
							//String imageFileName = UUID.randomUUID().toString().replaceAll("-", "")+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String imageFileName = startup.getStartUpName()+"_"+file.getOriginalFilename();
							String finalFileName = imageFileName.toString();
							String finalFile = startupcompanyDir.getCanonicalPath()+"/"+finalFileName;
							String imageURL = "../webapps/startups/"+startup.getStartUpName()+"/"+finalFileName;
							byte[] bytes = file.getBytes();
							BufferedOutputStream stream = 
									new BufferedOutputStream(new FileOutputStream(new File(startupcompanyDir.getCanonicalPath()+"/"+finalFileName)));
							stream.write(bytes);
							stream.close();
							
							
							FileUpload resumeDoc = new FileUpload();
							resumeDoc.setFilePath(imageURL);
							resumeDoc.setFileType(file.getContentType());
							resumeDoc.setWhatIsIt("PITCHDECKDOC");
							files.add(resumeDoc);
							

						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {
						try {
							File startupsDir = new File("../webapps/startups");
							if(!startupsDir.exists()){
								startupsDir.mkdir();
							}
							File startupcompanyDir = new File(startupsDir.getPath()+"/"+startup.getStartUpName()+"/");
							if(!startupcompanyDir.exists()){
								startupcompanyDir.mkdir();
							}
							Timestamp present = new Timestamp(new java.util.Date().getTime());
							//String imageFileName = UUID.randomUUID().toString().replaceAll("-", "")+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
							String imageFileName = startup.getStartUpName()+"_"+file.getOriginalFilename();
							String finalFileName = imageFileName.toString();
							String finalFile = startupcompanyDir.getCanonicalPath()+"/"+finalFileName;
							String imageURL = "../webapps/startups/"+startup.getStartUpName()+"/"+finalFileName;
							byte[] bytes = file.getBytes();
							BufferedOutputStream stream = 
									new BufferedOutputStream(new FileOutputStream(new File(startupcompanyDir.getCanonicalPath()+"/"+finalFileName)));
							stream.write(bytes);
							stream.close();
							
							FileUpload resumeDoc = new FileUpload();
							resumeDoc.setFilePath(imageURL);
							resumeDoc.setFileType(file.getContentType());
							resumeDoc.setWhatIsIt("OTHERDOC");
							files.add(resumeDoc);

						} catch (Exception e) {
							e.printStackTrace();
						}
					} 
				} 
				startup.setFileUploads(files);
				startUpApplicationDao.update(startup);
			}
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * @param mentorDao the mentorDao to set
	 */
	public void setMentorDao(IMentorDao mentorDao) {
		this.mentorDao = mentorDao;
	}

	/**
	 * @param startupApplicationDao the startupApplicationDao to set
	 */
	public void setStartUpApplicationDao(IStartUpApplicationDao startupApplicationDao) {
		this.startUpApplicationDao = startupApplicationDao;
	}
	
}
