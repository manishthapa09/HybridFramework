package com.mts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver ldriver) {
	
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']") WebElement homePgloginBtn;
	
	public void goToLoginPage() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		homePgloginBtn.click();
	}
}
