package staticparam.testcases.pom;

import org.testng.annotations.Test;

import staticparam.baseclass.pom.BaseClassStatic;
import staticparam.pages.pom.LoginPageStatic;

public class RunLoginPageStatic extends BaseClassStatic {
	
	@Test
	public void runLoginStatic() {

		LoginPageStatic lp = new LoginPageStatic(driver);
		lp.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLoginbutton()
		.crmLinkclick();
		
	}

}
