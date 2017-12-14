package org.usgbc.regression.CommunityRegistration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.usgbc.business.CommunityRegistration.ForNonExistingUser;
import org.usgbc.driver.BaseClass;
import org.usgbc.driver.BrokenLink;

import com.relevantcodes.extentreports.LogStatus;

public class forNonExistingUserTest extends BaseClass {
	
	@Test(priority=0)
	public void testForNonExistingUser() throws Exception {
		
		System.out.println("Communtiy Registration Module for non existing user");
		System.out.println("Broken Link for :" + driver.getTitle());
		BrokenLink.BrokenLinkCheck(baseUrl);
		
	    ForNonExistingUser fneu = PageFactory.initElements(driver, ForNonExistingUser.class);    
	    try {
	    	test= extent.startTest("Communtiy Registration Module for non existing user");
	    	test.log(LogStatus.INFO, "Test Started");
	    	fneu.CR_ForNonExistingUser();
	    	System.out.println("Communtiy Registration Module for non existing user Test Finished");
		} catch (Throwable t) {
			System.out.println(t.getLocalizedMessage());
			Error e1 = new Error(t.getMessage());
			e1.setStackTrace(t.getStackTrace());
			throw e1;
		 }
	}

}
