package com.greatlearning.itsupport.model;

import java.util.Random;

public class Service {
	
	public String generateEmailID(String FirstName, String LastName, String Department)
	{
		return FirstName.concat(LastName)+"@"+Department+".greatlearning.com";
	}
	
	public char[] generatePassword()
	{
		String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String SpecialCharacters = "~`!@#$%^&*()-_=+[{]}|;:'\",<.>/?";
		
		String Values = CapitalLetters + SmallLetters + Numbers + SpecialCharacters;
		
		Random random = new Random();
		
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			password[i] = Values.charAt(random.nextInt(Values.length()));
		}
		return password;
	}
	
	public void showCredentials(Employee employee, String email, char[] Newpassword) {
		System.out.println("Please find your new credentials:");
		System.out.println("Your EmailID is:" + email);
		System.out.println("Your Password is:" + Newpassword);	
	}

}
