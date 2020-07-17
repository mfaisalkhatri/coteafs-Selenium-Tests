package com.wizonsoft.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import com.github.wasiqb.coteafs.selenium.config.ConfigUtil;
import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.wizonsoft.action.CreateAccountAction;
import com.wizonsoft.action.MainPageAction;
import com.wizonsoft.action.RegistrationAction;
import com.wizonsoft.pages.MainPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

/**
 * @since Jun 29, 2019
 *
 */
@Epic ("Automation Framework tests")
@Feature ("User Registration")
@Listeners ({ ReportPortalTestNGListener.class })
public class RegisterUserTests extends BrowserTest {

	/**
	 * @since Jun 29, 2019
	 */
	@Test
	@Description ("Test for creating a new account")
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
	@Step ("Setup browser to run the tests")
	public void setupMethod () {
		final MainPage mainPage = new MainPage ();
		mainPage.onDriver ()
			.navigateTo (ConfigUtil.appSetting ()
				.getUrl ());
		final MainPageAction mainPageAction = new MainPageAction ();
		mainPageAction.perform ();
	}
}
