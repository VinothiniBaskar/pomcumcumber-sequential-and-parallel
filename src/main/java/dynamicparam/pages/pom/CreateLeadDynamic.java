package dynamicparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicparam.baseclass.pom.BaseClassDynamic;

public class CreateLeadDynamic extends BaseClassDynamic {
	public CreateLeadDynamic (ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLeadDynamic entercompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;

	}

	public CreateLeadDynamic enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;

	}

	public CreateLeadDynamic enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}

	public ViewLeadDynamic clickCreateLeadbutton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadDynamic(driver);

	}

}

