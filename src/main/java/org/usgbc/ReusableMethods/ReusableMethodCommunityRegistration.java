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
import org.usgbc.page.UsgbcWebLocator.CommunityRegistrationPageLocator;
import org.usgbc.page.UsgbcWebLocator.DonationPageLocator;

import com.github.javafaker.Faker;


public class ReusableMethodCommunityRegistration extends CommunityRegistrationPageLocator {

	
	//Community Registration 
	
	public void CRformData(String sheetName, int rowNum) throws Exception {
		
		String CRCommunityName=reader.getCellData(sheetName, "CRCommunityName", rowNum);
		
		String CRAttention=reader.getCellData(sheetName, "CRAttention", rowNum);
		
		String CRCompany=reader.getCellData(sheetName, "CRCompany", rowNum);
				
        String CRCountry= reader.getCellData(sheetName, "CRCountry",rowNum); 
		
		String CRStreetAddress= reader.getCellData(sheetName, "CRStreetAddress", rowNum);
		
		String CRStreetAddress2= reader.getCellData(sheetName, "CRStreetAddress2", rowNum);
		
		String CRCity= reader.getCellData(sheetName, "CRCity", rowNum);
		
		String CRZipcode= reader.getCellData(sheetName, "CRZipcode", rowNum); 
		
	    String CRState= reader.getCellData(sheetName, "CRState", rowNum);
	    
	    String CRSchool=reader.getCellData(sheetName, "CRSchool", rowNum);
		
		String CRStudentID=reader.getCellData(sheetName, "CRStudentID", rowNum);
		
		String CRGraduation=reader.getCellData(sheetName, "CRGraduation", rowNum);
		
		String CRBirthday=reader.getCellData(sheetName, "CRBirthday", rowNum);
		
		String CRDescribe=reader.getCellData(sheetName, "CRDescribe", rowNum);
		
		CRFormFields(CRCommunityName,CRAttention,CRCompany,CRCountry,CRStreetAddress,CRStreetAddress2,CRCity,CRZipcode,CRState,CRSchool,CRStudentID,CRGraduation,CRBirthday,CRDescribe);
	}
	

	
	
}
