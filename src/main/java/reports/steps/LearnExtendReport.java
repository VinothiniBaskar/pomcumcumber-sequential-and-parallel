package reports.steps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {

	public static void main(String[] args) {

		// Step1:Setup the physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		// keep the history
//		reporter.setAppendExisting(true);

		// Step2:Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		// Step3: attach the data with physical file
		extent.attachReporter(reporter);

		// Step4: Create a testcase and assign testDetails
		// testName //testDescription
		ExtentTest test = extent.createTest("LoginScript", "CreateLead with mandatory details");
		test.assignCategory("LeafTapsModule1");
		test.assignAuthor("Vino");

		ExtentTest test1 = extent.createTest("LoginScript2", "CreateLead with mandatory details");
		test1.assignCategory("LeafTapsModule2");
		test1.assignAuthor("Vasu");

		// Step5: Step level status and take screenshot
		test.pass("Enter Username");
		test.pass("Enter Password");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		test.pass("Click Login");

		test1.pass("Enter Username");
		test1.pass("Enter Password");
		test1.pass("Click Login");

		// Mandatory step
		extent.flush();

	}

}
