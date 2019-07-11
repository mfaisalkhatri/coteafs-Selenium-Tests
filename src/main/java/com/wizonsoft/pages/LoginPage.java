package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

/**
 * @since Jun 29, 2019
 *
 */
public class LoginPage extends BrowserPage {

	/**
	 * @since Jun 29, 2019
	 * @return submit button
	 */
	public IMouseActions createAccountButton () {
		return onElement (By.id ("SubmitCreate"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return email Id
	 */
	public ITextboxActions emailId () {
		return onElement (By.id ("email_create"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return password
	 */
	public ITextboxActions password () {
		return onElement (By.id ("passwd"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return signIn Button
	 */
	public IMouseActions signInButton () {
		return onElement (By.id ("SubmitLogin"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return signin Email
	 */
	public ITextboxActions signInEmail () {
		return onElement (By.id ("email"));
	}
}
