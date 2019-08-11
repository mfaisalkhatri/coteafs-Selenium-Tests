package com.wizonsoft.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.LoginPage;

/**
 * @since Jul 14, 2019
 *
 */
public class SigninUserAction extends AbstractPageAction <SigninUserAction> {

	private final LoginPage loginPage;

	/**
	 * @author Faisal Khatri
	 */
	public SigninUserAction () {
		this.loginPage = new LoginPage ();
	}

	@Override
	public void perform () {
	}

	/**
	 * This method helps user to signin in the website using email and password as
	 * paramters.
	 *
	 * @param emailId
	 * @param password
	 * @since Jul 14, 2019
	 */
	public void signinUser (final String emailId, final String password) {
		this.loginPage.signInEmail ()
			.clear ();
		this.loginPage.signInEmail ()
			.enterText (emailId);

		this.loginPage.password ()
			.clear ();
		this.loginPage.password ()
			.enterText (password);

		this.loginPage.signInButton ()
			.click ();
	}

}
