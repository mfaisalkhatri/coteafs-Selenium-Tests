package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class AddressTabPage extends BrowserPage {

	/**
	 * @return Proceed to Checkout button
	 */
	public IMouseActions proceedToCheckout () {
		return this.onClickable (By.cssSelector ("#center_column > form > p > button"),
			"Proceed to Checkout");
	}
}
