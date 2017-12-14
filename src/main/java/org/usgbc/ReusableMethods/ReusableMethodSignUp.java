package org.usgbc.ReusableMethods;

import java.util.Random;

import org.usgbc.page.UsgbcWebLocator.SignUpPageLocator;

import com.github.javafaker.Faker;

public class ReusableMethodSignUp extends SignUpPageLocator{
	
	public static void signUpForm(String sheetName , int rowNum) throws Exception {
		
		String fname=reader.getCellData(sheetName, "firstname",rowNum);
		
		String lname=reader.getCellData(sheetName, "lastname",rowNum);
		
		String email=reader.getCellData(sheetName, "email",rowNum);
		
		String pass= reader.getCellData(sheetName, "password",rowNum);
		
		String cpass=reader.getCellData(sheetName, "cpassword",rowNum); 
		
		signup_usgbc(fname,lname,email,pass,cpass);	
	}
	
	private static String randomEmail() {
		
        Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		return "username"+ randomInt +"@gmail.com";
    }
	    
	public static void signUpForm() throws Exception {
		
		Faker faker = new Faker();
		String fname=faker.name().firstName();	
		//System.out.println(fname);
		String lname=faker.name().lastName();
		//System.out.println(lname);
		String email=randomEmail();
		String pass="initpass";
		String cpass="initpass"; 
		signup_usgbc(fname,lname,email,pass,cpass);
		
	}

}
