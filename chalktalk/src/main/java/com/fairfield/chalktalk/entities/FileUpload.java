/**
 * 
 */
package com.fairfield.chalktalk.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class FileUpload {

	@Column(name="fileType")
	private String fileType;
	
	@Column(name="whatIsIt")
	private String whatIsIt;
	
	@Column(name="filePath")
	private String filePath;

	/**
	 * 
	 */
	public FileUpload() {
		super();
	}

	/**
	 * @param fileType
	 * @param whatIsIt
	 * @param filePath
	 */
	public FileUpload(String fileType, String whatIsIt, String filePath) {
		super();
		this.fileType = fileType;
		this.whatIsIt = whatIsIt;
		this.filePath = filePath;
	}

	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @return the whatIsIt
	 */
	public String getWhatIsIt() {
		return whatIsIt;
	}

	/**
	 * @param whatIsIt the whatIsIt to set
	 */
	public void setWhatIsIt(String whatIsIt) {
		this.whatIsIt = whatIsIt;
	}
}
