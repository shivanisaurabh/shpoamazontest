package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ProductPage extends BaseClass{
	
	@FindBy(linkText="Apple iPhone 11 Pro Max (256GB) - Midnight Green")
	WebElement productselction;
	
	public ProductPage() {
		PageFactory.initElements(drivers, this);
	}
	
	public  CartPage productselectionclick() {
		productselction.click();
		return new CartPage();
	}
}
