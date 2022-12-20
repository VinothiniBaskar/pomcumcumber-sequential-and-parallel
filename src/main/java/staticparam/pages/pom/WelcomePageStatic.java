package staticparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import staticparam.baseclass.pom.BaseClassStatic;

public class WelcomePageStatic  extends BaseClassStatic {
	
	public WelcomePageStatic(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePageStatic crmLinkclick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new MyHomePageStatic(driver);

	}
	

}
