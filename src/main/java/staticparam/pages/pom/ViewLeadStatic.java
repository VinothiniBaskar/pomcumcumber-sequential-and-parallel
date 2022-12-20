package staticparam.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import staticparam.baseclass.pom.BaseClassStatic;

public class ViewLeadStatic   extends BaseClassStatic{
	public ViewLeadStatic(ChromeDriver driver) {
		this.driver = driver;
	}
	public void verify() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("Vasanth")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead  not created ");

		}

	}

}
