package com.mts.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mts.pages.HomePage;
import com.mts.pages.LoginPage;
import com.mts.utility.BaseClass;

public class LoginTestCRM extends BaseClass {
	
	@Test
	public void loginApp() {
		
		logger = report.createTest("Login to CRM");
		
		HomePage hmPage = PageFactory.initElements(driver, HomePage.class);
		hmPage.goToLoginPage();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
	}
}
