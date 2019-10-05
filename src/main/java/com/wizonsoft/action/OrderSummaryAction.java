package com.wizonsoft.action;

import org.testng.Assert;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.OrderSummaryPage;

import io.qameta.allure.Step;


/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class OrderSummaryAction extends AbstractPageAction <OrderSummaryAction> {

	@Override

	@Step("Checking the Order Summary page and asserting values are displayed correclty as per order placed")

	public void perform () {
		final OrderSummaryPage orderSummary = new OrderSummaryPage ();
		final String unitPrice = orderSummary.unitPrice ()
			.text ();
		Assert.assertEquals (unitPrice, this.value ("Unit Price"));

		//changed from text to attribute
		final String quantity = orderSummary.quantity ().attribute ("value");
		Assert.assertEquals (quantity, this.value ("Quantity"));

		final String totalPrice = orderSummary.totalPrice ()
			.text ();
		Assert.assertEquals (totalPrice, this.value ("Total Price"));

		final String totalProduct = orderSummary.totalProducts ()
			.text ();
		Assert.assertEquals (totalProduct, this.value ("Total Products"));

		final String totalShipping = orderSummary.totalShipping ()
			.text ();
		Assert.assertEquals (totalShipping, this.value ("Total Shipping"));

		final String grandTotal = orderSummary.grandTotal ()
			.text ();
		Assert.assertEquals (grandTotal, this.value ("Grand Total"));

		orderSummary.proceedTocheckout ().click ();
	}

}
