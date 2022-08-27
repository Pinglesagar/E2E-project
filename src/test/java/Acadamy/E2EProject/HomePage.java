package Acadamy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.LoginPage;
import pageObject.landingPage;

public class HomePage extends base {
	public WebDriver driver;
	
	@BeforeClass
	public void DriverInitilize() throws IOException {
			
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException  {
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		landingPage l = new landingPage(driver);
		l.getLogin().click();
		LoginPage login = new LoginPage(driver);
		login.getmail().sendKeys(Username);
		login.getPassword().sendKeys(Password);
		login.getSubmittbtn().click();

	}
	
	@AfterClass
	public void DriverClose() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][2];
		//0th row
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		
		//1st row
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";

		
		return data;
		
		
	}
}
