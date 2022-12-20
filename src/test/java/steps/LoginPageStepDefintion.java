package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageStepDefintion extends BaseClass{

	@Given("Enter the username as {string}")
	public LoginPageStepDefintion enterUsername(String string) {
		getMethod().findElement(By.id("username")).sendKeys(string);
		return this;
		
	}
	@Given("Enter the password as {string}")
	public LoginPageStepDefintion enterPassword(String string) {
		getMethod().findElement(By.id("password")).sendKeys(string);
		return this;
	}
	@When("Click on  Login button")
	public WelcomePageStepDefintion clickLoginButton() {
		getMethod().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageStepDefintion();
	}
	

}