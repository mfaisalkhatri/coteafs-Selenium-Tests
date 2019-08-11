package com.wizonsoft.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
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
		return onTextbox (By.id ("address1"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return address line 2
	 */
	public ITextboxActions addressLine2 () {
		return onTextbox (By.id ("address2"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return city
	 */
	public ITextboxActions city () {
		return onTextbox (By.id ("city"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return company
	 */
	public ITextboxActions company () {
		return onTextbox (By.id ("company"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return country
	 */
	public ISelectboxActions country () {
		return onDropdown (By.id ("id_country"));
	}

	/**
	 * @since Jul 11, 2019
	 * @return element
	 */
	public ISelectboxActions parentOfDay () {
		return onDropdown (By.id ("uniform-days"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return day
	 */
	public ISelectboxActions day () {
		return parentOfDay ().find (By.id ("days"));
	}

	/**
	 * @since Jul 13, 2019
	 * @return parent field for months
	 */
	public ISelectboxActions parentOfMonths () {
		return onDropdown (By.id ("uniform-months"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return month
	 */
	public ISelectboxActions month () {
		return parentOfMonths ().find (By.id ("months"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return First Name
	 */
	public ITextboxActions firstName () {
		return onTextbox (By.id ("customer_firstname"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return lastname
	 */
	public ITextboxActions lastName () {
		return onTextbox (By.id ("customer_lastname"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return mobilephone
	 */
	public ITextboxActions mobilePhone () {
		return onTextbox (By.id ("phone_mobile"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mr Radio button
	 */
	public IMouseActions mrRadioBtn () {
		return onClickable (By.id ("uniform-id_gender1"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mrs Radio button
	 */
	public IMouseActions mrsRadioBtn () {
		return onClickable (By.id ("uniform-id_gender2"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return password
	 */
	public ITextboxActions password () {
		return onTextbox (By.id ("passwd"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return receive offers
	 */
	public IMouseActions receiveOffers () {
		return onClickable (By.id ("optin"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return register button
	 */
	public IMouseActions registerButton () {
		return onClickable (By.id ("submitAccount"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return signup checkbox
	 */
	public IMouseActions signUp () {
		return onClickable (By.id ("newsletter"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return parent field for state
	 */
	public ISelectboxActions parentOfState () {
		return onDropdown (By.id ("uniform-id_state"));
	}

	/**
	 * @since Jul 13, 2019
	 * @return state field
	 */
	public ISelectboxActions state () {
		return parentOfState ().find (By.id ("id_state"));
	}

	/**
	 * @since Jul 13, 2019
	 * @return parent field for years
	 */
	public ISelectboxActions parentOfYears () {
		return onDropdown (By.id ("uniform-years"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return year
	 */
	public ISelectboxActions year () {
		return parentOfYears ().find (By.id ("years"));
	}

	/**
	 * @since Jun 29, 2019
	 * @return zip code
	 */
	public ITextboxActions zipCode () {
		return onTextbox (By.id ("postcode"));
	}

}
