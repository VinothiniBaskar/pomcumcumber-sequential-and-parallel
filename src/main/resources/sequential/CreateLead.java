package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class CreateLead extends BaseClass {
	public CreateLead (ChromeDriver driver) {
		this.driver = driver;
	}
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
		return new ViewLead(driver);

	}

}

