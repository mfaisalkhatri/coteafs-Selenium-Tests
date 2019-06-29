package com.wizonsoft.action;

import com.github.javafaker.Faker;
import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.LoginPage;

/**
 * @since Jun 29, 2019
 *
 */
public class CreateAccountAction extends AbstractPageAction <CreateAccountAction> {

	private final LoginPage loginPage;

	/**
	 * @author Faisal Khatri
	 */
	public CreateAccountAction () {
		this.loginPage = new LoginPage ();
	}

	@Override
	public void perform () {
		createNewLogin ();
	}

	private void createNewLogin () {
		final Faker faker = Faker.instance ();
		this.loginPage.emailId ()
			.click ();
		this.loginPage.emailId ()
			.clear ();
		this.loginPage.emailId ()
			.enterText (faker.internet ()
				.emailAddress ());
		this.loginPage.createAccountButton ()
			.click ();
	}
}
