package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ISelectboxActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

/**
 * @author Faisal Khatri
 * @since 26-Sep-2019
 */
public class OrderPage extends BrowserPage{


	/**
	 * @return price
	 */
	public IMouseActions productPrice () {
		return this.onClickable (By.cssSelector ("#our_price_display"));
	}

	/**
	 * @return quantity
	 */
	public ITextboxActions quantity () {
		return this.onTextbox (By.id("quantity_wanted"));
	}

	/**
	 * @return size
	 */
	public ISelectboxActions size () {
		return this.onDropdown (By.id("group_1"));
	}

	/**
	 * @return add to card button
	 */
	public IMouseActions addToCart () {
		return this.onClickable (By.cssSelector (".box-cart-bottom >div >p#add_to_cart > button"));
	}

	/**
	 * @return orange Color
	 */
	public IMouseActions orangeColor () {
		return this.onClickable (By.id("color_13"));
	}

	/**
	 * @return blue color
	 */
	public IMouseActions blueColor () {
		return this.onClickable (By.id("color_14"));
	}
}
