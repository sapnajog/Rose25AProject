package com.exception;

public class LoginService {
	boolean isAccountLock = false;
	public void login(String uName,String pwd)throws AccountLockUserDefinedException {
		if(isAccountLock) {
			throw new AccountLockUserDefinedException("Your account is lock");
		}
		else {
			System.out.println("login success");
		}
		
	}
    public static void main(String[] args) throws AccountLockUserDefinedException {
    	LoginService loginService = new LoginService();
    	try{
    		loginService.login("sapna","1234");
    	}catch(Exception e){
    		e.printStackTrace();
    		
    	}
    	}
}
 
