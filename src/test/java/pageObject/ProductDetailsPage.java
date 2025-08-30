package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//input[@id='product_enteredQuantity_4']") 
	WebElement enterAQuantity;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-4']") 
	WebElement addToCart;
	
	@FindBy(xpath="//p[@class='content']")
	WebElement theProductHasBeenAddedTo;
	
	@FindBy(xpath="//span[@title='Close']") 
	WebElement close;
	
	public void addToCart(String quantity) {
		enterAQuantity.clear();
		enterAQuantity.sendKeys(quantity);
		addToCart.click();
	}
	
	public boolean isAddedMessageDisplayed() {
		return theProductHasBeenAddedTo.isDisplayed();
	}
	public void closeAddedMessage() {
		close.click();
	}

}
