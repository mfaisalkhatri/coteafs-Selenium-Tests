package com.wizonsoft.coteafs_selenium_tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.core.Browser;

public class BrowserTest {

	@Test(enabled = false)
	public void Test1() {
		Browser.start("CHROME");
		Browser.stop();

	}

	@Test(enabled = false)
	public void Test2() {
		Browser.start("FIREFOX");
		Browser.stop();

	}

	@Test
	@Parameters("browser")
	public void Test3(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {
			Browser.start("FIREFOX");
			Browser.stop();
		} else if (browser.equalsIgnoreCase("chrome")) {
			Browser.start("CHROME");
			Browser.stop();
		} else {
			throw new Exception("Browser is not correctly speicified.");
		}
	}

}
