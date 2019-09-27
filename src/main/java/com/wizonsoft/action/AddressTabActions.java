package com.wizonsoft.action;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.AddressTabPage;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class AddressTabActions extends AbstractPageAction <AddressTabActions>{

	@Override
	public void perform () {
		final AddressTabPage addressPage = new AddressTabPage ();
		addressPage.proceedToCheckout ().click ();

	}

}
