package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @since Jun 29, 2019
 *
 */
public class LoggedInPage extends BrowserPage {

	/**
	 * @since Jun 29, 2019
	 * @return signout
	 */
	public IMouseActions signOut () {
		return onClickable (By.linkText ("Sign out"));
	}

}
