package com.app.phoneBook;

import java.util.Scanner;

import com.app.phoneBook.service.impl.PhoneBookServiceImpl;

public class Menu {

	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(System.in);

			PhoneBookServiceImpl contact = new PhoneBookServiceImpl();

			System.out.println("---------------------*****---------------------");
			System.out.println("--------------Welcome to PhoneBook--------------");
			System.out.println("---------------------*****---------------------");
			while (true) {
				System.out.println("1 Add Contact");
				System.out.println("2 Contact list");
				System.out.println("3 Update Contact");
				System.out.println("4 Search ContactById");
				System.out.println("5 Search ContactByName");
				System.out.println("6 Search ContactByNumber");
				System.out.println("7 Delete Contact");
				System.out.println("8 logut");

				System.out.println("Select any one Option");
				int option = scanner.nextInt();

				switch (option) {
				case 1:
					try {
						contact.addContact();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:

					try {
						contact.listOfContact();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					try {
						contact.updateContact();
					} catch (Exception e) {

					}
					break;
				case 4:
					try {
						contact.searchContactById();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 5:
					try {
						contact.searchContactByName();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 6:
					try {
						contact.searchContactByNumber();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 7:
					try {
						contact.deleteContact();
					} catch (Exception e) {

					}
					break;
				case 8:
					System.out.println("Yor are Exit");
					System.exit(0);
					break;

				default:
					System.out.println("You Enter Wrong Input Try Letter");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}