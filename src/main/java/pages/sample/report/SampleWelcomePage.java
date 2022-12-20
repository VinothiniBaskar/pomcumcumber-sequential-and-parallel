package pages.sample.report;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.baseclass.ReportBase;


public class SampleWelcomePage extends ReportBase{
	public SampleWelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public SampleMyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new SampleMyHomePage(driver);
	}

}