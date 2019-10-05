package com.wizonsoft.action;

import org.testng.Assert;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.PaymentPage;
import io.qameta.allure.Step;


/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class PaymentPageActions extends AbstractPageAction <PaymentPageActions> {

	@Override

	@Step("Check the Final Order details and complete the order by paying using cheque")
	public void perform () {
		final PaymentPage paymentPage = new PaymentPage ();
		final String unitPrice = paymentPage.unitPrice ()
			.text ();
		Assert.assertEquals (unitPrice, this.value ("Unit Price"));

		final String quantity = paymentPage.quantity ()
			.text ();
		Assert.assertEquals (quantity, this.value ("Quantity"));

		final String totalPrice = paymentPage.totalPrice ()
			.text ();
		Assert.assertEquals (totalPrice, this.value ("Total Price"));

		final String totalShipping = paymentPage.totalShipping ()
			.text ();
		Assert.assertEquals (totalShipping, this.value ("Total Shipping"));

		final String grandTotal = paymentPage.grandTotal ()
			.text ();
		Assert.assertEquals (grandTotal, this.value ("Grand Total"));

		paymentPage.payBycheck ()
		.click ();

		paymentPage.confirmPayment ()
		.click ();
		final String successMessage = paymentPage.successMessage ()
			.text ();
		Assert.assertEquals (successMessage, "Your order on My Store is complete.");
		<<<<<<< HEAD
		paymentPage.onDriver ()
		.driverWait ()
		=======
		>>>>>>> 77273ba5f999af902ed80aa6d745c07302476242

	}

}
