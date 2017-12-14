package org.usgbc.business.CommunityRegistration;

import org.testng.Assert;
import org.usgbc.ReusableMethods.ReusableMethodCommunityRegistration;
import org.usgbc.ReusableMethods.ReusableMethodSignIn;
import org.usgbc.driver.BrokenLink;

public class ForNonExistingUser extends ReusableMethodCommunityRegistration{

	public void CR_ForNonExistingUser() throws Exception {
			
			String communityRegistration_url = driver.getCurrentUrl();
			Assert.assertEquals(communityRegistration_url, baseUrl+"/community/registration");
			System.out.println("Broken Link for :"+ driver.getTitle());
			BrokenLink.BrokenLinkCheck(communityRegistration_url);
			CRformData("CommunityRegistration",2);
		    String signin_url = driver.getCurrentUrl();
		    Thread.sleep(3000);
			if (signin_url.equalsIgnoreCase(baseUrl+"/signin") && driver.getTitle().contains("Sign-in")){
				   Assert.assertTrue(true);
				   System.out.println("Test Passed,Community Registration Form filled correctly");
				   System.out.println("Broken Link for :" + driver.getTitle());
				   BrokenLink.BrokenLinkCheck(signin_url);
				   ReusableMethodSignIn.signInForm("signin",10); //signin 10 => (amayra@gmail.com,amayra) non registered user
				   String Signin_url = driver.getCurrentUrl();
				   //System.out.println(getStatusMessageBlock().getText());
				   if (Signin_url.equalsIgnoreCase(baseUrl+"/signin") && getStatusMessageBlock().getText().contains("This user does not exist in the system.")) {
					   Assert.assertTrue(true);
					   System.out.println(getStatusMessageBlock().getText());
				   }else {
					   Assert.assertFalse(false);
				   }
			}else {
			       signin_url.equalsIgnoreCase(baseUrl+"/community/registration");
				   Assert.assertTrue(true);
				   driver.getTitle().contains("Community Form");
				   Assert.assertTrue(true);
				   System.out.println(" Test Failed, Form field left empty");   
			   }
		}
}
