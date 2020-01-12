package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(id="twotabsearchtextbox")
	WebElement toolbarseachprodcut;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']")
	WebElement seachprodcut;
	

public HomePage() {
	PageFactory.initElements(drivers, this);
}


public ProductPage searchproduct() {
	
	String Product=prop.getProperty("ProductName");
	
	toolbarseachprodcut.sendKeys(Product);
	seachprodcut.submit();
	return new ProductPage();
	
}
}