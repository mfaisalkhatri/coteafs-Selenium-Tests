package com.wizonsoft.pages;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.PageFactory;
import com.github.wasiqb.coteafs.selenium.core.annotation.Find;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ISelectboxActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

/**
 * @since Jun 29, 2019
 *
 */
public class RegistrationPage extends BrowserPage {

	@Find (id = "address1")
	private ITextboxActions		addressLine1;

	@Find (id = "address2")
	private ITextboxActions		addressLine2;

	@Find (id = "city")
	private ITextboxActions		city;

	@Find (id = "company")
	private ITextboxActions		company;

	@Find (id = "id_country")
	private ISelectboxActions	country;

	@Find (css = "#uniform-days > #days")
	private ISelectboxActions	day;

	@Find (name = "customer_firstname")
	private ITextboxActions		firstName;

	@Find (name = "customer_lastname")
	private ITextboxActions		lastName;

	@Find (id = "phone_mobile")
	private ITextboxActions		mobilePhone;

	@Find (css = "#months")
	private ISelectboxActions	month;

	@Find (css = "#uniform-id_gender1")
	private IMouseActions		mrRadioBtn;

	@Find (css = "#uniform-id_gender2")
	private IMouseActions		mrsRadioBtn;

	@Find (id = "passwd")
	private ITextboxActions		password;

	@Find (id = "optin")
	private IMouseActions		receiveOffers;

	@Find (id = "submitAccount")
	private IMouseActions		registerButton;

	@Find (id = "newsletter")
	private IMouseActions		signUp;

	@Find (id = "uniform-id_state")
	private ISelectboxActions	state;

	@Find (css = "#years")
	private ISelectboxActions	year;

	@Find (id = "postcode")
	private ITextboxActions		zipCode;

	/**
	 * @author Faisal Khatri
	 */
	public RegistrationPage () {
		PageFactory.init (this);
	}

	/**
	 * @since Jun 29, 2019
	 * @return Address Line 1
	 */
	public ITextboxActions addressLine1 () {
		return this.addressLine1;
	}

	/**
	 * @since Jun 29, 2019
	 * @return address line 2
	 */
	public ITextboxActions addressLine2 () {
		return this.addressLine2;
	}

	/**
	 * @since Jun 29, 2019
	 * @return city
	 */
	public ITextboxActions city () {
		return this.city;
	}

	/**
	 * @since Jun 29, 2019
	 * @return company
	 */
	public ITextboxActions company () {
		return this.company;
	}

	/**
	 * @since Jun 29, 2019
	 * @return country
	 */
	public ISelectboxActions country () {
		return this.country;
	}

	/**
	 * @since Jun 29, 2019
	 * @return day
	 */
	public ISelectboxActions day () {
		return this.day;
	}

	/**
	 * @since Jun 29, 2019
	 * @return First Name
	 */
	public ITextboxActions firstName () {
		return this.firstName;
	}

	/**
	 * @since Jun 29, 2019
	 * @return lastname
	 */
	public ITextboxActions lastName () {
		return this.lastName;
	}

	/**
	 * @since Jun 29, 2019
	 * @return mobilephone
	 */
	public ITextboxActions mobilePhone () {
		return this.mobilePhone;
	}

	/**
	 * @since Jun 29, 2019
	 * @return month
	 */
	public ISelectboxActions month () {
		return this.month;
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mr Radio button
	 */
	public IMouseActions mrRadioBtn () {
		return this.mrRadioBtn;
	}

	/**
	 * @since Jun 29, 2019
	 * @return Mrs Radio button
	 */
	public IMouseActions mrsRadioBtn () {
		return this.mrsRadioBtn;
	}

	/**
	 * @since Jun 29, 2019
	 * @return password
	 */
	public ITextboxActions password () {
		return this.password;
	}

	/**
	 * @since Jun 29, 2019
	 * @return receive offers
	 */
	public IMouseActions receiveOffers () {
		return this.receiveOffers;
	}

	/**
	 * @since Jun 29, 2019
	 * @return register button
	 */
	public IMouseActions registerButton () {
		return this.registerButton;
	}

	/**
	 * @since Jun 29, 2019
	 * @return signup checkbox
	 */
	public IMouseActions signUp () {
		return this.signUp;
	}

	/**
	 * @since Jun 29, 2019
	 * @return state
	 */
	public ISelectboxActions state () {
		return this.state;
	}

	/**
	 * @since Jun 29, 2019
	 * @return year
	 */
	public ISelectboxActions year () {
		return this.year;
	}

	/**
	 * @since Jun 29, 2019
	 * @return zip code
	 */
	public ITextboxActions zipCode () {
		return this.zipCode;
	}

}
