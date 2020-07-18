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
		return onTextbox (By.id ("address1"), "Address Line 1");
	}

	/**
	 * @since Jun 29, 2019
	 * @return address line 2
	 */
	public ITextboxActions addressLine2 () {
		return onTextbox (By.id ("address2"), "Address Line 2");
	}

	/**
	 * @since Jun 29, 2019
	 * @return city
	 */
	public ITextboxActions city () {
		return onTextbox (By.id ("city"), "City");
	}

	/**
	 * @since Jun 29, 2019
	 * @return company
	 */
	public ITextboxActions company () {
		return onTextbox (By.id ("company"), "Company");
	}

	/**
	 * @since Jun 29, 2019
	 * @return country
	 */
	public ISelectboxActions country () {
		return onDropdown (By.id ("id_country"), "Country");
	}

	/**
	 * @since Jul 11, 2019
	 * @return element
	 */
	public ISelectboxActions parentOfDay () {
		return onDropdown (By.id ("uniform-days"), "Parent of Day");
	}

	/**
	 * @since Jun 29, 2019
	 * @return day
	 */
	public ISelectboxActions day () {
		return parentOfDay ().find (By.id ("days"), "Day");
	}

	/**
	 * @since Jul 13, 2019
	 * @return parent field for months
	 */
	public ISelectboxActions parentOfMonths () {
		return onDropdown (By.id ("uniform-months"), "Parent of Months");
	}

	/**
	 * @since Jun 29, 2019
	 * @return month
	 */
	public ISelectboxActions month () {
		return parentOfMonths ().find (By.id ("months"), "Month");
	}

	/**
	 * @since Jun 29, 2019
	 * @return First Name
	 */
	public ITextboxActions firstName () {
		return onTextbox (By.id ("customer_firstname"), "First Name");
	}

	/**
	 * @since Jun 29, 2019
	 * @return lastname
	 */
	public ITextboxActions lastName () {
		return onTextbox (By.id ("customer_lastname"), "Last Name");
	}

	/**
	 * @since Jun 29, 2019
	 * @return mobilephone
	 */
	public ITextboxActions mobilePhone () {
		return onTextbox (By.id ("phone_mobile"), "Mobile Phone");
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mr Radio button
	 */
	public IMouseActions mrRadioBtn () {
		return onClickable (By.id ("uniform-id_gender1"), "Mr Radio Button");
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mrs Radio button
	 */
	public IMouseActions mrsRadioBtn () {
		return onClickable (By.id ("uniform-id_gender2"), "Mrs Radio Button");
	}

	/**
	 * @since Jun 29, 2019
	 * @return password
	 */
	public ITextboxActions password () {
		return onTextbox (By.id ("passwd"), "Pasword");
	}

	/**
	 * @since Jun 29, 2019
	 * @return receive offers
	 */
	public IMouseActions receiveOffers () {
		return onClickable (By.id ("optin"), "Receive Offers checkbox");
	}

	/**
	 * @since Jun 29, 2019
	 * @return register button
	 */
	public IMouseActions registerButton () {
		return onClickable (By.id ("submitAccount"), "Register Button");
	}

	/**
	 * @since Jun 29, 2019
	 * @return signup checkbox
	 */
	public IMouseActions signUp () {
		return onClickable (By.id ("newsletter"), "Sign Up");
	}

	/**
	 * @since Jun 29, 2019
	 * @return parent field for state
	 */
	public ISelectboxActions parentOfState () {
		return onDropdown (By.id ("uniform-id_state"), "Parent of State");
	}

	/**
	 * @since Jul 13, 2019
	 * @return state field
	 */
	public ISelectboxActions state () {
		return parentOfState ().find (By.id ("id_state"), "State");
	}

	/**
	 * @since Jul 13, 2019
	 * @return parent field for years
	 */
	public ISelectboxActions parentOfYears () {
		return onDropdown (By.id ("uniform-years"), "Parent of Years");
	}

	/**
	 * @since Jun 29, 2019
	 * @return year
	 */
	public ISelectboxActions year () {
		return parentOfYears ().find (By.id ("years"), "Year");
	}

	/**
	 * @since Jun 29, 2019
	 * @return zip code
	 */
	public ITextboxActions zipCode () {
		return onTextbox (By.id ("postcode"), "Zip Code");
	}

}
