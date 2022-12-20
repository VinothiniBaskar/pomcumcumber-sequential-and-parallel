package dynamicparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicparam.baseclass.pom.BaseClassDynamic;

public class LoginPageDynamic extends BaseClassDynamic {
	public LoginPageDynamic(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPageDynamic enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;

	}

	public LoginPageDynamic enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;

	}

	public WelcomePageDynamic clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageDynamic(driver);

	}

}
