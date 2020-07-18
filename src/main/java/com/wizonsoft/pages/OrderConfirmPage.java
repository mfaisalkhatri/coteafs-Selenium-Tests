package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class OrderConfirmPage extends BrowserPage {

	/**
	 * @return Confirmation Message
	 */
	public IMouseActions confirmMessage () {
		return this.onClickable (By.cssSelector ("#layer_cart > div > div.layer_cart_product >h2"),
			"Confirm Message");
	}

	/**
	 * @return Product color and size
	 */
	public IMouseActions productDetail () {
		return this.onClickable (By.id ("layer_cart_product_attributes"), "Priduct Detail");
	}

	/**
	 * @return Product quantity
	 */
	public IMouseActions quantity () {
		return this.onClickable (By.id ("layer_cart_product_quantity"), "Quantity");
	}

	/**
	 * @return Total Sale Value excluding Shipping
	 */
	public IMouseActions productSaleValue () {
		return this.onClickable (By.id ("layer_cart_product_price"), "Product Sale Value");
	}

	/**
	 * @return Total Products Value excluding Shipping
	 */
	public IMouseActions totalProductValue () {
		return this.onClickable (
			By.cssSelector (
				"#layer_cart > div.clearfix > div.layer_cart_cart > div:nth-child(2) > span"),
			"Total Product Value");

	}

	/**
	 * @return Total Shipping Value
	 */
	public IMouseActions totalShipping () {
		return this.onClickable (
			By.cssSelector (
				"#layer_cart > div.clearfix > div.layer_cart_cart > div:nth-child(3) > span"),
			"Total Shipping");
	}

	/**
	 * @return Total Sale Value including Shipping
	 */
	public IMouseActions totalSaleValue () {
		return this.onClickable (
			By.cssSelector (
				"#layer_cart > div.clearfix > div.layer_cart_cart > div:nth-child(4) > span"),
			"Total Sale Value");

	}

	/**
	 * @return Proceed to checkout
	 */
	public IMouseActions proceedToCheckout () {
		return this.onClickable (
			By.cssSelector (".button-container > .btn-default[title='Proceed to checkout']"),
			"Proceed to Checkout");
	}

}
