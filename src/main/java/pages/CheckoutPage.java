package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CheckoutPage extends BaseClass {
	
	@FindBy(id="hlb-ptc-btn")
	WebElement ProceedtoCart;
	
	public CheckoutPage() {
		PageFactory.initElements(drivers, this);
	}
	
	public void  proceedtocart() {
		ProceedtoCart.click();
		
	}

}
