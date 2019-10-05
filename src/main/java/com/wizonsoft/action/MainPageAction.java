package com.wizonsoft.action;


import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.MainPage;

import io.qameta.allure.Step;

/**
 * @since Jun 29, 2019
 *
 */
public class MainPageAction extends AbstractPageAction <MainPageAction> {


	@Override
	@Step("Click on Sign In button")
	public void perform () {
		final MainPage mainPage = new MainPage ();
		mainPage.signIn ()
		.click ();
	}

}
