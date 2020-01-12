package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;


public class HomeTest extends BaseClass {

	
	HomePage homepage;
	public HomeTest() {
		super();
	}
	
	@BeforeMethod
public void setup() {
	intialization();
	homepage=new HomePage();
}
	
@Test(priority=1)
public void searchproduct() {
	homepage.searchproduct();
}
@AfterMethod

public void teardown() {
	drivers.quit();
}
}
