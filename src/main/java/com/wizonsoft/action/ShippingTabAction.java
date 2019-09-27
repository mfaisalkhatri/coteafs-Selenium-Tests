package com.wizonsoft.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.ShippingTabPage;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class ShippingTabAction extends AbstractPageAction <ShippingTabAction>{

	@Override
	public void perform () {
		final ShippingTabPage shippingTab = new ShippingTabPage ();
		shippingTab.agreeTerms ().click ();
		shippingTab.proceedToCheckout ().click ();
	}


}
