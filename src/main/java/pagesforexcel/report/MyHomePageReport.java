package pagesforexcel.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforexcel.report.BaseClassReport;

public class MyHomePageReport extends BaseClassReport  {
	public MyHomePageReport(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyLeadsReport cilckLeadsButton() throws IOException {
		try {
			driver.findElement(By.linkText("Leads")).click();
			reportStep("Leads button   is  clicked succesfully", "pass");

		} catch (Exception e) {
			reportStep(e+"Leads button  is  not  clicked succesfully", "fail");
		}
		return new MyLeadsReport(driver);

	}

}
