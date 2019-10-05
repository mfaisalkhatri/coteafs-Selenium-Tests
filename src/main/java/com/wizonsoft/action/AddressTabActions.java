package com.wizonsoft.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.AddressTabPage;

import io.qameta.allure.Step;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class AddressTabActions extends AbstractPageAction <AddressTabActions>{

	@Override
	@Step("Confirm the address for shipping the order")
	public void perform () {
		final AddressTabPage addressPage = new AddressTabPage ();
		addressPage.proceedToCheckout ().click ();

	}

}
