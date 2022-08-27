package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By Email = By.id("email");
	By Passwrd = By.id("password");
	By SbmtButtn = By.xpath("//input[@data-testid='login-button']");
	
	public LoginPage(WebDriver driver) {
	
		this.driver=driver;
	}


	public WebElement getmail() {
		return driver.findElement(Email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(Passwrd);
	}
	public WebElement getSubmittbtn () {
		return driver.findElement(SbmtButtn);
	}

}
