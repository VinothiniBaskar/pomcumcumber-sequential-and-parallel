package pagesforsequential;

import org.openqa.selenium.By;

import baseclassforsequential.BaseClassSequential;


public class MyHomePage extends BaseClassSequential {
	

	public MyLeads cilckLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads();

	}

}
