package org.usgbc.business.Donation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.usgbc.ReusableMethods.ReusableMethodDonation;
import org.usgbc.driver.CommonMethods;

public class cfgsOnline extends ReusableMethodDonation {
	
	public cfgsOnline(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	
	public void DonateForcfgsByOnline() throws Exception {
		
		System.out.println("Donation module for cfgs Online");
		
		Thread.sleep(2000);
		driver.navigate().to(baseUrl+"/donations/center/online/cfgs");
		
//		common.click("DonateMailNav");
			
//		driver.navigate().back();
//		driver.get(baseUrl+"/donations/center/online/cfgs");
		
//		common.isDisplayed("HaitiLogo", "Donation for Haiti");
//		Thread.sleep(2000);
// 		common.testlog("Pass", "Donation for Haiti");
		
		CommonMethods.scrolldowntoElement("Donate_Nav");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass", "Scrolled till Donation Nav ");
 				
		donationByOnlineData("DonationByOnline",2);
		
		Assert.assertTrue(true);
		
		CommonMethods.assertEqualsMessage("PaymentInfo","Payment info","Verifying Navigation from Donation online page to Payment page");
		Thread.sleep(2000);
		CommonMethods.testlog("Pass","Navigation Verified Successfully");
	    
		paymentReceiptdownload();
	}

}
