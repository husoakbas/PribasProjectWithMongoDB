package com.akbas.springboot.PribasProject.Entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Attachments {

	@Field(name = "file_name")
	private String fileName;

	@Field(name = "file_size")
	private long fileSize;

//----------------------------------------------------------------

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

//----------------------------------------------------------------	
	
	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

}
