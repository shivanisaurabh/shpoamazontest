package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CartPage extends BaseClass {

	@FindBy(id="add-to-cart-button")
	WebElement AddtoCart;
	
	
	
	
	public CartPage() {
		PageFactory.initElements(drivers, this);
	}
	
	 
	
	public CheckoutPage AddtoCart() {
		
		String mainwindow=drivers.getWindowHandle();
		//System.out.println(mainwindow);
		//drivers.switchTo().window(mainwindow);
		Set<String> childwindow=drivers.getWindowHandles();
		Iterator<String> itrate=childwindow.iterator();
		while(itrate.hasNext()) {
			
			String childwindow1=itrate.next();
			System.out.println(childwindow1);
			if(!mainwindow.equalsIgnoreCase(childwindow1)) {
				drivers.switchTo().window(childwindow1);
		     AddtoCart.click();
			}
		}
		
		return new CheckoutPage();
		
	}

}
