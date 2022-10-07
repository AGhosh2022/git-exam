package com.app.phoneBook.pojo;

import java.util.Date;

public class Contact {

	private int id;
	private String name;
	private String phoneNumber;
	private Date dateOfbirth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(Date date) {
		this.dateOfbirth = date;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", dateOfbirth=" + dateOfbirth;
	}

}
