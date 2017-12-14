package org.usgbc.page.UsgbcWebLocator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.usgbc.driver.BaseClass;

public class MembershipPageLocator extends BaseClass {
 	
   	/* Membership/contact  web locator */ 
   	
    @FindBy(id="edit-attention-to")WebElement Contact_attention_to_membership ;						
	@FindBy(id="edit-company")WebElement Contact_Company_membership;
   	@FindBy(xpath=".//*[@name='address[country_code]']")WebElement country_membership;
 	@FindBy(xpath=".//*[@name='address[address_line1]']" )WebElement address_membership;
 	@FindBy(xpath=".//*[@name='address[address_line2]']" )WebElement address_line2_membership;
	@FindBy(xpath=".//*[@name='address[locality]']" )WebElement Contact_City_membership;
 	@FindBy(xpath=".//*[@id='edit-terms']" )WebElement terms_membership;
 	@FindBy(xpath=".//*[@id='edit-submit']" )WebElement Contact_Continue_membership;
 	public WebElement getContactContinueMembership() {
			return Contact_Continue_membership;
			}
 	
 	
 	public void contact_membership(String attention,String company,String country,String s_address,String s_address_line2 ,String city) throws InterruptedException {
		
 		Thread.sleep(3000);
 		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(2000);
		Contact_attention_to_membership.sendKeys(attention);
		Contact_Company_membership.sendKeys(company);
		//shipping_country.click();	
		Select select = new Select(country_membership);
 	    select.selectByVisibleText(country);
 	    Thread.sleep(3000);
		address_membership.sendKeys(s_address);
		address_line2_membership.sendKeys(s_address_line2);
		Contact_City_membership.sendKeys(city);
		terms_membership.click();
		Contact_Continue_membership.click();	
	}

	@FindBy(xpath=".//*[@id='edit-org-name']" )WebElement organistionName;
 	public WebElement getOrganistionName() {
			return  organistionName;
			}
 	@FindBy(xpath=".//*[@id='edit-website']" )WebElement membership_website;
 	public WebElement getwebsite() {
			return membership_website;
			}
 	@FindBy(xpath=".//*[@id='edit-industry-category']" )WebElement industry_category ;
 	public WebElement getIndustryCategory() {
			return industry_category;
			}
 	@FindBy(xpath=".//*[@id='edit-industry-sub-category']" )WebElement industry_sub_category;
 	public WebElement getIndustrySubCategory() {
			return industry_sub_category;
			}
 	@FindBy(xpath=".//*[@id='edit-revenue-scale']" )WebElement revenue_scale;
 	public WebElement getRevenueScale() {
			return revenue_scale;
			}
 	
 	
 	public void membership() throws Exception {
		 getOrganistionName().sendKeys("Group10");
		 getwebsite().sendKeys("www.test.com");
		 Select select = new Select(getIndustryCategory());
		    select.selectByVisibleText("Educational Institutions");
		    Thread.sleep(3000);
		 Select select2 = new Select(getIndustrySubCategory());
		    select2.selectByVisibleText("Commissioning Providers");
		    Thread.sleep(3000);
		 Select select3 = new Select(getRevenueScale());
		    select3.selectByVisibleText("Less than $250,000");
		    Thread.sleep(3000);
		    getContactContinueMembership().click();
		 
	}
}
