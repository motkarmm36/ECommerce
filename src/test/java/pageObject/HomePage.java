package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "ico-register")
	WebElement register;

	@FindBy(className = "ico-login")
	public WebElement logIn;

	@FindBy(xpath = "//a[normalize-space()='Log out']")
	public WebElement logOut;

	@FindBy(xpath = "//div[@class='header-upper']")
	public WebElement Header;

	@FindBy(xpath = "//img[@alt='nopCommerce demo store']")
	WebElement nopCommerceDemoStoreLogo;

	@FindBy(xpath = "//div[@class='footer-upper']")
	WebElement informationSitemap;

	@FindBy(xpath = "//div[@class='footer-lower']")
	WebElement FooterBottom;

	@FindBy(xpath = "//select[@id='customerCurrency']")
	WebElement CurrencyDropdown;

	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchStore;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement search;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	public WebElement computers;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
	public WebElement notebooks;

	@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Apple MacBook Pro']")
	public WebElement appleMacBookPro;

	@FindBy(xpath = "//span[@class='cart-label']")
	public WebElement shoppingCart;

	@FindBy(xpath = "//a[@class='ico-account']")
	WebElement myAccount;

	public void clickRegi() {
		register.click();
	}

	public void ClickLogin() {
		logIn.click();

	}

	public boolean logoutButtonDisplayed() {
		return logOut.isDisplayed();
	}

	public void clickLogout() {
		logOut.click();
	}

	public boolean isHeaderDisplayed() {
		return Header.isDisplayed();
	}

	public boolean isinformationSitemapDisplayed() {
		return informationSitemap.isDisplayed();
	}

	public boolean isFooterBottomDisplayed() {
		return FooterBottom.isDisplayed();
	}

	public String currencySelectedOption() {
		return CurrencyDropdown.getText();
	}

	public Boolean isLogoDisplayed() {
		return nopCommerceDemoStoreLogo.isDisplayed();
	}

	public void selectCartOption() {
		shoppingCart.click();
	}

	public void clickMyAccount() {

		myAccount.click();

	}

}
