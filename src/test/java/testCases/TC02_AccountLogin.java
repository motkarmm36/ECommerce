package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;

public class TC02_AccountLogin extends BaseClass {

	@Test(dependsOnMethods = "register", groups = { "Functional", "Master" })
	void Login() {

		try {

			HomePage hp1 = new HomePage(driver);
			LoginPage lp1 = new LoginPage(driver);
			logger.info("LoginTest started");

			hp1.ClickLogin();
			lp1.setEmail(TC01_AccountRegister.email);
			lp1.setPassword(p.getProperty("Password"));
			lp1.clickLogin();
			Assert.assertEquals(hp1.logoutButtonDisplayed(), true);
			hp1.clickLogout();
			logger.info("LoginTest passed");
		} catch (Exception e) {
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
		}

	}

}
