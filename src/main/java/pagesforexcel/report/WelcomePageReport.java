package pagesforexcel.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforexcel.report.BaseClassReport;

public class WelcomePageReport  extends BaseClassReport {
	
	public WelcomePageReport(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePageReport crmLinkclick() throws IOException {
		try {
			driver.findElement(By.linkText("CRM/SFA")).click();
			reportStep("CRMLink  is  clicked succesfully", "pass");

		} catch (Exception e) {
			reportStep(e + "CRMLink  is not clicked succesfully", "fail");
		}
		return  new MyHomePageReport(driver);

	}
	
	
}
