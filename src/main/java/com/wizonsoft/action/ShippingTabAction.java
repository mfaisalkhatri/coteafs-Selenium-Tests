package com.wizonsoft.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.ShippingTabPage;

import io.qameta.allure.Step;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class ShippingTabAction extends AbstractPageAction <ShippingTabAction>{

	@Override

	@Step("Agree the terms and Proceed to checkout from Shipping Tab")

	public void perform () {
		final ShippingTabPage shippingTab = new ShippingTabPage ();
		shippingTab.agreeTerms ().click ();
		shippingTab.proceedToCheckout ().click ();
	}


}
