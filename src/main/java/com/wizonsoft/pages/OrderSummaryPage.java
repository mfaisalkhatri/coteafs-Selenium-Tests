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
		return this.onClickable (By.id ("cart_summary"), "Order Summary Table");
	}

	/**
	 * @return Unit Price of the Product
	 */
	public IMouseActions unitPrice () {
		return orderSummaryTable ().find (By.cssSelector ("tbody > tr > td.cart_unit > span.price"),
			"Unit Price");
	}

	/**
	 * @return Quantity of the product
	 */
	public IMouseActions quantity () {
		return orderSummaryTable ().find (
			By.cssSelector ("tbody > tr > td.cart_quantity > .cart_quantity_input"), "Quantity");
	}

	/**
	 * @return Total Price of the product excluding Shipping
	 */
	public IMouseActions totalPrice () {
		return orderSummaryTable ()
			.find (By.cssSelector ("tbody > tr > td.cart_total > span.price"), "Total Price");

	}

	/**
	 * @return Total product price
	 */
	public IMouseActions totalProducts () {
		return orderSummaryTable ().find (
			By.cssSelector ("tfoot > tr.cart_total_price > td#total_product"), "Total Products");
	}

	/**
	 * @return Total Shipping Charge
	 */
	public IMouseActions totalShipping () {
		return orderSummaryTable ().find (
			By.cssSelector ("tfoot > tr.cart_total_delivery > td#total_shipping.price"),
			"Total Shipping");
	}

	/**
	 * @return Grand Total
	 */
	public IMouseActions grandTotal () {
		return orderSummaryTable ().find (
			By.cssSelector (
				"tfoot > tr.cart_total_price > td#total_price_container > span#total_price"),
			"Grand Total");
	}

	/**
	 * @return Proceed to Checkout Button
	 */
	public IMouseActions proceedTocheckout () {
		return this.onClickable (
			By.cssSelector ("#center_column > p.cart_navigation > a.button.btn-default"),
			"Proceed to Checkout");
	}

}
