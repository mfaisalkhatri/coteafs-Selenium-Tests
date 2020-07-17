package com.wizonsoft.guru99.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.guru99.pages.GooglePage;

/**
 * @since Apr 21, 2020
 *
 */
public class GooglePageAction extends AbstractPageAction <GooglePageAction> {

	@Override
	public void perform () {
		final GooglePage page = new GooglePage ();
		page.searchBox ()
			.enterText ("Mobile Phones");
		page.searchBtn ()
			.click ();
		page.onDriver ()
			.verifyTitle ()
			.isEqualTo ("Mobile Phone - Google Search");
		System.out.println ("Google Search Complete!");
	}

}
