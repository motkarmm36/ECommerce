package testCases;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ForgotPasswordPage;
import pageObject.HomePage;
import pageObject.LoginPage;

public class TC08_ForgotPassword extends BaseClass {

	@Test(dependsOnMethods = "register")
	void forgotPasswordwithRegisterEmail() {
		try {
			HomePage hp = new HomePage(driver);
			hp.ClickLogin();
			LoginPage lp = new LoginPage(driver);
			lp.clickForgotPassword();
			ForgotPasswordPage fpp = new ForgotPasswordPage(driver);
			fpp.clickRecoverwithEmail(TC01_AccountRegister.email);
			Assert.assertTrue(fpp.emailWithInstructionsHasBe.isDisplayed());
			fpp.clickRecoverNonregiEmail("s1w21s21@gmail.com");
			Assert.assertTrue(fpp.emailNotFoundError.isDisplayed());

		} catch (Exception e) {
			Assert.fail();
			System.out.println(e.getMessage());
		}
	}

}
