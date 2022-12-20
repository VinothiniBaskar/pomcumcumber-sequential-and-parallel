package pagesforparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforparallel.BaseClassParallel;

public class MyHomePage extends BaseClassParallel {
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyLeads cilckLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads(driver);

	}

}
