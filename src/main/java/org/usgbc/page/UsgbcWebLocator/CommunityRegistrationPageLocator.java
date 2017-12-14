package org.usgbc.page.UsgbcWebLocator;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.usgbc.driver.BaseClass;
import org.usgbc.driver.CommonMethods;

public class CommunityRegistrationPageLocator extends BaseClass{
	
    /* web element locator for community_registration page*/
	
	@FindBy(linkText="Community Registration") static WebElement communityRegistration;
	@FindBy(id="edit-community-name")static WebElement CRCommunityName;
	@FindBy(id="edit-attention-to")static WebElement CRAttention;
	@FindBy(id="edit-company")static WebElement CRCompany;
    @FindBy(name="address[country_code]")static WebElement CRCountry;
    @FindBy(xpath=".//*[@class='address-line1 form-text required']")static WebElement CRStreetAddress ;
    @FindBy(xpath=".//*[@class='address-line2 form-text required']")static WebElement CRStreetAddress2;
    @FindBy(name="address[locality]")static WebElement CRCity ;
    @FindBy(xpath=".//*[@name='address[postal_code]']")static WebElement CRZipcode;
    @FindBy(xpath=".//*[@class='administrative-area form-select required']")static WebElement CRState ;
    @FindBy(xpath=".//*[@id='edit-is-student']")static WebElement CRIsStudent;
    @FindBy(id="edit-is-student-n")static WebElement CRFullTimeStudentNo ;
    @FindBy(id="edit-is-student-y")static WebElement CRFullTimeStudentYes ;
    @FindBy(id="edit-school")static WebElement CRSchool;
    @FindBy(id="edit-student-id")static WebElement CRStudentID ;
    @FindBy(id="edit-graduation-date")static WebElement CRGraduation ;
    @FindBy(xpath=".//*[@id='edit-is-emerging-prof']")static WebElement CREmergingProfessional;
    @FindBy(id="edit-is-emerging-prof-n")static WebElement CREmergingProfessionalNo;
    @FindBy(id="edit-is-emerging-prof-y")static WebElement CREmergingProfessionalYes;
    @FindBy(id="edit-emerging-prof-bday")static WebElement CRBirthday;
    @FindBy(xpath=".//*[@id='edit-how-did-you-hear-1']")static WebElement CREmail;
    @FindBy(id="edit-how-did-you-hear-2")static WebElement CRwebsite;
    @FindBy(id="edit-how-did-you-hear-5")static WebElement CROther;
    @FindBy(id="edit-how-did-you-hear-text")static WebElement CRDescribe;
    @FindBy(id="edit-terms")static WebElement CRTerms;
    @FindBy(xpath=".//*[@class='community-total']")static WebElement CRTotal;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/div/div/div/form/div[2]/div[2]/div/div/div/div/table/tbody/tr[2]/td")static WebElement CRAmount;
    @FindBy(id="edit-submit")static WebElement Continue;
    @FindBy(id="edit-cancel")static WebElement Cancel;
	
	public static void CRFormFields(String CRCommunityName,String CRAttention,String CRCompany,String CRCountry,String CRStreetAddress,
		String CRStreetAddress2,String CRCity,String CRZipcode,String CRState,String CRSchool,String CRStudentID,String CRGraduation,String CRBirthday,String CRDescribe) throws IOException, InterruptedException {
		
		CommonMethods.click("CommunityRegistration");
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking CommunityRegistration Link ");
		
		//for selecting community name
	    CommonMethods.selectdropdown("CRCommunityName", CRCommunityName);
		Thread.sleep(CommonMethods.time);
		CommonMethods.testlog("Pass", "Entering Community Name ");
		
		//for Attention
		CommonMethods.sendKeys("CRAttention", CRAttention );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Attention ");
 		
 		//for Company
 		CommonMethods.sendKeys("CRCompany", CRCompany );
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Company");
			
		//for selecting country
 		CommonMethods.selectdropdown("CRCountry", CRCountry);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Country");
	
		//Java script code for scrolling the window
 		CommonMethods.scrollScreen(400);
		
		// for street address
 		CommonMethods.sendKeys("CRStreetAddress", CRStreetAddress);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Street Address");
 		
 		CommonMethods.sendKeys("CRStreetAddress2", CRStreetAddress2);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering Street Address 2");
	
		//for city
 		CommonMethods.sendKeys("CRCity", CRCity);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering City");
     	
        // for zip code
 		CommonMethods.sendKeys("CRZipcode", CRZipcode);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering ZipCode");
		
		//for state
 		CommonMethods.selectdropdown("CRState",CRState);
 		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering CRState");
		
		//for full time student  radio button
		CommonMethods.click("CRFullTimeStudentYes");
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking option button ");
		
 		CommonMethods.sendKeys("CRSchool",CRSchool);
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering CRSchool ");
 		
 		CommonMethods.sendKeys("CRStudentID",CRStudentID);
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering CRStudentID ");
 		
 		CommonMethods.sendKeys("CRGraduation",CRGraduation);
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering CRGraduation ");
 		
		//for emerging professional radio button
 		CommonMethods.click("CREmergingProfessionalYes");
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking option button ");
		
 		CommonMethods.sendKeys("CRBirthday",CRBirthday);
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering CRBirthday ");
	    
	    // for how did you hear me checkboxes
 		CommonMethods.click("CROther");
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking others checkbox ");

 		CommonMethods.sendKeys("CRDescribe",CRDescribe);
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Entering CRDescribe ");
	    
	    // for selecting terms
 		CommonMethods.click("CRTerms");
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking CRTerms ");
	    
 		CommonMethods.click("Continue");
		Thread.sleep(CommonMethods.time);
 		CommonMethods.testlog("Pass", "Clicking Continue ");
	   
	} 
	
	/*Error message web locator for communtiy registration */ 
	
	@FindBy(id=".//*[@id='edit-address']/div[3]/div[2]")WebElement error_address_line1 ;
		public WebElement getError_address_line1() {
			return error_address_line1 ;
			}
	@FindBy(id=".//*[@id='edit-address']/div[4]/div[2]")WebElement error_address_line2 ;
	    public WebElement getError_address_line2 () {
			return error_address_line2;
			}
	@FindBy(id=".//*[@id='edit-address-container4']/div[1]/div[2]")WebElement error_city;
	    public WebElement getError_city() {
			return error_city;
			}
	@FindBy(id=".//*[@id='edit-address-container4']/div[2]/div[2]")WebElement error_state;
	    public WebElement getError_state() {
			return error_state;
			}
	@FindBy(id=".//*[@id='edit-address-container4']/div[3]/div[2]")WebElement error_zipcode;
	    public WebElement getError_zipcode() {
			return error_zipcode;
			}
	@FindBy(id=".//*[@id='usgbc_community_reached_div_id']/div[2]/div[2]")WebElement errror_hear_about_us ;
		public WebElement getErrror_hear_about_us() {
			return errror_hear_about_us;
			}
	@FindBy(id=".//*[@id='usgbc-terms-accept']/div[1]/div[2]")WebElement error_terms_condition;
	    public WebElement getError_terms_condition() {
			return error_terms_condition;
			}
	    
	//xpath for message block displayed
	@FindBy(xpath="html/body/div[1]/div/div/div/div")WebElement Status_message_block;
	   	public WebElement getStatusMessageBlock() {
	   			return Status_message_block;
	   		}

}
