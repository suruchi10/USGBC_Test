package org.usgbc.ReusableMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.usgbc.driver.BrokenLink;
import org.usgbc.page.UsgbcWebLocator.PaymentPageLocator;
import org.usgbc.page.UsgbcWebLocator.SignUpPageLocator;

public class ReusableMethodPayment extends PaymentPageLocator {
	
    public static void paymentForm(String sheetName, int rowNum) throws Exception {
		
		String name_on_card= reader.getCellData(sheetName, "name_on_card",rowNum);
		
		String card_number= reader.getCellData(sheetName, "card number", rowNum);
		
		String month= reader.getCellData(sheetName, "month", rowNum);
		
		String year= reader.getCellData(sheetName, "year", rowNum);
		
		String security_code= reader.getCellData(sheetName, "security_code", rowNum);
		
		String billing_country= reader.getCellData(sheetName, "country", rowNum);
		
		String billing_street_address= reader.getCellData(sheetName, "street_address", rowNum);
		
		String billing_street_address2= reader.getCellData(sheetName, "street_address2", rowNum);
		
		String billing_city= reader.getCellData(sheetName, "city", rowNum);
		
		String billing_pin_code= reader.getCellData(sheetName, "pincode", rowNum);
		
		String billing_state= reader.getCellData(sheetName, "state", rowNum);
		
		payment_usgbc( name_on_card , card_number, month, year, security_code, billing_country, billing_street_address, billing_street_address2, billing_city, billing_pin_code, billing_state);
					
	}
    
    public static void  paymentReceiptdownload() throws Exception {
    	
		paymentForm("payment", 2);
		Thread.sleep(8000);  
		String reciept_url = driver.getCurrentUrl();
		if( getstatusMessageUsgbcPayment().isDisplayed() && reciept_url.equalsIgnoreCase(baseUrl+"/usgbc/payment")){ 
			if(getstatusMessageUsgbcPayment().getAttribute("innerHTML").contains("User not found")) {
				Assert.assertTrue(true);
				System.out.println(getstatusMessageUsgbcPayment().getText());  
		    }else if( getstatusMessageUsgbcPayment().getAttribute("innerHTML").contains("To prevent misorders, the same item may not be purchased twice within 24 hours. Questions? Call (800 number)")) {
		        Assert.assertTrue(true);
		        System.out.println(getstatusMessageUsgbcPayment().getText());
		 	}else if (getstatusMessageUsgbcPayment().getAttribute("innerHTML").contains(("The address you entered is invalid: The region Har is not defined for country IN"))) {
		 		Assert.assertTrue(true);
		 		System.out.println(getstatusMessageUsgbcPayment().getText()); 
		 	}
	    }else if(reciept_url.equalsIgnoreCase(baseUrl+"/payment/reciept")){  
	    	Assert.assertTrue(true);
			System.out.println("Broken Link for : "+ driver.getTitle());
			BrokenLink.BrokenLinkCheck(reciept_url);
			getPrintReceipt().click();
	        System.out.println("Receipt downloaded ");
	     }else if (reciept_url.equalsIgnoreCase(baseUrl+"/usgbc/payment")) {
			Assert.assertTrue(true);
			System.out.println("Error in payment form submission. ");
	     }
	}
    
    @FindBy(linkText="Register Here.")static WebElement register;
	public static WebElement getRegister() {
	  	return register;
	}
	
    public static void contactPaymentReceipt() throws Exception {
    	
		String Signin_url = driver.getCurrentUrl();
			if (Signin_url.equalsIgnoreCase(baseUrl+"/signin")) {
				Assert.assertTrue(true);
				System.out.println("This user does not exist in the system. ");
				getRegister().click();
				Thread.sleep(3000);
				String signup_url = driver.getCurrentUrl();
				System.out.println("Broken Link for : "+ driver.getTitle());
				BrokenLink.BrokenLinkCheck(signup_url);
				ReusableMethodSignUp.signUpForm("signup",  3);
				Thread.sleep(3000);
				String payment_url = driver.getCurrentUrl();
					if(payment_url.equalsIgnoreCase(baseUrl+"/usgbc/payment")) {
						Assert.assertTrue(true); 
						System.out.println("User registered and created sucessfully");
						System.out.println("Broken Link for : "+ driver.getTitle());
						BrokenLink.BrokenLinkCheck(payment_url);
						paymentReceiptdownload();
					}else {
						Assert.assertTrue(getstatusMessageSignup().getAttribute("innerHTML").contains("This user already exist in the system. Please sign in."));
						System.out.println("Error in signup form submission"); 
					}   
			}else {
				Assert.assertEquals(Signin_url, baseUrl+"/usgbc/payment");   
				System.out.println("User is registered already ");
				System.out.println("Broken Link for : "+ driver.getTitle());
				BrokenLink.BrokenLinkCheck(Signin_url);
				paymentReceiptdownload();
			}   
    }
  
}
