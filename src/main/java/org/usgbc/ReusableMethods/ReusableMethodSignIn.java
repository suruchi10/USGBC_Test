package org.usgbc.ReusableMethods;

import org.usgbc.page.UsgbcWebLocator.SignInPageLocator;

public class ReusableMethodSignIn extends SignInPageLocator{
	
	public static void signInForm(String sheetName, int rowNum) throws Exception {
		
		String Eemail= reader.getCellData(sheetName, "email",rowNum); 
		
		String Epass= reader.getCellData(sheetName, "password", rowNum);
		
		signin_usgbc(Eemail,Epass);
	
	}

}
