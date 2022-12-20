package dynamicparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicparam.baseclass.pom.BaseClassDynamic;

public class ViewLeadDynamic   extends BaseClassDynamic{
	public ViewLeadDynamic(ChromeDriver driver) {
		this.driver = driver;
	}
	public void verify() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("Vino")) {
			System.out.println("First Lead created successfully");
		}
		else if (text.contains("Vasu")) {
			System.out.println("Second Lead created successfully");

		}
		
		else {
			System.out.println("Lead  not created ");

		}

	}

}
