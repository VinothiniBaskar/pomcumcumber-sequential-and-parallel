package pagesforsequential;

import org.openqa.selenium.By;

import baseclassforsequential.BaseClassSequential;

public class MyLeads   extends BaseClassSequential{
	
	
	
	public CreateLead clickCreateButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead();

	}
	

}
