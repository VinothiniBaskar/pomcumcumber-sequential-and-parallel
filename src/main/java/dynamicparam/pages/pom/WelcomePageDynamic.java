package dynamicparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicparam.baseclass.pom.BaseClassDynamic;

public class WelcomePageDynamic  extends BaseClassDynamic {
	
	public WelcomePageDynamic(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePageDynamic crmLinkclick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new MyHomePageDynamic(driver);

	}
	
	
}
