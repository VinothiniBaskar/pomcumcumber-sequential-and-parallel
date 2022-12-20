package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class MyLeadsPageStepDefiniton extends BaseClass{
	
	@And("Click CreateLead link")
	public CreateLeadStepDefinition clickCreateLead() {
		getMethod().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadStepDefinition();
	}
}
