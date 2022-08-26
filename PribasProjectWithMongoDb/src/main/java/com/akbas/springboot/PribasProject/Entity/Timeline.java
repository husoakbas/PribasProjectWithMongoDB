package com.akbas.springboot.PribasProject.Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "users")
public class Timeline {

	@Id
	private String id;

	private String title;

	private String description;

	private Users user;

	@Field(name = "creation_date")
	// @JsonFormat(pattern = "dd-MM-yyyy")
	private String creationDate;

	private List<String> tags;

	private List<Moments> moments;

//-----------------------------------------------------------------------------------------------------------------------

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

// ---------------------------------------------------------------------------------------------------------------------

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

// ----------------------------------------------------------------------------------------------------------------------

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//-----------------------------------------------------------------------------------------------------------------------

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

// ----------------------------------------------------------------------------------------------------------------------

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
		/*
		 * POST ve PUT'da girilen tarihi kontrol eder işlemin yapıldığı günün tarihi
		 * girildiyse else'e girer sorunsuz kayıt gerçekleşir, işlemin yapıldığı günün
		 * tarihinden farklı bir tarih girilirse if'e girer işlem tarihini atar.
		 * 
		 */

	}

//--------------------------------------------------------------------------------------------------------------------------

	public List<String> getTags() {
		// String tag1 = tags.get(0);
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;

	}

//--------------------------------------------------------------------------------------------------------------------------

	public List<Moments> getMoments() {
		return moments;
	}

	public void setMoments(List<Moments> moments) {
		this.moments = moments;
	}

}
