package testcasesexcel.report;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclassforexcel.report.BaseClassReport;
import pagesforexcel.report.LoginPageReport;

public class RunLoginPageReport extends BaseClassReport {
	//Go to testcase1(RunLoginPageReport) assign the values of test details
	@BeforeTest
	public void passExcelData() {
		ExcelFileName="Login";
		testName="LoginScript";
		testDescription="Login with mandatory details";
		testCategory="LeafTapsModule1";
		testAuthor="Vino";
		
		
	}
	@Test(dataProvider="fetchDynamicData")
	public void runLoginReport(String username,String password) throws IOException {

		LoginPageReport lp = new LoginPageReport(driver);
		lp.enterUserName(username)
		.enterPassword(password)
		.clickLoginbutton()
		.crmLinkclick();
		
	}

}
