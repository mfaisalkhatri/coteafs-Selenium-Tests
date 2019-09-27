package com.wizonsoft.action;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.testng.Assert;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.wizonsoft.pages.MainPage;
import com.wizonsoft.pages.OrderPage;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
public class OrderPageAction extends AbstractPageAction <OrderPageAction> {

	private final OrderPage	orderPage;
	private final MainPage	mainPage;
	private int quantity;

	/**
	 * constructor
	 */
	public OrderPageAction () {
		this.orderPage = new OrderPage ();
		this.mainPage = new MainPage ();
	}

	@Override
	public void perform (){
		this.mainPage.openMenu ("WOMEN", "T-shirts")
		.click ();
		final String productPrice = this.mainPage.productPrice ()
			.text ();
		this.mainPage.productPic ()
		.click ();

		this.mainPage.onDriver ()
		.switchFrame (0);

		try {
			Thread.sleep (5000);
		}
		catch (final InterruptedException e) {
			e.printStackTrace();

		}

		//			this.mainPage.onDriver ()
		//			.driverWait ();
		//		this.orderPage.productPrice ()
		//			.waitUntilVisible ();
		this.orderPage.onDriver ().driverWait ();
		final String orderPrice = this.orderPage.productPrice ()
			.text ();
		Assert.assertEquals (orderPrice, productPrice);

		this.orderPage.quantity ()
		.clear ();
		this.orderPage.quantity ()
		.enterText (this.value ("Quantity"));
		this.orderPage.size ()
		.selectByText (this.value ("Size"));
		this.orderPage.blueColor ()
		.click ();
		this.orderPage.addToCart ()
		.click ();
	}

	/**
	 * @return product Price
	 * @throws ParseException
	 */
	public double productPrice () throws ParseException {
		final String orderPrice = this.orderPage.productPrice ().text ();
		final NumberFormat format = NumberFormat.getCurrencyInstance (Locale.US);
		final Number price = format.parse (orderPrice);
		return price.doubleValue ();
	}

	/**
	 * @return quantity
	 */
	public int quantity() {
		return this.quantity;
	}
}
