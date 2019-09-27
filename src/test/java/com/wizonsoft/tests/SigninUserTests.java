package com.wizonsoft.tests;

import static com.github.wasiqb.coteafs.selenium.config.ConfigUtil.appSetting;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.wizonsoft.action.MainPageAction;
import com.wizonsoft.action.SigninUserAction;
import com.wizonsoft.pages.MainPage;

/**
 * @since Jul 14, 2019
 *
 */
public class SigninUserTests extends BrowserTest {

	/**
	 * @since Jul 14, 2019
	 */
	@Test
	public void testUserSignin () {
		final SigninUserAction signin = new SigninUserAction ();
		signin.signinUser (appSetting ().getParams ()
			.get ("emailId"),
			appSetting ().getParams ()
				.get ("pwd"));
	}

	/**
	 * @since Jul 14, 2019
	 */
	@BeforeTest
	public void setupMethod () {
		final MainPage mainPage = new MainPage ();
		mainPage.onDriver ()
			.navigateTo (appSetting ().getUrl ());
		final MainPageAction mainPageAction = new MainPageAction ();
		mainPageAction.perform ();
	}

}
