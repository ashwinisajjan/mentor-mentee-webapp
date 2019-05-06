/**
 * 
 */
package com.fairfield.chalktalk.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Ashwini Sajjan
 *
 */
public interface IFileOperations {
	
	boolean saveFileToDisk(Long id, Map<String,MultipartFile> uploadedFileswithTypes);
	boolean saveStartupDocsToDisk(Long id, Map<String,MultipartFile> uploadedFileswithTypes);

}
