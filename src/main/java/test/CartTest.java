package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class CartTest extends BaseClass{
	
	HomePage homepage;
	ProductPage productpage;
	CartPage cartpage;
	
	public CartTest(){
		super();
	}
	@BeforeMethod
	public void setup() {
		intialization();
		homepage=new HomePage();
		productpage=new ProductPage ();
		cartpage=new CartPage();
	}
	@Test (priority=4)
	public void addtocart() {
		homepage.searchproduct();
		productpage.productselectionclick();
		cartpage.AddtoCart();
	}
	@AfterMethod

	public void teardown() {
		drivers.quit();
	}

}
