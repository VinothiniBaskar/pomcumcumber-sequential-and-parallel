package pagesforexcel.report;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicparam.baseclass.pom.BaseClassDynamic;

public class ViewLeadReport   extends BaseClassDynamic{
	public ViewLeadReport(ChromeDriver driver) {
		this.driver = driver;
	}
	public void verify() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("Gayu")) {
			System.out.println("First Lead created successfully");
		}
		else if (text.contains("Selvi")) {
			System.out.println("Second Lead created successfully");

		}
		
		else {
			System.out.println("Lead  not created ");

		}

	}

}
