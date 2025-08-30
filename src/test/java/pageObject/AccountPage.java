package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Change password']")
	WebElement changePassword;

	@FindBy(xpath = "//input[@id='OldPassword']")
	WebElement oldPassword;

	@FindBy(xpath = "//input[@id='NewPassword']")
	WebElement newPassword;

	@FindBy(xpath = "//input[@id='ConfirmNewPassword']")
	WebElement confirmPassword;

	@FindBy(xpath = "//button[normalize-space()='Change password']")
	WebElement button_changePassword;

	@FindBy(xpath = "//p[@class='content']")
	public WebElement Passwordmessage;

	@FindBy(xpath = "//span[@title='Close']")
	private WebElement closeIcon;

	public void changePassword(String OldPassword, String NewPassword) {
		try {
			changePassword.click();
			oldPassword.sendKeys(OldPassword);
			newPassword.sendKeys(NewPassword);
			confirmPassword.sendKeys(NewPassword);
			button_changePassword.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void CloseMessage() {
		closeIcon.click();

	}

}
