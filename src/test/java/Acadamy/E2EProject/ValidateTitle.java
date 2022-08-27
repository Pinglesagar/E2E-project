package Acadamy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.landingPage;

public class ValidateTitle extends base {
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeClass
	public void DriverInitilize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is intialized");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Driver is navigated to Homepage");
	}
	
	@Test
	public void ValidateTitle() throws IOException {
		landingPage l = new landingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "Featured Courses");
		log.info("Successfully validate text message");
	}
	
	@AfterClass
	public void DriverClose() {
		driver.close();
	}

}
