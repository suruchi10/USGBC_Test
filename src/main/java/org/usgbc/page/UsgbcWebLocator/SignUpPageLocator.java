package org.usgbc.page.UsgbcWebLocator;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.usgbc.driver.BaseClass;
import org.usgbc.driver.CommonMethods;

public class SignUpPageLocator extends BaseClass{
	
	//SU=> SignUp
	
	@FindBy(id="edit-first-name")static WebElement SUFirstname;
	@FindBy(id="edit-last-name")static WebElement SULastname;
	@FindBy(id="edit-email")static WebElement SUEmail;
	@FindBy(id="edit-password")static WebElement SUPassword;
	@FindBy(id="edit-confirm-password")static WebElement SUConfirm_password;
	@FindBy(id="edit-submit")static WebElement RegisterContinue;
	@FindBy(how=How.LINK_TEXT , using ="Sign in")static WebElement Signin;

	public static void signup_usgbc(String SUFirstname,String SULastname,String SUEmail,String SUPassword ,String SUConfirm_password) throws Exception {
		 
		CommonMethods.click("SUFirstname");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass", "Clicking on FirstName Inputbox ");
		 
		CommonMethods.sendKeys("SUFirstname",SUFirstname);
		Thread.sleep(2000);
	 	CommonMethods.testlog("Pass", "Entering Firstname");
	 		
	 	CommonMethods.sendKeys("SULastname",SULastname);
		Thread.sleep(2000);
	 	CommonMethods.testlog("Pass", "Entering Lastname");
	 	 
	 	CommonMethods.sendKeys("SUEmail",SUEmail);
		Thread.sleep(2000);
	 	CommonMethods.testlog("Pass", "Entering Email");
	 	 
	 	CommonMethods.sendKeys("SUPassword",SUPassword);
		Thread.sleep(2000);
	 	CommonMethods.testlog("Pass", "Entering Password");
	 	 
	 	CommonMethods.sendKeys("SUConfirm_password",SUConfirm_password);
		Thread.sleep(2000);
	 	CommonMethods.testlog("Pass", "Entering Confirm_password");
	 	 
	 	CommonMethods.click("RegisterContinue");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass", "Clicking on RegisterContinue ");
	
	 }

}
