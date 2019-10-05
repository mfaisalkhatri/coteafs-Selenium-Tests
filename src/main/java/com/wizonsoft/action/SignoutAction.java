package com.wizonsoft.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.LoggedInPage;

import io.qameta.allure.Step;

/**
 * @since Jun 29, 2019
 *
 */
public class SignoutAction extends AbstractPageAction <SignoutAction> {

	private final LoggedInPage loggedInPage;

	/**
	 * @author Faisal Khatri
	 */
	public SignoutAction () {
		this.loggedInPage = new LoggedInPage ();
	}

	@Override
	@Step("Sign out of the website")
	public void perform () {
		this.loggedInPage.signOut ()
		.waitUntilVisible ();
		this.loggedInPage.signOut ()
		.verifyDisplayed ()
		.isTrue ();
		this.loggedInPage.signOut ()
		.verifyText ()
		.isEqualTo ("Sign out");
		this.loggedInPage.signOut ()
		.click ();
	}
}
