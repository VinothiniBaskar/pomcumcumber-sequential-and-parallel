package testcase.sample.report;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.sample.report.SampleLoginPage;
import sample.baseclass.ReportBase;


public class SampleRunLogin extends ReportBase{
	
	@BeforeTest
	public void passData() {
		ExcelFileName="Login";
		testName="LoginLeaftaps";
		testDescription="Login with valid credentials";
		testCategory="LeafTapsModule1";
		testAuthor="Subraja";
	} 
	
	
	@Test(dataProvider = "fetch")
	public void runLogin(String username,String password) throws IOException {
		SampleLoginPage lp = new SampleLoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		;

	}

}
