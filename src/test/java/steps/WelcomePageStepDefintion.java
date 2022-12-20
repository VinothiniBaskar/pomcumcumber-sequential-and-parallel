package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

public class WelcomePageStepDefintion extends BaseClass{
	@Then("HomPage should be displayed")
	public MyHomePageStepDefinition clickCrmLink() {
		getMethod().findElement(By.linkText("CRM/SFA")).click();
		 String title = getMethod().getTitle();
		 if (title.contains("My Home")) {
				System.out.println("Home Page is displayed");
			}
		 else {
				System.out.println("Home Page is not displayed");

		}
		return new MyHomePageStepDefinition();
	}
	@But("ErrorMessage should be displayed")
	public WelcomePageStepDefintion errormsg() {
	  String text = getMethod().findElement(By.xpath("//div[@id='errorDiv']/p")).getText();
	  if (text.contains("The Following Errors")) {
		System.out.println("Error msg is displayed");
	}
	  else {
			System.out.println("Error msg is not displayed");

	}
	  return this;

	}

}
