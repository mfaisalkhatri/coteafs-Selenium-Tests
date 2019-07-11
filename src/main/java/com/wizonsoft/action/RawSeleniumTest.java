package com.wizonsoft.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RawSeleniumTest {

	@Test
	public void testAutomation () {
		final String fileName = "chromedriver.exe";
		final String filePath = getClass ().getClassLoader ()
			.getResource (fileName)
			.getPath ();
		System.setProperty ("webdriver.chrome.driver", filePath);

		final WebDriver driver = new ChromeDriver ();
		final String url = "http://automationpractice.com/index.php";
		driver.get (url);
		driver.manage ()
			.window ()
			.maximize ();
		driver.manage ()
			.timeouts ()
			.implicitlyWait (30, TimeUnit.SECONDS);
		driver.findElement (By.linkText ("Sign in"))
			.click ();
		driver.findElement (By.id ("email_create"))
			.sendKeys ("user88@mailinator.com");
		driver.findElement (By.id ("SubmitCreate"))
			.click ();

		final WebElement parentDays = driver.findElement (By.id ("uniform-days"));
		final WebElement daySelect = parentDays.findElement (By.id ("days"));
		// daySelect.click ();
		final boolean visiblility = daySelect.isDisplayed ();

		System.out.println ("Visibility of Days: " + visiblility);

		final Select select = new Select (daySelect);
		// select.selectByValue ("2");
		select.selectByVisibleText ("2  ");

		System.out.println ("Value selected");
		// driver.quit ();
	}

}
