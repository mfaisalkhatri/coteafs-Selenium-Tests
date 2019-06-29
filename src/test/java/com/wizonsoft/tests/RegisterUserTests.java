package com.wizonsoft.tests;

import static com.github.wasiqb.coteafs.selenium.config.ConfigUtil.appSetting;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.wizonsoft.action.CreateAccountAction;
import com.wizonsoft.action.MainPageAction;
import com.wizonsoft.action.RegistrationAction;
import com.wizonsoft.pages.MainPage;

/**
 * @since Jun 29, 2019
 *
 */
public class RegisterUserTests extends BrowserTest {

	/**
	 * @since Jun 29, 2019
	 */
	@Test
	public void registerUserTest () {
		final CreateAccountAction createAccount = new CreateAccountAction ();
		createAccount.perform ();
		final RegistrationAction register = new RegistrationAction ();
		register.perform ();
	}

	/**
	 * @since Jun 29, 2019
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
