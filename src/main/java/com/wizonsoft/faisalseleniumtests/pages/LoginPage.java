package com.wizonsoft.faisalseleniumtests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginSite(String userId, String password) {
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		signInLink.click();
		String signInPageTitle = driver.getTitle();
		String actualPageTitle = "Login - My Store";
		Assert.assertEquals(actualPageTitle, signInPageTitle);

		WebElement parentForm = driver.findElement(By.id("login_form"));
		WebElement emailId = parentForm.findElement(By.id("email"));

		emailId.click();
		emailId.clear();
		emailId.sendKeys(userId);

		WebElement pass = parentForm.findElement(By.id("passwd"));

		pass.click();
		pass.clear();
		pass.sendKeys(password);

		WebElement submitButton = parentForm.findElement(By.id("SubmitLogin"));
		submitButton.click();

	}

}
