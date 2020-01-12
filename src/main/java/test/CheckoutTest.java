package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;

public class CheckoutTest extends BaseClass {
	
	HomePage homepage;
	ProductPage productpage;
	CartPage cartpage;
	CheckoutPage checkoutpage;
	
	public CheckoutTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		intialization();
		homepage=new HomePage();
		productpage=new ProductPage();
		cartpage=new CartPage();
		checkoutpage=new CheckoutPage();
	}
	@Test(priority=4)
	public void ProceedToCart (){
		homepage.searchproduct();
		productpage.productselectionclick();
		cartpage.AddtoCart();
		checkoutpage.proceedtocart();
	}
	@AfterMethod

	public void teardown() {
		drivers.quit();
	}

}
