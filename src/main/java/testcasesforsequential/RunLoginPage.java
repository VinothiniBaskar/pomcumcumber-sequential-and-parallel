package testcasesforsequential;

import org.testng.annotations.Test;

import baseclassforsequential.BaseClassSequential;
import pagesforsequential.LoginPageSequential;

public class RunLoginPage extends BaseClassSequential {
	

	@Test
	public void runLogin() {
        //create an object for the LoginPage and pass the driver
		LoginPageSequential lp = new LoginPageSequential();
		lp.enterUserName().enterPassword().clickLoginbutton().crmLinkclick().cilckLeadsButton()
		.clickCreateButton()
		.entercompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadbutton()
		.verify();
	
		

	}

}
