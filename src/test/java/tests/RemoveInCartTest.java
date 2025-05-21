package tests;

import org.testng.annotations.Test;

import pages.RemoveItemInCart;

public class RemoveInCartTest extends BaseTest {
	@Test
	public void removeinCart() {
		RemoveItemInCart removeitem=new RemoveItemInCart(driver);
		removeitem.removeItem();
	}

}
