package baseclassforsequential;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSequential {
	
	//when your driver have declared as static only we can run our testcases sequentially
	public  static  ChromeDriver driver;
    //Step:1
	//create an method for common method for all the test cases(like set up the driver,create an object for ChromeDriver,
	//maximize the window,url,implicit wait)
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
   //Step:2
	//create an method for common method for all the test cases 
	//like driver close
	@AfterMethod

	public void postCondition() {
		//driver.close();
	}

}
