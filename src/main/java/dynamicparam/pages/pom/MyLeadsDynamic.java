package dynamicparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicparam.baseclass.pom.BaseClassDynamic;

public class MyLeadsDynamic  extends BaseClassDynamic{
	
	
	public MyLeadsDynamic(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadDynamic clickCreateButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadDynamic(driver);

	}
	

}
