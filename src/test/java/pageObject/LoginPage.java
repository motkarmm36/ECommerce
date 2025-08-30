package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='Email']")
	public WebElement Textemail;

	@FindBy(xpath = "//input[@id='Password']")
	public WebElement Textpassword;

	@FindBy(xpath = "//button[normalize-space()='Log in']")
	public WebElement ButtonlogIn;

	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	WebElement loginerror;
	
	@FindBy(linkText="Forgot password?") 
	WebElement forgotPassword;
	
	public void setEmail(String Email) {
		Textemail.sendKeys(Email);
	}

	public void setPassword(String password) {
		Textpassword.sendKeys(password);
	}

	public void clickLogin() {
		ButtonlogIn.click();
	}

	public boolean LoginErrDisplayed() {
		return loginerror.isDisplayed();
	}

	public void loginS(String Email, String Password) {
		try {

			Textemail.sendKeys(Email);
			Textpassword.sendKeys(Password);
			ButtonlogIn.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void clickForgotPassword() {
		forgotPassword.click();
	}

}
