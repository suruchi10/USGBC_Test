package org.usgbc.page.UsgbcWebLocator;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.usgbc.driver.BaseClass;
import org.usgbc.driver.CommonMethods;

public class SignInPageLocator  extends BaseClass{
	
	//SI=> SignIn

	@FindBy(id="edit-existinguser-usernamae") static WebElement SIEusername;
	@FindBy(id="edit-existinguser-password") static WebElement SIEpassword;
	@FindBy(id="edit-submit") static WebElement SigninContinue;
	
	public static void signin_usgbc(String SIEusername , String SIEpassword) throws Exception  {
		
		CommonMethods.click("SIEusername");
		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Clicking on Existing username inputbox ");
	
		CommonMethods.sendKeys("SIEusername", SIEusername );
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering Existing username ");
 		
 		CommonMethods.sendKeys("SIEpassword", SIEpassword );
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering Existing password ");
 		
 		CommonMethods.click("SigninContinue");
		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Clicking on SigninContinue Button");
	}	
	
	@FindBy(linkText="Register Here.")static WebElement RegisterHere;
	public static WebElement getRegister() {
	  	return RegisterHere;
	}
	@FindBy(xpath="html/body/div[1]/div/div/div/div/div/h2")static WebElement status_message_signup;
	public WebElement getstatusMessageSignup() {
		return status_message_signup;
	}
	    	
	
	   
}
