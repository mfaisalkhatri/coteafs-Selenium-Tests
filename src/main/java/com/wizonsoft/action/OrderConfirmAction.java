package com.wizonsoft.action;

import org.testng.Assert;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.OrderConfirmPage;


/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class OrderConfirmAction extends AbstractPageAction <OrderConfirmAction>{

	@Override
	public void perform () {
		final OrderConfirmPage confirmPage = new OrderConfirmPage ();
		final String confirmMessage = confirmPage.confirmMessage ().text ();
		Assert.assertEquals (confirmMessage, "Product successfully added to your shopping cart");

		final String quantity = confirmPage.quantity ().text ();
		Assert.assertEquals (quantity, this.value("Quantity"));

		final String total = confirmPage.productSaleValue ().text ();
		Assert.assertEquals (total, this.value("Total"));

		final String totalProductValue = confirmPage.totalProductValue ().text ();
		Assert.assertEquals (totalProductValue, this.value ("TotalProducts"));

		final String totalShipping = confirmPage.totalShipping ().text ();
		Assert.assertEquals (totalShipping, "$2.00");

		final String totalSaleValue = confirmPage.totalSaleValue ().text ();
		Assert.assertEquals (totalSaleValue, this.value ("TotalSaleValue"));

		confirmPage.proceedToCheckout ().click ();
	}



}
