package com.syntax.class16;

public class Account {
	
	private String userName;
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance;
	
	public void setUserName(String accountUserName) {
		if(accountUserName.length()<16) {
			userName=accountUserName;
		}else {
			System.out.println("User name of this length is not allowed");
		}
	}
		public void setPassword(String accountPass) {
			if(accountPass.length()<16) {
				password=accountPass;
			}else {
				System.out.println("Password of this length is not allowed");
			}
			
			
		}
		
		
	
	public void  getBalance(String accountUserName, String accountPassword) {
		if(userName.equals(accountUserName) && password.equals(accountPassword)){
			System.out.println(accountBalance);
		}else {
			System.out.println("User name or password is not correct");
		}
		
	}


}
