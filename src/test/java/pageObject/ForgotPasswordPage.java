package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='Email']")
	WebElement yourEmailAddress;

	@FindBy(xpath = "//button[normalize-space()='Recover']")
	WebElement recover;

	@FindBy(xpath = "//div[@class='bar-notification error']")
	public WebElement emailNotFoundError;

	@FindBy(xpath = "//div[@class='bar-notification success']")
	public WebElement emailWithInstructionsHasBe;

	public void clickRecoverwithEmail(String email) {
		yourEmailAddress.sendKeys(email);
		recover.click();

	}

	public void clickRecoverNonregiEmail(String email) {
		yourEmailAddress.clear();
		yourEmailAddress.sendKeys(email);
		recover.click();
	}

}
