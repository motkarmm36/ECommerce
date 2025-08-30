package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.HomePage;
import pageObject.LoginPage;

public class TC07_ChangePassword extends BaseClass {

	@Test(dependsOnMethods = "register")
	void changePassword() {
		try {

			HomePage hp = new HomePage(driver);
			hp.ClickLogin();
			LoginPage lp = new LoginPage(driver);
			lp.loginS(TC01_AccountRegister.email, p.getProperty("Password"));
			hp.clickMyAccount();
			AccountPage ap = new AccountPage(driver);
			ap.changePassword(p.getProperty("Password"), p.getProperty("NewPassword"));
			String actualMessage = ap.Passwordmessage.getText();
			Assert.assertEquals(actualMessage, "Password was changed");
			ap.CloseMessage();
		} catch (Exception e) {
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
		}
	}

}
