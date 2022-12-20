package dynamicparam.testcases.pom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dynamicparam.baseclass.pom.BaseClassDynamic;
import dynamicparam.pages.pom.LoginPageDynamic;

public class RunCreateLeadDynamic extends BaseClassDynamic {
	@BeforeTest
	public void passExcelData() {
		ExcelFileName = "CreateLead";
	}

	@Test(dataProvider = "fetchDynamicData")
	public void runCreateLeadDynamic(String username, String password, String companyName, String firstName,
			String lastName) {
		LoginPageDynamic lp = new LoginPageDynamic(driver);
		lp.enterUserName(username).enterPassword(password).clickLoginbutton().crmLinkclick().cilckLeadsButton()
				.clickCreateButton().entercompanyName(companyName).enterFirstName(firstName).enterLastName(lastName)
				.clickCreateLeadbutton().verify();

	}

}
