package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IElementActions;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ISelectboxActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

/**
 * @since Jun 29, 2019
 *
 */
public class RegistrationPage extends BrowserPage {

	/**
	 * @since Jun 29, 2019
	 * @return Address Line 1
	 */
	public ITextboxActions addressLine1 () {
		return onElement (By.id ("address1"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return address line 2
	 */
	public ITextboxActions addressLine2 () {
		return onElement (By.id ("address2"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return city
	 */
	public ITextboxActions city () {
		return onElement (By.id ("city"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return company
	 */
	public ITextboxActions company () {
		return onElement (By.id ("company"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return country
	 */
	public ISelectboxActions country () {
		return onElement (By.id ("id_country"));
	}

	/**
	 * @since Jul 11, 2019
	 * @return element
	 */
	public IElementActions parentOfDay () {
		return onElement (By.id ("uniform-days"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return day
	 */
	public ISelectboxActions day () {
		// return onElement (By
		// .cssSelector ("div.account_creation > div.form-group div#uniform-days >
		// select#days"));
		return parentOfDay ().find (By.id ("days"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return First Name
	 */
	public ITextboxActions firstName () {
		return onElement (By.id ("customer_firstname"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return lastname
	 */
	public ITextboxActions lastName () {
		return onElement (By.id ("customer_lastname"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return mobilephone
	 */
	public ITextboxActions mobilePhone () {
		return onElement (By.id ("phone_mobile"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return month
	 */
	public ISelectboxActions month () {
		return onElement (By.id ("months"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mr Radio button
	 */
	public IMouseActions mrRadioBtn () {
		return onElement (By.id ("uniform-id_gender1"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mrs Radio button
	 */
	public IMouseActions mrsRadioBtn () {
		return onElement (By.id ("uniform-id_gender2"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return password
	 */
	public ITextboxActions password () {
		return onElement (By.id ("passwd"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return receive offers
	 */
	public IMouseActions receiveOffers () {
		return onElement (By.id ("optin"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return register button
	 */
	public IMouseActions registerButton () {
		return onElement (By.id ("submitAccount"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return signup checkbox
	 */
	public IMouseActions signUp () {
		return onElement (By.id ("newsletter"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return state
	 */
	public ISelectboxActions state () {
		return onElement (By.id ("uniform-id_state"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return year
	 */
	public ISelectboxActions year () {
		return onElement (By.id ("years"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return zip code
	 */
	public ITextboxActions zipCode () {
		return onElement (By.id ("postcode"));
	}

}
