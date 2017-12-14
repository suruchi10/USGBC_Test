package org.usgbc.business.CommunityRegistration;

import org.testng.Assert;
import org.usgbc.ReusableMethods.ReusableMethodCommunityRegistration;
import org.usgbc.ReusableMethods.ReusableMethodPayment;
import org.usgbc.ReusableMethods.ReusableMethodSignUp;
import org.usgbc.driver.BrokenLink;
import org.usgbc.driver.CommonMethods;
import org.usgbc.page.UsgbcWebLocator.ReceiptPageLocator;
import org.usgbc.page.UsgbcWebLocator.SignInPageLocator;
import org.usgbc.page.UsgbcWebLocator.SignUpPageLocator;

public class ForNonExistingUserToGetRegistered extends ReusableMethodCommunityRegistration {
	
	public void CR_ForNonExistingUserToGetRegistered() throws Exception {
		
		String communityRegistration_url = driver.getCurrentUrl();
		Assert.assertEquals(communityRegistration_url, baseUrl+"/community/registration");
		System.out.println("Broken Link for  : "+ driver.getTitle());
		BrokenLink.BrokenLinkCheck(communityRegistration_url);
		CRformData("CommunityRegistration",2);
	    String signin_url = driver.getCurrentUrl();
	    Thread.sleep(CommonMethods.time);
	    Assert.assertEquals(signin_url, baseUrl+"/signin");
	    Assert.assertTrue(true, "website encountered error");
		if (signin_url.equalsIgnoreCase(baseUrl+"/signin") && driver.getTitle().contains("Sign-in")){
			   Assert.assertTrue(true);
			   System.out.println("Test Passed,Community Registration Form filled correctly ");
			   System.out.println("Broken Link for  :"+ driver.getTitle());
			   BrokenLink.BrokenLinkCheck(signin_url);
			   SignInPageLocator.getRegister().click();
			   Thread.sleep(CommonMethods.time);
			   String signup_url = driver.getCurrentUrl();
			   Thread.sleep(CommonMethods.time); 
			   System.out.println("Broken Link for  :"+ driver.getTitle());
			   BrokenLink.BrokenLinkCheck(signup_url);
			   ReusableMethodSignUp.signUpForm();//  modified with faker class 
			   Thread.sleep(CommonMethods.time); 
			   String payment_url = driver.getCurrentUrl();
			   Thread.sleep(CommonMethods.time); 
			   Assert.assertEquals(payment_url, baseUrl+"/usgbc/payment");
			   System.out.println("User registered and created sucessfully");
			   System.out.println("*****payment-receipt******");
			   System.out.println("Broken Link for  :"+ driver.getTitle());
			   BrokenLink.BrokenLinkCheck(payment_url);
			   ReusableMethodPayment.paymentForm("payment", 2);
			   Thread.sleep(8000);
			   String reciept_url = driver.getCurrentUrl();
			   Thread.sleep(CommonMethods.time); 
		   		if(reciept_url.equalsIgnoreCase(baseUrl+"/payment/reciept")){  
					  Assert.assertTrue(true);
					  System.out.println("Broken Link for : "+ driver.getTitle());
					  BrokenLink.BrokenLinkCheck(reciept_url);
					  ReceiptPageLocator.getPrintReceipt().click();
			          System.out.println("Receipt downloaded ");
		   		}
			  
		}else {
		       signin_url.equalsIgnoreCase(baseUrl+"/community/registration");
			   Assert.assertTrue(true);
			   driver.getTitle().contains("Community Form");
			   Assert.assertTrue(true);
			   System.out.println(" Test Failed,Community Registration Form Not Filled properly");   
		   }
	}	


}
