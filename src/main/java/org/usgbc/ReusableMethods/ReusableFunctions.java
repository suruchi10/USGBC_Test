package org.usgbc.ReusableMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.usgbc.driver.BaseClass;

public class ReusableFunctions extends BaseClass {
	
	public void numberOfRowsAndColumnInTable() {
		
		List<WebElement> rows_table = driver.findElements(By.tagName("tr"));
		//To calculate no of rows In table.
		int rows_count = rows_table.size();
		//Loop will execute till the last row of table.
			for (int row=1; row<rows_count; row++){
				//To locate columns(cells) of that specific row.
				List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
				//To calculate no of columns(cells) In that specific row.
				int columns_count = Columns_row.size();
				System.out.println("Number of cells In Row "+row+" are "+columns_count);
				//Loop will execute till the last cell of that specific row.
					for (int column=0; column<columns_count; column++){
						//To retrieve text from that specific cell.
						String celtext = Columns_row.get(column).getText();
						System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celtext);
					}
		    System.out.println("--------------------------------------------------");	
			}
	}	
}
