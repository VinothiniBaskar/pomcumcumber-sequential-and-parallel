package pagesforparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforparallel.BaseClassParallel;

public class LoginPageParallel extends BaseClassParallel {
	public LoginPageParallel(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPageParallel enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;

	}

	public LoginPageParallel enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

	public WelcomePage clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);

	}

}
