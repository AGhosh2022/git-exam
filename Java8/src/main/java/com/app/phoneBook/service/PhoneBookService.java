package com.app.phoneBook.service;

import java.text.ParseException;

public interface PhoneBookService {

	public void addContact() throws ParseException;

	public void listOfContact();

	public void searchContactById();

	public void searchContactByName();

	public void searchContactByNumber();

	public void updateContact() throws ParseException;

	public void deleteContact();

}
