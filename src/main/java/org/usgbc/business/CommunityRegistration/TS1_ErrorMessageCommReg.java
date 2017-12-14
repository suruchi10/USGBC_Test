package org.usgbc.business.CommunityRegistration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.usgbc.driver.CommonMethods;
import org.usgbc.page.UsgbcWebLocator.CommunityRegistrationPageLocator;

public class TS1_ErrorMessageCommReg extends CommunityRegistrationPageLocator {
	
	public void CommunityRegistrationErrorMessage () throws Exception
	{
		String[] CommunityRegistrationErrorMsg = { 
			    "Street address field is required.", 
                "Street address line 2 field is required.", 
                "City field is required.", 
                "State field is required.",
                "Zip code field is required.",
                "Please mention how did you hear about the product.",
                "Please agree to our terms.",
               };
		 CommonMethods.click("communityRegistration");
		 Thread.sleep(CommonMethods.time);
	 	 CommonMethods.testlog("Pass", "Clicking Community Registration link");
	 
	 	 CommonMethods.click("Continue");
	 	 Thread.sleep(CommonMethods.time);
	 	 CommonMethods.testlog("Pass", "Continue Button Pressed");
	 	 
	 	 CommonMethods.scrolldowntoElement(".//*[@id='edit-address']/div[3]/div[1]/label");
	 	 Thread.sleep(CommonMethods.time);
		 
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
