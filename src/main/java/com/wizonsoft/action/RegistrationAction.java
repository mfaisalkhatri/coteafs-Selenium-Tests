package com.wizonsoft.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;
import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.RegistrationPage;

/**
 * @since Jun 29, 2019
 *
 */
public class RegistrationAction extends AbstractPageAction <RegistrationAction> {

	final RegistrationPage register;

	/**
	 * @author Faisal Khatri
	 */
	public RegistrationAction () {
		this.register = new RegistrationPage ();
	}

	@Override
	public void perform () {
		registerUser ();
	}

	private void registerUser () {
		final Faker faker = Faker.instance (Locale.US);
		this.register.mrRadioBtn ()
			.click ();
		this.register.firstName ()
			.enterText (faker.name ()
				.firstName ());
		this.register.lastName ()
			.enterText (faker.name ()
				.lastName ());
		this.register.password ()
			.enterText ("Pass@123");
		final Date date = faker.date ()
			.birthday (10, 50);
		final DateFormat dayOfDate = new SimpleDateFormat ("dd");
		final DateFormat monthOfDate = new SimpleDateFormat ("MM");
		final DateFormat yearOfDate = new SimpleDateFormat ("YYYY");
		this.register.day ()
			.select (dayOfDate.format (date));
		this.register.month ()
			.select (monthOfDate.format (date));
		this.register.year ()
			.select (yearOfDate.format (date));
		this.register.signUp ()
			.click ();
		this.register.receiveOffers ()
			.click ();
		this.register.company ()
			.enterText (faker.company ()
				.name ());
		this.register.addressLine1 ()
			.enterText (faker.address ()
				.streetAddress ());
		this.register.addressLine2 ()
			.enterText (faker.address ()
				.secondaryAddress ());
		this.register.city ()
			.enterText (faker.address ()
				.city ());
		this.register.state ()
			.select (faker.address ()
				.state ());
		this.register.zipCode ()
			.enterText (faker.number ()
				.digits (5));
		this.register.mobilePhone ()
			.enterText (faker.number ()
				.digits (10));
		this.register.registerButton ()
			.click ();
	}

}
