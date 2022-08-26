package com.akbas.springboot.PribasProject.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

public class Moments {

	private String title;

	private String description;

	// @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private String moment_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

	@Field(name = "creation_date")
	// @JsonFormat(pattern = "dd-MM-yyyy")
	private String creationDate;

	private List<Attachments> attachments;

//------------------------------------------------------------------------------------------------------------------

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//------------------------------------------------------------------------------------------------------------------	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
//-----------------------------------------------------------------------------------------------------------------

	public String getMoment_date() {
		return moment_date;
	}

	public void setMoment_date(String moment_date) {
		this.moment_date = moment_date;
	}

//-----------------------------------------------------------------------------------------------------------------

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		if (creationDate.equals(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))) {
			this.creationDate = creationDate;
		}

		else {
			this.creationDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}

	}

//----------------------------------------------------------------------------------------------------------------	

	public List<Attachments> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachments> attachments) {
		this.attachments = attachments;
	}

}