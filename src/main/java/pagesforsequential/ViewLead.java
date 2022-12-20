package pagesforsequential;

import org.openqa.selenium.By;

import baseclassforsequential.BaseClassSequential;

public class ViewLead   extends BaseClassSequential{
	
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
