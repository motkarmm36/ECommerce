package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageObject.HomePage;
import pageObject.LoginPage;

public class TC03_AccountLoginMultipleLoginData extends BaseClass {

	@Test(dependsOnMethods = "register", dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = {
			"Functional", "Master" })
	void Login(String email, String password, String isvalid) {

		try {
			logger.info("LoginTest Started");
			HomePage hp = new HomePage(driver);
			LoginPage lp = new LoginPage(driver);
			hp.ClickLogin();
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickLogin();

			if (isvalid.equalsIgnoreCase("valid")) {
				Assert.assertEquals(hp.logoutButtonDisplayed(), true);
				hp.clickLogout();
				logger.info("LoginTest passed with valid data");

			}
			if (isvalid.equalsIgnoreCase("invalid")) {
				Assert.assertTrue(lp.LoginErrDisplayed());
				logger.info("LoginTest passed with invalid data");

			}

		} catch (Exception e) {
			Assert.fail();
			logger.info(e.getMessage());
		}

	}
}
