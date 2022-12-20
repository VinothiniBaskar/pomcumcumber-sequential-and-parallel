package pagesforexcel.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforexcel.report.BaseClassReport;

public class MyLeadsReport extends BaseClassReport{
	
	
	public MyLeadsReport(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadReport clickCreateButton() throws IOException {
		try {
			driver.findElement(By.linkText("Create Lead")).click();
			reportStep("CreateButton  is  clicked succesfully", "pass");

			
		} catch (Exception e) {
			reportStep(e+"CreateButton  is  clicked succesfully", "fail");

		}
		return new CreateLeadReport(driver);

	}
	

}
