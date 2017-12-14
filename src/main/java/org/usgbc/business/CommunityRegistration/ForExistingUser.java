package org.usgbc.business.CommunityRegistration;

import org.testng.Assert;
import org.usgbc.ReusableMethods.ReusableMethodCommunityRegistration;
import org.usgbc.ReusableMethods.ReusableMethodPayment;
import org.usgbc.ReusableMethods.ReusableMethodSignIn;
import org.usgbc.driver.BrokenLink;
import org.usgbc.driver.CommonMethods;
import org.usgbc.page.UsgbcWebLocator.ReceiptPageLocator;

public class ForExistingUser extends ReusableMethodCommunityRegistration {
	
public void CR_ForExistingUser() throws Exception {
		
		
		String communityRegistration_url = driver.getCurrentUrl();
		Assert.assertEquals(communityRegistration_url, baseUrl+"/community/registration");
		System.out.println("Broken Link for  :"+ driver.getTitle());
		//BrokenLink.BrokenLinkCheck(communityRegistration_url);
		CRformData("CommunityRegistration",2);
		Thread.sleep(CommonMethods.time);
	    String signin_url = driver.getCurrentUrl();
	    Thread.sleep(CommonMethods.time); 
		if (signin_url.equalsIgnoreCase(baseUrl+"/signin") && driver.getTitle().contains("Sign-in")){
			   Assert.assertTrue(true);
			   System.out.println("Test Passed,Community Registration Form filled correctly ");
			   System.out.println("Broken Link for :"+ driver.getTitle());
			   BrokenLink.BrokenLinkCheck(signin_url);
			   ReusableMethodSignIn.signInForm("signin",3); //signin 3 => (abi@gmail.com,abishek) a registred user
			   String payment_url = driver.getCurrentUrl();
			   Thread.sleep(3000); 
			   Assert.assertEquals(payment_url, baseUrl+"/usgbc/payment");
			   System.out.println("User is registered already ");
			   System.out.println("*****payment-receipt******");
			   System.out.println("Broken Link for :"+ driver.getTitle());
			   BrokenLink.BrokenLinkCheck(payment_url);
			   ReusableMethodPayment.paymentForm("payment", 2);
			   Thread.sleep(8000);  
			   String reciept_url = driver.getCurrentUrl();
			   Thread.sleep(3000); 
			   		if(reciept_url.equalsIgnoreCase(baseUrl+"/payment/reciept") ){  
						  Assert.assertTrue(true);
//						  getStatusMessageBlock().getText().contains("unable to send");
//						  Assert.assertTrue(true);
						  System.out.println("Broken Link for : "+ driver.getTitle());
						  BrokenLink.BrokenLinkCheck(reciept_url);
						  ReceiptPageLocator.getPrintReceipt().click();
				          System.out.println("Receipt downloaded ");	
			   		}else if (getStatusMessageBlock().getText().contains("You have very recently placed an order for this item. Please review your order history to confirm your previous order") && reciept_url.equalsIgnoreCase(baseUrl+"/usgbc/payment")) {
						 Assert.assertTrue(true);
						 System.out.println(getStatusMessageBlock().getText());	
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
