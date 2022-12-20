package pagesforparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforparallel.BaseClassParallel;

public class ViewLead   extends BaseClassParallel{
	public ViewLead(ChromeDriver driver) {
		this.driver = driver;
	}
	public void verify() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("Vinothini")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead  not created ");

		}

	}

}
