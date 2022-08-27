package Acadamy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.landingPage;

public class ValidateLinks extends base {
	public WebDriver driver;
	
	@BeforeClass
	public void DriverInitilize() throws IOException {
		driver = initializeDriver();
	
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));	
	}
	@Test
	public void HomepageLinks() throws IOException {
		landingPage l = new landingPage(driver);
		Assert.assertTrue(l.getLink().isDisplayed());
	}
	@AfterClass
	public void DriverClose() {
		driver.close();
	}
}
