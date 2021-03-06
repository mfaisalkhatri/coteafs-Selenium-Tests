/**
 * Copyright (c) 2017 - 2020, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wizonsoft.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.config.ConfigUtil;
import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.wizonsoft.guru99.action.DeleteAccountPageAction;
import com.wizonsoft.guru99.action.DeleteCustomerPageAction;
import com.wizonsoft.guru99.action.EditCustomerPageAction;
import com.wizonsoft.guru99.action.LoginPageAction;
import com.wizonsoft.guru99.action.NewAccountPageAction;
import com.wizonsoft.guru99.action.NewCustomerPageAction;
import com.wizonsoft.guru99.pages.MainPage;

/**
 * @author Wasiq Bhamla
 * @since Aug 15, 2018 8:07:59 PM
 */
public class SeleniumTest extends BrowserTest {
	private String		accountId;
	private String		customerId;
	private MainPage	main;

	/**
	 * @author Wasiq Bhamla
	 * @since Aug 19, 2018 4:30:34 PM
	 */

	@BeforeClass
	public void setupMethod () {
		this.main = new MainPage ();
		this.main.onDriver ()
		.navigateTo (ConfigUtil.appSetting ()
			.getUrl ());

	}

	/**
	 * @author wasiqb
	 * @since Apr 8, 2019 10:34:29 PM
	 */
	@Test
	public void testDeleteAccount () {
		final DeleteAccountPageAction acc = new DeleteAccountPageAction ();
		acc.addInputValue ("AccountId", this.accountId)
		.perform ();

	}

	/**
	 * @author Wasiq Bhamla
	 * @since 29-Apr-2019
	 */
	@Test
	public void testDeleteCustomer () {
		final DeleteCustomerPageAction acc = new DeleteCustomerPageAction ();
		acc.addInputValue ("CustomerId", this.customerId)
		.perform ();
	}

	/**
	 * @author wasiqb
	 * @since Apr 8, 2019 12:00:15 PM
	 */
	@Test
	public void testEditCustomer () {
		final EditCustomerPageAction cust = new EditCustomerPageAction ();
		cust.addInputValue ("CustomerId", this.customerId)
		.perform ();

	}

	/**
	 * @author wasiqb
	 * @since Apr 8, 2019 10:06:01 PM
	 */
	@Test
	public void testNewAccount () {
		final NewAccountPageAction acc = new NewAccountPageAction ();
		acc.addInputValue ("CustomerId", this.customerId)
		.perform ();

		this.accountId = acc.accountId ();
	}

	/**
	 * @author wasiqb
	 * @since Apr 8, 2019 10:52:16 AM
	 */
	@Test
	public void testNewCustomer () {
		final NewCustomerPageAction cust = new NewCustomerPageAction ();
		cust.perform ();

		this.customerId = cust.customerId ();
	}

	/**
	 * @author wasiqb
	 * @since Aug 31, 2018 9:15:42 PM
	 */
	@Test
	public void testSignIn () {
		final LoginPageAction login = new LoginPageAction ();

		login.addInputValue ("UserId", ConfigUtil.appSetting ()
			.getParams ()
			.get ("user"))
		.addInputValue ("Password", ConfigUtil.appSetting ()
			.getParams ()
			.get ("password"))
		.perform ();
	}
}