package baseclassforexcel.report;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class BaseClassReport {

	// Declare a driver as global variable
	public ChromeDriver driver;
	// Declare a excel file name for all the testcases
	public String ExcelFileName;
	// it has latest value of it --> thats why we are declare a variable as static
	// Its for sequential and parallel
	// //Because it is used in startReport and stopReport
	public static ExtentReports extent;
	// Declare a variables for test details
	// testname,testcategory,testdescription,testAuthor
	public String testName, testDescription, testCategory, testAuthor;
	// Declare a ExtentTest as globally
	// Because it is used in testDetails and reportSteps
	public static ExtentTest test;

	// It is the initial step of report generate,it is placed in BeforeSuite
	// STEP :1)Create a startReport() in BaseClass with @BeforeSuite
	// -Add the common code for all the testcases(first 4 lines of code)
	@BeforeSuite
	public void startReport() {
		// Setup the physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		// Create object for ExtentReports
		extent = new ExtentReports();

		// attach the data with physical file
		extent.attachReporter(reporter);
	}
	
	// STEP :3)Create testcaseDetails() with testDetails code
		// -Declare testName,testDescription,testAuthor,testCategory as global variables
		// -Replace the hardcoded values with variables
		// -Apply @BeforeClass for thsi method
		//Go to testcase1(RunLoginPageReport),testcase2(RunCreateLeadReport) assign the values of test details
		@BeforeClass
		public void testDetails() {

			// assign the global varibles in the createTest,assignCategory,assignAuthor
			// methods
		    test = extent.createTest(testName, testDescription);
			test.assignCategory(testCategory);
			test.assignAuthor(testAuthor);

		}
		
		// STEP:4Create a method to create snap for all the testcases
		// Use this method in reportStep method -->in the createScreenCaptureFromPath
		// add the throws exception for all the test methods inculding all the pages(LoginPageReport,WelcomePageReport) 
		//and testcases(LoginPageReport,RunLoginPageReport)
		public int takeSnap() throws IOException {
			// use Math.random() for getting random num with each screenshot image
			int ranNum = (int) (Math.random() * 9999999);
			File source = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./snaps/img" + ranNum + ".png");
			FileUtils.copyFile(source, destination);
			return ranNum;

		}

	
	
	// STEP:5 create a method for getting status and msg of all the step level
	// process of testcase methods
	// This method is called to all the testcase methods,so no need any annotation
	// here
	// Each step will generate a status like pass or file
	// Example username,password
	public void reportStep(String msg, String status) throws IOException {
		// equalsIgnoreCase -->represents the no case sensitivities
		// for example pass should be PAss or pass -->both are accepts -->thats why we
		// are using this method
		if (status.equalsIgnoreCase("pass")) {
			// If it is testcase is passed get the msg of pass method
			// concat the takeSnap method in the method createScreenCaptureFromPath
			test.pass(msg,
					MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img" + takeSnap() + ".png").build());

		} else if (status.equalsIgnoreCase("fail")) {
			// If it is testcase is failed get the msg of fail method
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());


		}

	}
	//STEP:6 create a method for common method for all the testcases in before method
	//setup the driver,create an object for ChromeDriver,maximize the window,Launch the URL,give implicit wait
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	//STEP:7 create a method for common method for all the testcases in after method
	//close the driver for all the testcases are done
	@AfterMethod
	public void postCondition() {
		// driver.close();
	}

	//STEP:8 fetch the data from excel sheet using @DataProvider 
	//call the method readExcel from ReadExcelData and return the data in array of String
	@DataProvider(name = "fetchDynamicData")
	public String[][] passData() throws IOException {
		return ReadExcelData.readExcel(ExcelFileName);
	}

	// STEPL :2)Create a stopReport() in BaseClass with extent.flush() and apply
	// @AfterSuite
	@AfterSuite
	public void stopReport() {
		// Step:5 Mandatory step -->Here report datas are assigned to the folder
		// Writes test information from the started reporters to their output view
		extent.flush();
	}
	

}
