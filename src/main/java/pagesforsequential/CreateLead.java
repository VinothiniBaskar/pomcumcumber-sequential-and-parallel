package pagesforsequential;

import org.openqa.selenium.By;

import baseclassforsequential.BaseClassSequential;


public class CreateLead extends BaseClassSequential {
	
	public CreateLead entercompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TVS");
		return this;

	}

	public CreateLead enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinothini");
		return this;

	}

	public CreateLead enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		return this;
	}

	public ViewLead clickCreateLeadbutton() {
		driver.findElement(By.name("submitButton")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                
		return new ViewLead();

	}

}

