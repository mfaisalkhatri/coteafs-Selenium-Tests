package com.wizonsoft.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.LoggedInPage;

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
	public void perform () {
		signoutWebsite ();
	}

	private void signoutWebsite () {
		this.loggedInPage.signOut ()
			.verifyDisplayed ()
			.isTrue ();
		this.loggedInPage.signOut ()
			.verifyText ()
			.isEqualTo ("Sign out");
	}
}
