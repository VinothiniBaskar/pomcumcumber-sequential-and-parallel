package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class WelcomePage  extends BaseClass {
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePage crmLinkclick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new MyHomePage(driver);

	}
	

}
