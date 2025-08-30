package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement radio_M;

	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement radio_F;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement text_FirstName;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement text_LastName;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement text_Email;

	@FindBy(xpath = "//input[@id='Company']")
	WebElement text_Company;

	@FindBy(xpath = "//input[@id='Newsletter']")
	WebElement Newsletter;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement text_Password;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement text_ConfirmPassword;

	@FindBy(xpath = "//button[@id='register-button']")
	WebElement button_Register;

	@FindBy(xpath = "//div[text()='Your registration completed']")

	WebElement successMessage;

	public void setGenderM() {
		radio_M.click();
	}

	public void setGenderF() {
		radio_F.click();
	}

	public void setText_FirstName(String FirstName) {
		text_FirstName.sendKeys(FirstName);
		;
	}

	public void setText_LastName(String LastName) {
		text_LastName.sendKeys(LastName);
	}

	public void setText_Email(String Email) {
		text_Email.sendKeys(Email);
	}

	public void setText_Company(String Company) {
		text_Company.sendKeys(Company);
	}

	public void setText_Password(String password) {
		text_Password.sendKeys(password);
	}

	public void setText_ConfirmPassword(String password) {
		text_ConfirmPassword.sendKeys(password);
		;
	}

	public void clickRegister() {
		button_Register.click();

	}

	public String GetSuccessMessage() {

		try {
			String smsg = successMessage.getText();
			return smsg;
		} catch (Exception e) {

			return e.getMessage();
		}
	}

}
