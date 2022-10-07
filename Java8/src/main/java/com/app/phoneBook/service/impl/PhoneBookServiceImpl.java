package com.app.phoneBook.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import com.app.phoneBook.pojo.Contact;
import com.app.phoneBook.service.PhoneBookService;
import com.app.phoneBook.utility.ScannerUtility;

public class PhoneBookServiceImpl implements PhoneBookService {

	Collection<Contact> allContact = new ArrayList<Contact>();
	private Scanner sc = ScannerUtility.getScanner();

	/** This Method add Contact and by using Java 8 feature date of birth insert */

	public void addContact() throws ParseException {

		System.out.println("How many Conatct do You want to add");
		int no = sc.nextInt();

		for (int i = 0; i < no; i++) {
			Contact contact = new Contact();

			System.out.println("Enter Contact id ");
			contact.setId(sc.nextInt());

			System.out.println("Enter Name");
			contact.setName(sc.next());

			System.out.println("Enter Mobile Number");
			contact.setPhoneNumber(sc.next());

			System.out.println("Enter Date Of birth(DD-MM-YYYY )");

			String dateformat = "DD-MM-YYYY";
			contact.setDateOfbirth(new SimpleDateFormat(dateformat).parse(sc.next()));

			allContact.add(contact);

		}
	}


	/** This Method shows all Contact and by using Java 8 feature list print */
	@Override
	public void listOfContact() {
		System.out.println("_____________________________________");

		allContact.forEach(s -> System.out.println(s));
		System.out.println("_____________________________________");
	}

	/** This Method update Contact by using Java 8 feature */
	@Override
	public void updateContact() throws ParseException {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("Enter Contact id which you want to update");
		int id = sc.nextInt();

		System.out.println("Enter Contact Name ");
		String name = sc.next();
		System.out.println("Enter Contact Number ");
		String number = sc.next();
		System.out.println("Enter Date of birth ");
		String dateformat = "DD-MM-YYYY";
		Date dob = new SimpleDateFormat(dateformat).parse(sc.next());

		allContact.stream().filter(n -> n.getId() == id).forEach(cname -> cname.setName(name));

		allContact.stream().filter(n -> n.getId() == id).forEach(cnumber -> cnumber.setPhoneNumber(number));
		allContact.stream().filter(n -> n.getId() == id).forEach(b -> b.setDateOfbirth(dob));

		System.out.println("_____________________________________");
		listOfContact();
		System.out.println("_____________________________________");
	}

	/** This Method Delete Contact by using Java 8 feature */

	@Override
	public void deleteContact() {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("Enter Contact id Which you want to delete");
		int id = sc.nextInt();
		allContact.removeIf(n -> n.getId() == id);

	}

	/** This Method Search Contact by ID number and use Java 8 feature */
	@Override
	public void searchContactById() {
		Scanner sc = ScannerUtility.getScanner();

		System.out.println("Enter contact id Which you want to show");
		int id = sc.nextInt();

		Contact c = allContact.stream().filter(n -> n.getId() == id).findAny().orElse(null);
		System.out.println("_____________________________________");

		System.out.println(c);
		System.out.println("_____________________________________");

	}

	/** This Method Search Contact by Name and use Java 8 feature */
	@Override
	public void searchContactByName() {
		Scanner sc = ScannerUtility.getScanner();

		System.out.println("Enter contact Name Which you want to show");
		String name = sc.next();

		Contact c = allContact.stream().filter(n -> n.getName().equals(name)).findFirst().orElse(null);
		System.out.println("_____________________________________");
		System.out.println(c);
		System.out.println("_____________________________________");

	}

	/** This Method Search Contact by Phone number and use Java 8 feature */
	@Override
	public void searchContactByNumber() {
		Scanner sc = ScannerUtility.getScanner();

		System.out.println("Enter contact Number Which you want to show");
		String number = sc.next();

		Contact c = allContact.stream().filter(n -> n.getPhoneNumber().equals(number)).findAny().orElse(null);
		System.out.println("_____________________________________");
		System.out.println(c);
		System.out.println("_____________________________________");
	}

}
