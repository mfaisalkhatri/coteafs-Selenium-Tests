package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class PaymentPage extends BrowserPage{


	/**
	 * @return Payment Table
	 */
	public IMouseActions paymentTable () {
		return this.onClickable (By.id ("cart_summary"));
	}
	/**
	 * @return Unit Price
	 */
	public IMouseActions unitPrice () {
		return this.paymentTable ().find (By.cssSelector ("tbody > tr > td.cart_unit > span.price"));
	}

	/**
	 * @return Quantity
	 */
	public IMouseActions quantity () {
		return this.paymentTable ().find (By.cssSelector ("tbody > tr> td.cart_quantity.text-center > span"));
	}

	/**
	 * @return Total Price excluding Shipping
	 */
	public IMouseActions totalPrice () {
		return this.paymentTable().find(By.cssSelector ("tfoot > tr.cart_total_price > td#total_product.price"));
	}

	/**
	 * @return Total Shipping
	 */
	public IMouseActions totalShipping () {
		return this.paymentTable().find(By.cssSelector ("tfoot > tr.cart_total_delivery > td#total_shipping.price"));
	}

	/**
	 * @return Grand Total
	 */
	public IMouseActions grandTotal () {
		return this.paymentTable().find (By.cssSelector("tfoot > tr.cart_total_price > td#total_price_container.price > span#total_price"));
	}


	/**
	 * @return Pay by Check
	 */
	public IMouseActions payBycheck () {
		return this.onClickable (By.cssSelector ("#HOOK_PAYMENT > div > div >p > a.cheque"));
	}

	/**
	 * @return Confirm Payment
	 */
	public IMouseActions confirmPayment() {
		return this.onClickable (By.cssSelector ("#cart_navigation > button"));
	}

	/**
	 * @return Success Message
	 */
	public IMouseActions successMessage () {
		return this.onClickable (By.cssSelector ("#center_column > p.alert.alert-success"));
	}

}
