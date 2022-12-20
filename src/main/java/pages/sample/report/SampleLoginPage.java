package pages.sample.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.baseclass.ReportBase;


public class SampleLoginPage extends ReportBase{
	public SampleLoginPage(ChromeDriver driver) {
		this.driver=driver; 
	}
	
	public SampleLoginPage enterUsername(String username) throws IOException {
		
       try {
		driver.findElement(By.id("username")).sendKeys(username);
		reportStep("Username is entered successfully", "pass");
	} catch (Exception e) {
		reportStep(e+"Username is not entered successfully", "fail");
	}
       
       return this;
	}
	
	public SampleLoginPage enterPassword(String password) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(password);
			reportStep("Password is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Password is not entered successfully", "fail");
		}
		return this;
	}
	
	public SampleWelcomePage clickLoginButton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Login button is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked successfully", "fail");
		}
		return  new SampleWelcomePage(driver);
		
		
	}
	

}
