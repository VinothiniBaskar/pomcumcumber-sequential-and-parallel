package dynamicparam.testcases.pom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dynamicparam.baseclass.pom.BaseClassDynamic;
import dynamicparam.pages.pom.LoginPageDynamic;

public class RunLoginPageDynamic extends BaseClassDynamic {
	//pass the excelfile name 
	@BeforeTest
	public void passExcelData() {
		ExcelFileName="Login";
	}
	//pass the dataProvider in testcase method
	@Test(dataProvider="fetchDynamicData")
	public void runLoginDynamic(String username,String password) {

		LoginPageDynamic lp = new LoginPageDynamic(driver);
		lp.enterUserName(username)
		.enterPassword(password)
		.clickLoginbutton()
		.crmLinkclick();
		
	}

}
