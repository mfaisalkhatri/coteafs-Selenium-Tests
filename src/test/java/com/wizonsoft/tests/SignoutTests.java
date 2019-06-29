package com.wizonsoft.tests;

import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.wizonsoft.action.SignoutAction;

/**
 * @since Jun 29, 2019
 *
 */
public class SignoutTests extends BrowserTest {

	/**
	 * @since Jun 29, 2019
	 */
	@Test
	public void testSignOut () {
		final SignoutAction signout = new SignoutAction ();
		signout.perform ();

	}
}
