package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class OrderSummaryPage extends BrowserPage {

	/**
	 * @return Order Summary Table
	 */
	public IMouseActions orderSummaryTable () {
		return this.onClickable (By.id ("cart_summary"));
	}

	/**
	 * @return Unit Price of the Product
	 */
	public IMouseActions unitPrice () {
		return this.orderSummaryTable ()
			.find (By.cssSelector ("tbody > tr > td.cart_unit > span.price"));
	}

	/**
	 * @return Quantity of the product
	 */
	public IMouseActions quantity () {
		return this.orderSummaryTable ()
			.find (By.cssSelector ("tbody > tr > td.cart_quantity > .cart_quantity_input"));
	}

	/**
	 * @return Total Price of the product excluding Shipping
	 */
	public IMouseActions totalPrice () {
		return this.orderSummaryTable ()
			.find (By.cssSelector ("tbody > tr > td.cart_total > span.price"));

	}

	/**
	 * @return Total product price
	 */
	public IMouseActions totalProducts () {
		return this.orderSummaryTable ().find (By.cssSelector ("tfoot > tr.cart_total_price > td#total_product"));
	}


	/**
	 * @return Total Shipping Charge
	 */
	public IMouseActions totalShipping () {
		return this.orderSummaryTable ().find (By.cssSelector("tfoot > tr.cart_total_delivery > td#total_shipping.price"));
	}

	/**
	 * @return Grand Total
	 */
	public IMouseActions grandTotal() {
		return this.orderSummaryTable ().find (By.cssSelector ("tfoot > tr.cart_total_price > td#total_price_container > span#total_price"));
	}

	/**
	 * @return Proceed to Checkout Button
	 */
	public IMouseActions proceedTocheckout() {
		return this.onClickable (By.cssSelector ("#center_column > p.cart_navigation > a.button.btn-default"));
	}



}
