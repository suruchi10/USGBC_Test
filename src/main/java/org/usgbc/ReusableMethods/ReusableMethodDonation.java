package org.usgbc.ReusableMethods;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.usgbc.driver.BrokenLink;
import org.usgbc.page.UsgbcWebLocator.DonationPageLocator;
import com.github.javafaker.Faker;


public class ReusableMethodDonation extends DonationPageLocator {

	//Donation By mail
	
	public void donationByMailData(String sheetName, int rowNum) throws Exception {
		
		String DonationAmount= reader.getCellData(sheetName, "Donation amount",rowNum); 
		
		String DonorName= reader.getCellData(sheetName, "Donor Name", rowNum);
		
		String DedicatedTo= reader.getCellData(sheetName, "Dedicated to",rowNum); 
		
		String Email= reader.getCellData(sheetName, "Email", rowNum);
		
		String Country= reader.getCellData(sheetName, "Country",rowNum); 
		
		String StreetAddressLine1= reader.getCellData(sheetName, "Street address line1", rowNum);
		
		String StreetAddressLine2= reader.getCellData(sheetName, "Street address line2", rowNum);
		
		String City= reader.getCellData(sheetName, "City", rowNum);
		
	    // String State= reader.getCellData(sheetName, "State", rowNum);
		
		String Zip= reader.getCellData(sheetName, "Zip code", rowNum);
		
		donationByMailFormFields(DonationAmount,DonorName,DedicatedTo,Email,Country,StreetAddressLine1,StreetAddressLine2,City,Zip);
		
	}
	
	//Donation By Online 
	
	public void donationByOnlineData(String sheetName, int rowNum) throws Exception {
		
		String YourContribution= reader.getCellData(sheetName, "Your contribution",rowNum); 
		
		String DonorName= reader.getCellData(sheetName, "Donor name", rowNum);
		
		String Name= reader.getCellData(sheetName, "Name",rowNum); 
		
		String Email= reader.getCellData(sheetName, "Email", rowNum);
		
		String Message= reader.getCellData(sheetName, "Message",rowNum); 
		
		donationByOnlineFromFields(YourContribution,DonorName,Name,Email,Message);
		
	}
	
	
}
