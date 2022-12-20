package pagesforsequential;

import org.openqa.selenium.By;

import baseclassforsequential.BaseClassSequential;

public class LoginPageSequential extends BaseClassSequential {
	
    //Note :For return when the click of the element is stays in the current page we need to give in the return statement(return this;)
    //For return when the click of the element is going to   the next  page we need to give in the return statement(return new which page();)
	//need to create an object for this constructor
	public LoginPageSequential enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//It stays in the current page ,so we are giving return this;
		//return type is current class
		return this;

	}

	public LoginPageSequential enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

	public WelcomePage clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		//When we are click the login button it goes to the welcomepage 
		//so in the return statement we are create an object for the class WelcomePage
		//return type is WelcomePage class
		return new WelcomePage();

	}

}
