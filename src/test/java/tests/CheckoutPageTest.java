package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;

public class CheckoutPageTest extends BaseTest{
	
	String fname = "Hajji";
	String lname = "Hadouda";
	String pcode = "1200";
	
	@Test
	public void checkoutTest() {
		new CheckoutPage(driver).checkout(fname, lname, pcode);
	}

}
