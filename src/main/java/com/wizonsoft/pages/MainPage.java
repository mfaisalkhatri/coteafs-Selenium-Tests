package com.wizonsoft.pages;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.PageFactory;
import com.github.wasiqb.coteafs.selenium.core.annotation.Find;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @since Jun 29, 2019
 *
 */
public class MainPage extends BrowserPage {

	@Find (linkText = "Sign in")
	private IMouseActions signInLink;

	/**
	 * @author Faisal Khatri
	 */
	public MainPage () {
		PageFactory.init (this);
	}

	/**
	 * @since Jun 29, 2019
	 * @return action
	 */
	public IMouseActions signIn () {
		return this.signInLink;
	}

}
