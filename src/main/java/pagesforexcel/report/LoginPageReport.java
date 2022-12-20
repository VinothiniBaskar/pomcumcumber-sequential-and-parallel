package pagesforexcel.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforexcel.report.BaseClassReport;

public class LoginPageReport extends BaseClassReport {
	public LoginPageReport(ChromeDriver driver) {
		this.driver = driver;
	}

	// STEP :5 use try and block for all the methods
	// call the reportStep method for all the test methods
	//Try block -->put the code of passed testcase msg and status
	//Catch block --->put the code of faileed  testcase msg and status with error message
	public LoginPageReport enterUserName(String username) throws IOException {
		// For create a try and catch block
		// Select the whole statement and right click
		// choose Surround with and Try/catch block

		try {
			driver.findElement(By.id("username")).sendKeys(username);
			// call the reportStep method and pass the message
			reportStep("UserName  is entered succesfully", "pass");
		} catch (Exception e) {
			// e donotes suppose error is occurred in testcase it will show in report
			reportStep(e + "UserName  is not entered succesfully", "fail");

		}
		return this;

	}

	public LoginPageReport enterPassword(String password) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(password);
			reportStep("Password  is entered succesfully", "pass");

		} catch (Exception e) {
			reportStep(e + "Password  is not entered succesfully", "fail");

		}
		return this;

	}

	public WelcomePageReport clickLoginbutton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Login  button is clicked succesfully", "pass");

		} catch (Exception e) {
			reportStep(e + "Login button is not  clicked succesfully", "fail");

		}
		return new WelcomePageReport(driver);

	}

}
