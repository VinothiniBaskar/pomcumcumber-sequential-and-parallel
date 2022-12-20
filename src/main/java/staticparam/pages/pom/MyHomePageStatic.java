package staticparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import staticparam.baseclass.pom.BaseClassStatic;

public class MyHomePageStatic extends BaseClassStatic  {
	public MyHomePageStatic(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyLeadsStatic cilckLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsStatic(driver);

	}

}
