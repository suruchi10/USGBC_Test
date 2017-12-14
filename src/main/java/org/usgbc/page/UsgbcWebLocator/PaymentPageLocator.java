package org.usgbc.page.UsgbcWebLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.usgbc.driver.BaseClass;
import org.usgbc.driver.CommonMethods;

public class PaymentPageLocator extends BaseClass {
	
	//UP=> usgbc/Payment
	
	@FindBy(id="edit-payment-type-card")static WebElement credit_card;
	@FindBy(id="edit-payment-type-check")static WebElement check;
	@FindBy(id="edit-name-on-card")static WebElement UPname_on_card;
	@FindBy(id="edit-card-number")static WebElement UPCard_number;
	@FindBy(id="edit-cardexpiration-month")static WebElement UPMonth;
	@FindBy(id="edit-cardexpiration-year")static WebElement UPYear;
	@FindBy(id="edit-security-code")static WebElement UPSecurity_code;
	@FindBy(xpath=".//*[@name='billing_address[country_code]']")static WebElement UPBilling_country;
	@FindBy(xpath=".//*[@class='address-line1 form-text required']")static WebElement UPBilling_street_address;
	@FindBy(xpath=" .//*[@class='address-line2 form-text required']")static WebElement UPBilling_street_address2;
	@FindBy(xpath=".//*[@class='locality form-text required']")static WebElement UPBilling_city;
	@FindBy(xpath=".//*[@class='postal-code form-text required']")static WebElement UPBilling_pin_code;
	@FindBy(xpath=".//*[@class='administrative-area form-select required']")static WebElement UPBilling_state;
	@FindBy(xpath=".//*[@id='edit-payment-submit']")static WebElement SubmitPayment;

	public static void payment_usgbc(String UPname_on_card , String UPCard_number, String UPMonth, String UPYear,String UPSecurity_code,
		   String UPBilling_country,String UPBilling_street_address,String UPBilling_street_address2,String UPBilling_city,
		   String UPBilling_pin_code,String UPBilling_state ) throws Exception   {
		
		CommonMethods.sendKeys("UPname_on_card", UPname_on_card );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Name On Card ");
 		
 		CommonMethods.sendKeys("UPCard_number", UPCard_number );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Card Number");
		
 		CommonMethods.sendKeys("UPMonth", UPMonth );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Month");
 		
 		CommonMethods.sendKeys("UPYear", UPYear );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering year");
 		
 		CommonMethods.sendKeys("UPSecurity_code", UPSecurity_code );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Security code");
		 
 		CommonMethods.selectdropdown("UPBilling_country",UPBilling_country);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Billing Country");
			
 		CommonMethods.click("UPBilling_street_address");
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking into Billing address Input Box");
		
 		CommonMethods.sendKeys("UPSecurity_code", UPSecurity_code );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Security code");
 		
 		CommonMethods.sendKeys("UPBilling_street_address",UPBilling_street_address);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering street address");
 		
 		CommonMethods.sendKeys("UPBilling_street_address2",UPBilling_street_address2);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering street address line 2");

 		CommonMethods.sendKeys("UPBilling_city",UPBilling_city);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering City");
 		
 		CommonMethods.sendKeys("UPBilling_pin_code",UPBilling_pin_code);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Pin code");
 		
 		CommonMethods.sendKeys("UPBilling_state",UPBilling_state);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering State");
 		
 		CommonMethods.click("SubmitPayment");
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking submit ");
			
 		
	}
	   
	/*public void payment_usgbc_Membership(String n_o_c , String c_n, String mon, String yea,String s_code,
			   String billing_coun,String billing_street_add,String billing_street_add2 )  {   
		try {
			Thread.sleep(3000);
			name_on_card.sendKeys(n_o_c);
			card_number.sendKeys(c_n); 
			month.sendKeys(mon);
			year.sendKeys(yea);
			security_code.sendKeys(s_code);
			Thread.sleep(5000);
			Select select = new Select(billing_country);
		 	select.selectByVisibleText(billing_coun);
		 	Thread.sleep(3000);
			billing_street_address.click();
			billing_street_address.sendKeys(billing_street_add);
			billing_street_address2.sendKeys(billing_street_add2);
			submit_payment.click();
			//Thread.sleep(3000);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	   
	// Receipt Page print Button xpath
	   
	@FindBy(xpath=".//*[@id='edit-submit-button-1-submit']")
	static WebElement print_Receipt;
		public static WebElement getPrintReceipt() {
			return print_Receipt;
		}
	  	
	//html/body/div[1]/div/div/div/div[2]/div
	//html/body/div[1]/div/div/div/div/div	
	//html/body/div[1]/div/div/div/div
	@FindBy(xpath="html/body/div[1]/div/div/div/div[2]/div")
	static WebElement status_message_usgbc_payment;
	 	public static WebElement getstatusMessageUsgbcPayment() {
				return status_message_usgbc_payment;
	 	}
	 	
	@FindBy(xpath="html/body/div[1]/div/div/div/div/div/h2")
	static WebElement status_message_signup;
		public static WebElement getstatusMessageSignup() {
			return status_message_signup;
		}
}
