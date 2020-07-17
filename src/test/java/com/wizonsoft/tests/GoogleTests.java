package com.wizonsoft.tests;

import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.wizonsoft.guru99.action.GooglePageAction;

/**
 * @since Apr 21, 2020
 *
 */
public class GoogleTests extends BrowserTest {

	/**
	 * @since Apr 21, 2020
	 */
	@Test
	public void googleTest () {
		final GooglePageAction action = new GooglePageAction ();
		action.perform ();
	}
}
