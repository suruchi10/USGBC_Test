package org.usgbc.ReusableMethods;

import org.usgbc.page.UsgbcWebLocator.StorePageLocator;

public class ReusableMethodStore extends StorePageLocator{
	
	public void Contact_Form(String sheetName, int rowNum) throws Exception {
		
		String Attention= reader.getCellData(sheetName, "Attention",rowNum); 
		String Company= reader.getCellData(sheetName, "Company", rowNum);
		String Country= reader.getCellData(sheetName, "Country", rowNum);
		String Street_Address= reader.getCellData(sheetName, "Street_Address", rowNum);
		String Street_Address_line2= reader.getCellData(sheetName, "Street_Address_line2", rowNum);
		String City= reader.getCellData(sheetName, "City", rowNum);
		contact_store(Attention,Company,Country,Street_Address,Street_Address_line2,City);
		
	}

}
