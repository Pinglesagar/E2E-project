package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	public WebDriver driver;
	
	By singn = By.xpath("//a[@href='https://courses.rahulshettyacademy.com/sign_in']");
	By Title = By.xpath("//div[@class='pull-left']/h2");
	By landingLink = By.xpath("(//ul[@class='navigation clearfix'])[1]");
	
	public landingPage(WebDriver driver2) {
	this.driver = driver2;
	}   

	public WebElement getLogin() {
		return driver.findElement(singn);
	}
	
	public WebElement getTitle() {
		return driver.findElement(Title);
	}
	
	public WebElement getLink() {
		return driver.findElement(landingLink);
				
	}

}
