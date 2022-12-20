package staticdatabaseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class BaseClass {
	public  ChromeDriver driver;
	public  String ExcelFileName;

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
	@DataProvider(name="fetch")
	public String[][] fetchData() throws IOException {
		String[][] data = ReadExcelData.readExcel(ExcelFileName);
		return data;
		
		
		
	}

}
