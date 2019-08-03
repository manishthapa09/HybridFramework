package com.mts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
	}
	
	@FindBy(name="email") WebElement email;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginButton;
	
	public void loginToCRM(String emailApp, String passwordApp) {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		email.sendKeys(emailApp);
		pass.sendKeys(passwordApp);
		loginButton.click();
	}
}
