package com.wizonsoft.tests;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.wizonsoft.action.AddressTabActions;
import com.wizonsoft.action.OrderConfirmAction;
import com.wizonsoft.action.OrderPageAction;
import com.wizonsoft.action.OrderSummaryAction;
import com.wizonsoft.action.PaymentPageActions;
import com.wizonsoft.action.ShippingTabAction;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

/**
 * @author Faisal Khatri
 * @since 27-Sep-2019
 */
@Epic("Automation Framework Tests")
@Feature ("Place Order")
public class OrderTest extends BrowserTest {

	private final double	shippingCharge	= 2.00;
	private int				quantity;
	private double			price;
	final String			dollarSign		= "$";
	private double			totalPrice;
	private double			totalSaleValue;

	/**
	 * @return data
	 */
	@DataProvider
	public Iterator <Object []> getOrder () {
		final List <Object []> orderData = new ArrayList <> ();
		orderData.add (new Object [] { 2, "M" });
		return orderData.iterator ();

	}

	/**
	 * Order Tests
	 *
	 * @param quantity
	 * @param size
	 * @throws ParseException
	 */
	@Test (dataProvider = "getOrder")
	@Description("Test Order placement")
	public void testOrderPlacement (final int quantity, final String size) throws ParseException {
		final OrderPageAction orderAction = new OrderPageAction ();
		orderAction.addInputValue ("Quantity", String.valueOf (quantity))
		.addInputValue ("Size", size)
		.perform ();
		this.quantity = quantity;
		this.price = orderAction.productPrice ();
	}

	/**
	 * @param quantity
	 * @param size
	 * @throws ParseException
	 * Order Confirmation Test
	 */
	@Test (dependsOnMethods = "testOrderPlacement")
	@Description("Test Order Confirmation")
	public void testOrderConfirmation () throws ParseException {
		final OrderConfirmAction confirmOrder = new OrderConfirmAction ();
		this.totalPrice = this.price * this.quantity;
		this.totalSaleValue = this.totalPrice + this.shippingCharge;
		confirmOrder.addInputValue ("Quantity", String.valueOf (this.quantity))
		.addInputValue ("Total", this.dollarSign + this.totalPrice)
		.addInputValue ("TotalProducts", this.dollarSign + this.totalPrice)
		.addInputValue ("TotalSaleValue", this.dollarSign + this.totalSaleValue)
		.perform ();
	}

	/**
	 * Order Summary Test
	 */
	@Test (dependsOnMethods = "testOrderConfirmation")
	@Description("Test Order Summary")
	public void testOrderSummary () {
		final OrderSummaryAction orderSummary = new OrderSummaryAction ();
		final DecimalFormat df = new DecimalFormat ("0.00");
		orderSummary.addInputValue ("Unit Price", this.dollarSign + this.price)
		.addInputValue ("Quantity", String.valueOf (this.quantity))
		.addInputValue ("Total Price", this.dollarSign + this.totalPrice)
		.addInputValue ("Total Products", this.dollarSign + this.totalPrice)
		.addInputValue ("Total Shipping", this.dollarSign + df.format (this.shippingCharge))
		.addInputValue ("Grand Total", this.dollarSign + this.totalSaleValue)
		.perform ();
	}

	/**
	 * Complete Payment
	 */
	@Test (dependsOnMethods = "testOrderSummary")
	@Description("Test Complete Payment")
	public void completePayment () {
		final AddressTabActions addressTabActions = new AddressTabActions ();
		addressTabActions.perform ();

		final ShippingTabAction shippingTabActions = new ShippingTabAction ();
		shippingTabActions.perform ();

		final PaymentPageActions paymentActions = new PaymentPageActions ();
		final DecimalFormat df = new DecimalFormat ("0.00");

		paymentActions.addInputValue ("Unit Price", this.dollarSign + this.price)
		.addInputValue ("Quantity", String.valueOf (this.quantity))
		.addInputValue ("Total Price", this.dollarSign + this.totalPrice)
		.addInputValue ("Total Shipping", this.dollarSign + df.format (this.shippingCharge))
		.addInputValue ("Grand Total", this.dollarSign + this.totalSaleValue)
		.perform ();

	}

}
