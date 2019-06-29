package com.wizonsoft.pages;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.PageFactory;
import com.github.wasiqb.coteafs.selenium.core.annotation.Find;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

/**
 * @since Jun 29, 2019
 *
 */
public class LoginPage extends BrowserPage {

	@Find (id = "SubmitCreate")
	private IMouseActions	createAccountButton;
	@Find (id = "email_create")
	private ITextboxActions	emailId;
	@Find (id = "passwd")
	private ITextboxActions	password;
	@Find (id = "SubmitLogin")
	private IMouseActions	signInButton;
	@Find (id = "email")
	private ITextboxActions	signInEmail;

	/**
	 * @author Faisal Khatri
	 */
	public LoginPage () {
		PageFactory.init (this);
	}

	/**
	 * @since Jun 29, 2019
	 * @return submit button
	 */
	public IMouseActions createAccountButton () {
		return this.createAccountButton;
	}

	/**
	 * @since Jun 29, 2019
	 * @return email Id
	 */
	public ITextboxActions emailId () {
		return this.emailId;
	}

	/**
	 * @since Jun 29, 2019
	 * @return password
	 */
	public ITextboxActions password () {
		return this.password;
	}

	/**
	 * @since Jun 29, 2019
	 * @return signIn Button
	 */
	public IMouseActions signInButton () {
		return this.signInButton;
	}

	/**
	 * @since Jun 29, 2019
	 * @return signin Email
	 */
	public ITextboxActions signInEmail () {
		return this.signInEmail;
	}
}
