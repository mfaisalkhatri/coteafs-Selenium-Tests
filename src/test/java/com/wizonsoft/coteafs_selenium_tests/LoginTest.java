package com.wizonsoft.coteafs_selenium_tests;

import org.testng.annotations.Test;

import com.wizonsoft.faisalseleniumtests.pages.LoginPage;

public class LoginTest extends Setup {

	@Test
	public void loginTest1() {

		String userId = "testerbuds@gmail.com";
		String password = "123456";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginSite(userId, password);
	}

}
