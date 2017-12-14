package org.usgbc.business.Donation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.usgbc.ReusableMethods.ReusableMethodDonation;
import org.usgbc.driver.CommonMethods;


public class HaitiMail extends ReusableMethodDonation {
	
	public HaitiMail(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void DonateForHaitiByMail() throws Exception {
		
		System.out.println("Donation module for Haiti Mail");
		
		driver.navigate().to(baseUrl+"/donations/center/online/haiti");
		//driver.get(baseUrl+"/donations/center/mail/haiti");
		
//		common.isDisplayed("HaitiLogo", "Donate for Haiti");
//		Thread.sleep(2000);
// 		common.testlog("Pass", "Donation for Haiti");
		
		CommonMethods.scrolldowntoElement("Donate_Nav");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass", "Scrolled till Donation Online Nav ");
 		
		CommonMethods.click("DonateMailNav");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass", "Clicked on Donation Mail Nav ");
		
		CommonMethods.assertEqualsMessage("DonationByMail","Donate by mail","Verifying Navigation from Donate Online Nav to Donate Mail Nav");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass","Navigation Verified Successfully");
 		
		CommonMethods.assertEqualsMessage("DonationDetails","Donate by mail","Verifying  page load with text apperance");
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass","Navigation Verified Successfully");
		
		donationByMailData("DonationByMail",3);
		
		Assert.assertTrue(true);
		
		System.out.println("Form printed Successfully");	
	}

}
