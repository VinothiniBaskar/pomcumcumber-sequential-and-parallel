package staticparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import staticparam.baseclass.pom.BaseClassStatic;

public class MyLeadsStatic   extends BaseClassStatic{
	
	
	public MyLeadsStatic(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadStatic clickCreateButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadStatic(driver);

	}
	

}
