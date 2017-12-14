package org.usgbc.page.UsgbcWebLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.usgbc.driver.BaseClass;
import org.usgbc.driver.CommonMethods;

public class DonationPageLocator extends BaseClass {  	
	  	
	/* Donation module */
	
	//Donation By Mail locators
	
	@FindBy(xpath=".//*[@id='donate-nav']/li[2]/a" )WebElement DonateMailNav;
	@FindBy(xpath=".//*[@id='usgbc-online-donation-id']/div/div[4]/div[1]/div/div[1]/div[1]/h2" )WebElement DonationByMail;
	@FindBy(xpath=".//*[@id='edit-other-amount']" )WebElement DonationAmount;
	@FindBy(xpath=".//*[@id='edit-donor-name']" )WebElement DonorName;
	@FindBy(xpath=".//*[@id='edit-dedication-to-name']" )WebElement DedicatedTo;
	@FindBy(xpath=".//*[@id='edit-dedication-to-email']" )WebElement Email;
	@FindBy(xpath=".//*[@name='address[country_code]']" )WebElement Country;
	@FindBy(xpath=".//*[@name='address[address_line1]']" )WebElement StreetAddressLine1;
	@FindBy(xpath=".//*[@name='address[address_line2]']" )WebElement StreetAddressLine2;
	@FindBy(xpath=".//*[@name='address[locality]']" )WebElement City;
	@FindBy(xpath=".//*[@name='address[administrative_area]']" )WebElement State;
	@FindBy(xpath=".//*[@name='address[postal_code]']" )WebElement Zip;
	
	@FindBy(xpath=".//*[@id='edit-submit']" )WebElement Continue;
	
	
	public void donationByMailFormFields(String DonationAmount,String DonorName, String DedicatedTo,String Email,String Country,String StreetAddressLine1,String  StreetAddressLine2 ,String City,String Zip  ) throws Exception {
		
	 	CommonMethods.sendKeys("DonationAmount", DonationAmount );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Donation Amount ");
	 		
	 	CommonMethods.sendKeys("DonorName", DonorName );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Donor Name ");
	 		
	 	CommonMethods.sendKeys("DedicatedTo", DedicatedTo );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Dedicated to ");
	 		
	 	CommonMethods.sendKeys("Email", Email );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering email");
	 		
 		CommonMethods.scrolldowntoElement("Country");
	 		
 		CommonMethods.selectdropdown("Country", Country);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Country ");
	 		
	 	CommonMethods.sendKeys("StreetAddressLine1", StreetAddressLine1 );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Street Address Line 1 ");
	 		
		CommonMethods.sendKeys("StreetAddressLine2", StreetAddressLine2 );
 		Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Street Address Line 2 ");
	 		
	 	CommonMethods.sendKeys("City", City);
		Thread.sleep(3000);
		CommonMethods.testlog("Pass", "Entering City ");
	 		
	 	CommonMethods.sendKeys("Zip", Zip);
		Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Zip ");
	 		
	 	CommonMethods.selectdropdownrandom("State");
		Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering State ");
	 		
	 	CommonMethods.click("Continue");
	 	CommonMethods.testlog("Pass", "Clicking Continue ");
	 		
	 	//CommonMethods.waitForJsToLoad();
	 		
	 	Thread.sleep(CommonMethods.time);
	 	
	 }
	
	// Donationn page Logo
	
	@FindBy(xpath=".//*[@src='https://qas.usgbc.org/sites/all/themes/secluded/lib/img/promos/haiti/logo.gif']" )WebElement HaitiLogo;
	@FindBy(xpath=".//*[@src=\"https://qas.usgbc.org/sites/all/themes/secluded/lib/img/logo.gif\"]" )WebElement UsgbcLogo;
	//@FindBy(xpath="" )WebElement CfgsLogo;
	//@FindBy(xpath="" )WebElement mygreenappleLogo;
	@FindBy(xpath=".//*[@id='usgbc-online-donation-id']/div/div[3]" )WebElement Donate_Nav;
	
	//Donation By Online locators
	
	@FindBy(xpath=".//*[@id='donate-nav']/li[1]/a/span" )WebElement DonateOnlineNav;
	@FindBy(xpath=".//*[@id='usgbc-online-donation-id']/div/div[4]/div[1]/div/div[1]/div[1]/h2" )WebElement DonationDetails;
	@FindBy(xpath=".//*[@name='choose_amount']" )WebElement YourContribution;
	@FindBy(xpath=".//*[@name='other_amount']" )WebElement OtherAmount;
	@FindBy(xpath=".//*[@name='donor_name']" )WebElement DonorName_online;
	@FindBy(xpath=".//*[@name='donor_name']" )WebElement Name;
	@FindBy(xpath=".//*[@id='edit-dedication-to-email']" )WebElement Email_online;
	@FindBy(xpath=".//*[@name='dedication_to_message']" )WebElement Message;
	
	public void donationByOnlineFromFields(String YourContribution,String DonorName_online, String Name,String Email_online,String Message) throws Exception {
			
		CommonMethods.sendKeys("YourContribution", YourContribution );
		Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Your Contribution ");
	 		
	 	CommonMethods.sendKeys("DonorName", DonorName_online );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Donor Name ");
	 	
	 	CommonMethods.sendKeys("Name", Name );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Name ");
	 		
	 	CommonMethods.sendKeys("Email", Email_online );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Email");
	 		
	 	CommonMethods.sendKeys("Message", Message );
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Entering Donation Amount ");
	 		
	 	CommonMethods.click("Continue");
	 	CommonMethods.testlog("Pass", "Clicking Continue ");
	 	Thread.sleep(CommonMethods.time);
	 		
	 	CommonMethods.waitForJsToLoad();
	 	
	}	
}