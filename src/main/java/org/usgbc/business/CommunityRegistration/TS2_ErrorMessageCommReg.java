package org.usgbc.business.CommunityRegistration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.usgbc.driver.CommonMethods;
import org.usgbc.page.UsgbcWebLocator.CommunityRegistrationPageLocator;

public class TS2_ErrorMessageCommReg  extends CommunityRegistrationPageLocator {

	public void CommunityRegistrationErrorMessageCondition2 () throws Exception
	{
		String[] CommunityRegistrationErrorMsg = { 
			    "Street address field is required.", 
                "Street address line 2 field is required.", 
                "City field is required.", 
                "State field is required.",
                "Zip code field is required.",
                "Please enter your school.",
                "Please enter your student id",
                "Please enter your graduation date.",
                "Please mention how did you hear about the product.",
                "Please agree to our terms."
               }; 
		
		CommonMethods.click("communityRegistration");
		Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Clicking Community Registration link");
	 	 
	 	CommonMethods.click("CRFullTimeStudentYes");
		Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Clicking Is Student option button for yes");
	    
	    CommonMethods.click("Continue");
	 	Thread.sleep(CommonMethods.time);
	 	CommonMethods.testlog("Pass", "Continue Button Pressed");
	 	
		List<WebElement> ErrorMsgSize =  driver.findElements(By.className("input-error-desc"));
	    	System.out.println("***** "+ErrorMsgSize.size());
	        int i = 0;
	        for (WebElement ErrorMsg : ErrorMsgSize) {
	            System.out.println("**** "+ErrorMsg.getText());
	            if(ErrorMsg.getText().equals("")){
	               
	            	continue;
	            }
	            else
	                Assert.assertTrue(ErrorMsg.getText().contains(CommunityRegistrationErrorMsg[i]));
	                		//equalsIgnoreCase(CommunityRegistrationErrorMsg[i]));
	            
	            i++;
	        }    
	}   
}
