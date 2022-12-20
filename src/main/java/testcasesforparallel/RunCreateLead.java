package testcasesforparallel;

import org.testng.annotations.Test;

import baseclassforparallel.BaseClassParallel;
import pagesforparallel.LoginPageParallel;


public class RunCreateLead extends BaseClassParallel {
	

	@Test
	public void runCreateLead() {
		LoginPageParallel lp = new LoginPageParallel(driver);
		lp.enterUserName().enterPassword().clickLoginbutton().crmLinkclick().cilckLeadsButton()
		.clickCreateButton()
		.entercompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadbutton()
		.verify();
				

	}		

	}

