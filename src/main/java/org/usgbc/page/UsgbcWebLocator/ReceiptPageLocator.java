package org.usgbc.page.UsgbcWebLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.usgbc.driver.BaseClass;

public class ReceiptPageLocator extends BaseClass {

	 /*web element locator for reciept page PR=>Payment/Receipt */
	 
	@FindBy(xpath=".//*[@id='edit-submit-button-1-submit']")
	static WebElement PRPrint_Receipt;
	  	public static WebElement getPrintReceipt() {
	  			return PRPrint_Receipt;
	  	}
}
