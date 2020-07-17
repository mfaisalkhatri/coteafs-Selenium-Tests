package com.wizonsoft.guru99.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

/**
 * @since Apr 21, 2020
 *
 */
public class GooglePage extends BrowserPage {

	/**
	 * @since Apr 21, 2020
	 * @return search textbox
	 */
	public ITextboxActions searchBox () {
		return onTextbox (By.name ("q"));
	}

	/**
	 * @since Apr 21, 2020
	 * @return search button
	 */
	public IMouseActions searchBtn () {
		return onClickable (By.name ("btnK"));
	}
}
