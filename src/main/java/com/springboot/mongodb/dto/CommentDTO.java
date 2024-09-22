package com.springboot.mongodb.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO() {
		
	}

	public CommentDTO( String text, Date date, AuthorDTO authorDTO) {
		super();
		this.text = text;
		this.date = date;
		this.author = authorDTO;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthorDTO() {
		return author;
	}

	public void setAuthorDTO(AuthorDTO authorDTO) {
		this.author = authorDTO;
	}
	
	
}
