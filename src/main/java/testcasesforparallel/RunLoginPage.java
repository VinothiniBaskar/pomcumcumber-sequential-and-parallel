package testcasesforparallel;

import org.testng.annotations.Test;

import baseclassforparallel.BaseClassParallel;
import pagesforparallel.LoginPageParallel;

public class RunLoginPage extends BaseClassParallel {
	
	@Test
	public void runLogin() {

		LoginPageParallel lp = new LoginPageParallel(driver);
		lp.enterUserName().enterPassword().clickLoginbutton().crmLinkclick();
		
	}

}
