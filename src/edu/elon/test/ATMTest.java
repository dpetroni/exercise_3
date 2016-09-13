package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeposit() {
		ATM atm = new ATM(80.50);
		atm.deposit(13.75);
		double actual = atm.getBalance();
		double expected = 94.25;
		assertEquals(expected, actual, .1);
	}

	@Test
	public void testGetBalance() {
		ATM atm = new ATM(42.55);
		double actual = atm.getBalance();
		double expected = 42.55;
		assertEquals(expected, actual, .1);
	}

	@Test
	public void testToString() {
		ATM atm = new ATM(14.50);
		String expected = "Amount balance is $14.50";
		assertEquals(expected,atm.toString());
	}

	@Test
	public void testWithdraw() {
		ATM atm = new ATM(10.10);
		atm.withdraw(.05);
		double actual = atm.getBalance();
		double expected = 10.05;
		assertEquals(expected, actual, .1);
	}

}
