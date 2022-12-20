package pages.sample.report;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.baseclass.ReportBase;



public class SampleMyHomePage extends ReportBase {
	public SampleMyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public SampleMyLeadsPage clickLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new SampleMyLeadsPage(driver);

	}

}