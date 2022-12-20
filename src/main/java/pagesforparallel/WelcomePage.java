package pagesforparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforparallel.BaseClassParallel;


public class WelcomePage  extends BaseClassParallel {
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePage crmLinkclick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new MyHomePage(driver);

	}
	

}
