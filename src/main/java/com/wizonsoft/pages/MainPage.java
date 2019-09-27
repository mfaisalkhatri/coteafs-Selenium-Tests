package com.wizonsoft.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @since Jun 29, 2019
 *
 */
public class MainPage extends BrowserPage {

	/**
	 * @since Jun 29, 2019
	 * @return action
	 */
	public IMouseActions signIn () {
		return this.onClickable (By.linkText ("Sign in"));
	}

	/**
	 * @param mainMenu
	 * @return action
	 */
	public IMouseActions openMenu (final String mainMenu) {
		return this.openMenu (mainMenu, null);
	}

	/**
	 * @param mainMenu
	 * @param subMenu
	 * @return menu
	 */
	public IMouseActions openMenu (final String mainMenu, final String subMenu) {
		final IMouseActions menu = this.menubar ().finds (By.cssSelector("ul > li"))
			.stream ()
			.filter (m -> m.isDisplayed () && m.text ()
				.contains (mainMenu))
			.findFirst ()
			.get ();

		if (!StringUtils.isEmpty (subMenu)) {
			menu.hover ();
			return menu.finds (By.cssSelector ("ul.submenu-container > li > ul > li > a"))
				.stream ()
				.filter (m -> m.isDisplayed () && m.text ()
					.contains (subMenu))
				.findFirst ()
				.get ();
		}
		return menu;

	}


	/**
	 * @return productPic
	 */
	public IMouseActions productPic () {
		return this.onClickable (By.cssSelector ("#center_column > ul > li > div > div.left-block > div"));

	}

	/**
	 * @return price
	 */
	public IMouseActions productPrice( ) {
		return this.onClickable (By.cssSelector ("#center_column > ul > li > div > div.right-block > div.content_price > span"));
	}
	/**
	 * @return menubar
	 */
	public IMouseActions menubar () {
		return this.onClickable (By.id ("block_top_menu"));
	}

}
