package staticparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import staticparam.baseclass.pom.BaseClassStatic;

public class LoginPageStatic extends BaseClassStatic {
	//create a constructor  and pass the driver as an argument
	public LoginPageStatic(ChromeDriver driver) {
		//assign the local variable to global variable
		this.driver = driver;
	}

	//Pass the argument as username -->Username should be passed in testcase class
	public LoginPageStatic enterUserName(String username) {
		//Remove the hard code value and replace with variable name 
		driver.findElement(By.id("username")).sendKeys(username);
		return this;

	}

	public LoginPageStatic enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;

	}

	public WelcomePageStatic clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageStatic(driver);

	}

}
