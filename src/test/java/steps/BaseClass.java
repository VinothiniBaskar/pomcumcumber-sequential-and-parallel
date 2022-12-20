package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {

	// Create an Object for ThreadLocal class of the type RemoteWebDriver and set
	// variable as private with a
	// static final data type
	// Beacuse it is no need to change for anything
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();

	// Create a setMethod for set the driver for all the testcases
	public void setMethod() {
		// use the ThreadLocal object and set the driver using the method set
		rd.set(new ChromeDriver());

	}

	// Create a getrMethod for get the value of the driver from the setMethod
	public RemoteWebDriver getMethod() {
		// use the ThreadLocal object and get the value of the driver from setMethod
		return rd.get();

	}

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		// remove the new ChromeDriver and call the SetMethod
		setMethod();
		// Remove the driver where ever used and replace with all by getMethod()
		getMethod().get("http://leaftaps.com/opentaps/control/main");
		getMethod().manage().window().maximize();
		getMethod().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void postCondition() {
		// driver.close();
	}

}
