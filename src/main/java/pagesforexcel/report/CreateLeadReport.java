package pagesforexcel.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforexcel.report.BaseClassReport;

public class CreateLeadReport extends BaseClassReport {
	public CreateLeadReport (ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLeadReport entercompanyName(String companyName) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			reportStep("CompanyName  is  entered succesfully", "pass");
		} catch (Exception e) {
			reportStep(e+"CompanyName  is not  entered succesfully", "fail");		}
		return this;

	}

	public CreateLeadReport enterFirstName(String firstName) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			reportStep("FirstName  is  entered succesfully", "pass");

		} catch (Exception e) {
			reportStep(e+"FirstName  is   not entered   succesfully", "fail");		
		}
		return this;

	}

	public CreateLeadReport enterLastName(String lastName) throws IOException {
		try {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			reportStep("LastName  is entered  succesfully", "pass");

		} catch (Exception e) {
			reportStep(e+"LastName  is not entered  succesfully", "fail");		
		}
		return this;
	}

	public ViewLeadReport clickCreateLeadbutton() throws IOException {
		try {
			driver.findElement(By.name("submitButton")).click();
			reportStep("CreateLeadbutton  is  clicked  succesfully", "pass");

		} catch (Exception e) {
			reportStep(e+" CreateLeadbutton is not  clicked  succesfully", "fail");		
		}
		return new ViewLeadReport(driver);

	}

}

