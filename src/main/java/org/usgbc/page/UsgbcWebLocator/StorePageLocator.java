package org.usgbc.page.UsgbcWebLocator;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.usgbc.driver.BaseClass;
import org.usgbc.driver.CommonMethods;

public class StorePageLocator extends BaseClass{
	
	 /* Store module web locator */ 
    
    @FindBy(linkText="USGBC Store")WebElement usgbc_store;
   	public WebElement getUsgbcStore() {
   			return usgbc_store;
   			}
   	@FindBy(xpath=".//*[@id='edit-actions']/div/a")WebElement checkoutButton;
   	public WebElement getCheckOutButton() {
   			return checkoutButton;
   			}
    
    @FindBy(xpath="html/body/div[1]/div/div/div/div/pre")WebElement Status_message_No_items_added ;
   	public WebElement getStatusMessageNoItemsAdded() {
   			return Status_message_No_items_added ;
   			}
    
   	
    @FindBy(xpath=".//*[@id='block-drupal8-zymphonies-theme-content']/div/div/div/div/div[2]/div/span/a/div")WebElement LEEDReferenceGuide;
   	public WebElement getLEEDReferenceGuide() {
   			return LEEDReferenceGuide;
   			}
   	
    @FindBy(xpath=".//*[@id='block-drupal8-zymphonies-theme-content']/div/div/div/div/div[3]/div/span/a/div")WebElement GreenAppleLapelPins;
   	public WebElement getGreenAppleLapelPins() {
   			return GreenAppleLapelPins;
   			}
   
    @FindBy(linkText="LEED Reference Guide for Homes Design and Construction (e-document)")WebElement LEED_Reference;
   		   	public WebElement getLEED_Reference() {
   		   			return LEED_Reference;
   		   			}
   		   	
   	@FindBy(xpath=".//*[@id='edit-submit-33']")public  static WebElement  Add_to_cart_LEED;
   	public static WebElement getAddToCartLEED() {
   			return Add_to_cart_LEED;
   			}
   	
 	@FindBy(xpath=".//*[@id='edit-submit-31']")public  static WebElement  Add_to_cart_Green;
   	public static WebElement getAddToCartGreen() {
   			return Add_to_cart_Green;
   			}
   	//xpath for message block displayed
 	@FindBy(xpath="html/body/div[1]/div/div/div/div")WebElement Status_message_block;
   	public WebElement getStatusMessageBlock() {
   			return Status_message_block;
   			}
    //xpath for message block messsage 
   	@FindBy(xpath="html/body/div[1]/div/div/div/div/strong")WebElement Status_message;
   	public WebElement getStatusMessage() {
   			return Status_message;
   			}
   	
 	
   	
   	/* SC=> StoreContact Store/contact  web locator */ 
   	
    @FindBy(id="edit-attention-to")static WebElement SCAttention;						
	@FindBy(id="edit-company")WebElement SCCompany;
   	@FindBy(xpath=".//*[@name='shipping_address[country_code]']")WebElement SCshipping_country;
 	@FindBy(xpath=".//*[@name='shipping_address[address_line1]']" )WebElement SCshipping_address;
 	@FindBy(xpath=".//*[@name='shipping_address[address_line2]']" )WebElement SCshipping_address_line2;
	@FindBy(xpath=".//*[@name='shipping_address[locality]']" )WebElement SCCity;
 	@FindBy(xpath=".//*[@id='edit-how-did-you-hear-2']" )WebElement SCWebsite;
 	@FindBy(xpath=".//*[@id='edit-submit']" )WebElement Continue;
  	
 	public void contact_store(String SCAttention,String SCCompany,String SCshipping_country,String SCshipping_address,String SCshipping_address_line2 ,String SCCity) throws Exception {
 		
 		//Java script code for scrolling the window
		CommonMethods.scrollScreen(400);
 	
		//for Attention
		CommonMethods.sendKeys("SCAttention", SCAttention);
		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering Attention ");
 		
 		//for Company
 		CommonMethods.sendKeys("SCCompany", SCCompany );
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering Company");
			
		//for selecting country
 		CommonMethods.selectdropdown("SCshipping_country", SCshipping_country);
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering Country");
		
		// for street address
 		CommonMethods.sendKeys("SCshipping_address", SCshipping_address);
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering Street Address");
 		
 		CommonMethods.sendKeys("SCshipping_address_line2", SCshipping_address_line2);
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering Street Address 2");
	
		//for city
 		CommonMethods.sendKeys("SCCity", SCCity);
 		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Entering City");
 		
 	    // for how did you hear me checkboxes
 		CommonMethods.click("SCWebsite");
 		Thread.sleep(2000);
 	 	CommonMethods.testlog("Pass", "Clicking others checkbox ");

 	 	CommonMethods.click("Continue");
		Thread.sleep(2000);
 		CommonMethods.testlog("Pass", "Clicking Continue ");	
	}
 	
 	
 	/*/cart */ 
 	
 	 @FindBy(linkText="Shopping cart")WebElement ShoppingCart;
	   	public WebElement getShoppingCart() {
	   			return ShoppingCart;
	   			}
	   
	 @FindBy(xpath=".//*[@id='block-drupal8-zymphonies-theme-content']/p" )WebElement UcCartEmpty;
	 	public WebElement getUcCartEmpty() {
   			return UcCartEmpty;
   			}
	 
	@FindBy(xpath=".//*[@id='edit-continue-shopping']" )WebElement ContinueShopping;
	 	public WebElement getContinueShopping() {
   			return ContinueShopping;
   			}
	 	
    @FindBy(xpath=".//*[@class='button js-form-submit form-submit'][@value='Remove']")WebElement Remove;
	 	public WebElement getRemove() {
   			return Remove;
   			}
	 	
	@FindBy(xpath=".//*[@id='edit-items-1-remove']" )WebElement RemoveGreen;
	 	public WebElement getRemoveGreen() {
   			return RemoveGreen;
   			}
	 	
	@FindBy(xpath=".//*[@id='edit-items-0-qty']" )WebElement inputbox;
	 	public WebElement getInputBox() {
   			return inputbox;
   			}
	 	
	 	
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/div/div/div/form/div[3]/input[2]" )WebElement UpdateCart;
	 	public WebElement getUpdateCart() {
   			return UpdateCart;
   			}
	@FindBy(xpath=".//*[@id='edit-empty']" )WebElement EmptyCart;
		public WebElement getEmptyCart() {
			return EmptyCart;
	   		}
	@FindBy(xpath=".//*[@id='edit-submit']" )WebElement SubmitCart;
		public WebElement getConfirmCart() {
			return  SubmitCart;
	   		}
	@FindBy(xpath=".//*[@id='edit-cancel']" )WebElement CancelCart;
		public WebElement getCancelCart() {
			return  CancelCart;
	   		}
    
	// function to check status message
	public void StatusMessage() {
		if(getStatusMessageBlock().isDisplayed()) {
			System.out.println("---" +  getStatusMessageBlock().getText()+"---");
			}
		}

}
