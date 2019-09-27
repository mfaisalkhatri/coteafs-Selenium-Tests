package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class ShippingTabPage extends BrowserPage{

	/**
	 * @return agreeTerms checkbox
	 */
	public IMouseActions agreeTerms () {
		return this.onClickable (By.id ("uniform-cgv"));
	}

	/**
	 * @return Proceed To Checkout button
	 */
	public IMouseActions proceedToCheckout () {
		return this.onClickable (By.cssSelector ("#form > p > button"));
	}

}
