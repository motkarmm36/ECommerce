package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//td[@class='product']") 
	WebElement appleMacBookPro;
	
	@FindBy(xpath="//input[@id='termsofservice']") 
	WebElement iAgreeWithTheTermsOfServ;
	
	@FindBy(xpath="//button[@id='checkout']") 
	WebElement checkout;
	
	@FindBy(xpath="//td[@class='remove-from-cart']") 
	WebElement cartIcon;
	
	@FindBy(xpath="//div[@class='no-data']") 
	WebElement yourShoppingCartIsEmpty;
	
	public void checkTerms() {
		iAgreeWithTheTermsOfServ.click();
	}
	
	public void clickCheckout() {
		checkout.click();
	}
	
	public boolean isProductDisplayed() {
		return appleMacBookPro.isDisplayed();
	}
	public void removeProduct() {
		cartIcon.click();

	}
	
	public boolean isEmptyCart() {
		return yourShoppingCartIsEmpty.isDisplayed();
	}
}
