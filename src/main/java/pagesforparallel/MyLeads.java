package pagesforparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclassforparallel.BaseClassParallel;


public class MyLeads   extends BaseClassParallel{
	
	
	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLead clickCreateButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);

	}
	

}
