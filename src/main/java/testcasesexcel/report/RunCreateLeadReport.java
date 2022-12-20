package testcasesexcel.report;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclassforexcel.report.BaseClassReport;
import pagesforexcel.report.LoginPageReport;

public class RunCreateLeadReport extends BaseClassReport{
	@BeforeTest
	public void passExcelData() {
		ExcelFileName = "CreateLead";
		testName="CreateLeadData";
		testDescription="CreateLead with mandatory details";
		testCategory="LeafTapsModule2";
		testAuthor="Vino";
	}

	@Test(dataProvider = "fetchDynamicData")
	public void runCreateLeadReport(String username, String password, String companyName, String firstName,
			String lastName) throws IOException {
		LoginPageReport lp = new LoginPageReport(driver);
		lp.enterUserName(username).enterPassword(password).clickLoginbutton().crmLinkclick().cilckLeadsButton()
				.clickCreateButton().entercompanyName(companyName).enterFirstName(firstName).enterLastName(lastName)
				.clickCreateLeadbutton().verify();

	}

}
