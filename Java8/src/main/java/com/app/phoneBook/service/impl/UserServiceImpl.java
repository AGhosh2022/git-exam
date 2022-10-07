package com.app.phoneBook.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.phoneBook.pojo.User;
import com.app.phoneBook.service.UserService;
import com.app.phoneBook.utility.ScannerUtility;

public class UserServiceImpl implements UserService {
	
	List <User> allUser = new ArrayList<User>();
	private Scanner sc = ScannerUtility.getScanner();
		
	
	/** This  is Login Method For users and use Java 8 feature  */
		public User login() {
			System.out.println("Enter UserName");
			String  username = sc.next();
			System.out.println("Enter Password");
			String password = sc.next();
			
			User c=allUser.stream().filter(f->f.getLoginName().equals(username) && f.getPassword().equals(password)).findAny().orElse(null);

			return (c);
			
		}

	

}
