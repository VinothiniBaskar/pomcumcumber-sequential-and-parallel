package dynamicparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicparam.baseclass.pom.BaseClassDynamic;

public class MyHomePageDynamic extends BaseClassDynamic  {
	public MyHomePageDynamic(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyLeadsDynamic cilckLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsDynamic(driver);

	}

}
