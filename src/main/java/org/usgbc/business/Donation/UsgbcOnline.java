package org.usgbc.business.Donation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.usgbc.ReusableMethods.ReusableMethodDonation;
import org.usgbc.driver.CommonMethods;

public class UsgbcOnline extends ReusableMethodDonation {
	
	public UsgbcOnline(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public void DonateForUsgbcByOnline() throws Exception {
		
		System.out.println("Donation module for USGBC Online");
		
		//driver.navigate().to(baseUrl+"/donations/center/online/usgbc");
		driver.get(baseUrl+"/donations/center/online/usgbc");
		
		CommonMethods.isDisplayed("UsgbcLogo", "Donation for USGBC");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass", "Donation for USGBC");
		
		CommonMethods.scrolldowntoElement("Donate_Nav");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass", "Scrolled till Donation Nav");
 		
 		donationByOnlineData("DonationByOnline",3);
	
		Assert.assertTrue(true);
		
		CommonMethods.assertEqualsMessage("PaymentInfo","Payment info","Verifying Navigation from Donation online page to Payment page");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass","Navigation Verified Successfully");
	    
		paymentReceiptdownload();
	}

}
