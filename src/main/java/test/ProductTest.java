package test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.ProductPage;

public class ProductTest extends BaseClass {
	
	HomePage homepage;
	ProductPage productpage;
	
	public ProductTest(){
		super();
	}
	@BeforeMethod
	public void setup() {
		intialization();
		homepage=new HomePage();
		productpage=new ProductPage();
	}
	@Test(priority=2)
	public void productselection() {
		homepage.searchproduct();
		productpage.productselectionclick();
	
	}
	@AfterMethod

	public void teardown() {
		drivers.quit();
	}
}
