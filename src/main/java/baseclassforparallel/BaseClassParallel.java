package baseclassforparallel;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassParallel {
	
	//when your driver have declared as public only we can run our testcases parallely
	//We cann't run the testcases that driver is declared as static,it is only applicable for sequential process
	public  ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod

	public void postCondition() {
		//driver.close();
	}

}
