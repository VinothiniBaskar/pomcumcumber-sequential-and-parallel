package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;

public class ViewLead   extends BaseClass{
	public ViewLead(ChromeDriver driver) {
		this.driver = driver;
	}
	public void verify() {
		String text = driver.findElement(By.id("")).getText();
		if (text.contains("Vinothini")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead  not created ");

		}

	}

}
