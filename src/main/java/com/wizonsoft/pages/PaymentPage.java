package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class PaymentPage extends BrowserPage {

	/**
	 * @return Payment Table
	 */
	public IMouseActions paymentTable () {
		return this.onClickable (By.id ("cart_summary"), "Payment Table");
	}

	/**
	 * @return Unit Price
	 */
	public IMouseActions unitPrice () {
		return paymentTable ().find (By.cssSelector ("tbody > tr > td.cart_unit > span.price"),
			"Unit Price");
	}

	/**
	 * @return Quantity
	 */
	public IMouseActions quantity () {
		return paymentTable ()
			.find (By.cssSelector ("tbody > tr> td.cart_quantity.text-center > span"), "Quantity");
	}

	/**
	 * @return Total Price excluding Shipping
	 */
	public IMouseActions totalPrice () {
		return paymentTable ().find (
			By.cssSelector ("tfoot > tr.cart_total_price > td#total_product.price"), "Total Price");
	}

	/**
	 * @return Total Shipping
	 */
	public IMouseActions totalShipping () {
		return paymentTable ().find (
			By.cssSelector ("tfoot > tr.cart_total_delivery > td#total_shipping.price"),
			"Total Shipping");
	}

	/**
	 * @return Grand Total
	 */
	public IMouseActions grandTotal () {
		return paymentTable ().find (
			By.cssSelector (
				"tfoot > tr.cart_total_price > td#total_price_container.price > span#total_price"),
			" Grand Total");
	}

	/**
	 * @return Pay by Check
	 */
	public IMouseActions payBycheck () {
		return this.onClickable (By.cssSelector ("#HOOK_PAYMENT > div > div >p > a.cheque"),
			"Pay By Check");
	}

	/**
	 * @return Confirm Payment
	 */
	public IMouseActions confirmPayment () {
		return this.onClickable (By.cssSelector ("#cart_navigation > button"), "Confirm Payment");
	}

	/**
	 * @return Success Message
	 */
	public IMouseActions successMessage () {
		return this.onClickable (By.cssSelector ("#center_column > p.alert.alert-success"),
			"Success Message");
	}

}
