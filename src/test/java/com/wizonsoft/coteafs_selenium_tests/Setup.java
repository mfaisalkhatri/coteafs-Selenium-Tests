package com.wizonsoft.coteafs_selenium_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup {

	WebDriver driver;

	@BeforeTest
	public void siteUp() {
		String exe = "chromedriver.exe";
		final String path = getClass().getClassLoader().getResource(exe).getPath();
		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();

		String website = "http://www.automationpractice.com";
		driver.get(website);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterTest
	public void tearDown() {

		if (driver != null) {
			driver.quit();
			System.out.println("Driver Quit!");
		}
	}

}
