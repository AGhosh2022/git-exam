package com.app.phoneBook.exception;

public class DuplicateNumberException extends Exception {

	public DuplicateNumberException() {
		super("Number Allraedy Exit");
	}

	public DuplicateNumberException(String message) {
		super(message);
	}

}
