package staticparam.testcases.pom;

import org.testng.annotations.Test;

import staticparam.baseclass.pom.BaseClassStatic;
import staticparam.pages.pom.LoginPageStatic;

public class RunCreateLeadStatic extends BaseClassStatic {
	

	@Test
	public void runCreateLeadStatic() {
		LoginPageStatic lp = new LoginPageStatic(driver);
		lp.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLoginbutton()
		.crmLinkclick()
		.cilckLeadsButton()
		.clickCreateButton()
		.entercompanyName("HCL")
		.enterFirstName("Vasanth")
		.enterLastName("A")
		.clickCreateLeadbutton()
		.verify();
				

	}		

	}

