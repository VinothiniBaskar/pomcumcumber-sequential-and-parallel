package pagesforsequential;

import org.openqa.selenium.By;

import baseclassforsequential.BaseClassSequential;

public class WelcomePage  extends BaseClassSequential {
	
	
	public MyHomePage crmLinkclick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new MyHomePage();

	}
	

}
