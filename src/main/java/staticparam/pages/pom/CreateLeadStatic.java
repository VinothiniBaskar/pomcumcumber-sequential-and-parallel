package staticparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import staticparam.baseclass.pom.BaseClassStatic;

public class CreateLeadStatic extends BaseClassStatic {
	public CreateLeadStatic (ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLeadStatic entercompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;

	}

	public CreateLeadStatic enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;

	}

	public CreateLeadStatic enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}

	public ViewLeadStatic clickCreateLeadbutton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadStatic(driver);

	}

}

