package com.exception;

public class AccountLockUserDefinedException extends Exception {
	
	AccountLockUserDefinedException(String message){
		super(message);
	}
}
