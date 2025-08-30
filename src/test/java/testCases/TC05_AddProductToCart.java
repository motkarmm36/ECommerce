package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CartPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.ProductDetailsPage;

public class TC05_AddProductToCart extends BaseClass {

	@Test(dependsOnMethods = "register")
	void addProcuctToCart() {

		try {

			HomePage hp = new HomePage(driver);
			hp.ClickLogin();

			LoginPage lp = new LoginPage(driver);

			lp.loginS(TC01_AccountRegister.email, p.getProperty("Password"));

			Actions act = new Actions(driver);
			act.moveToElement(hp.computers).perform();
			hp.notebooks.click();
			hp.appleMacBookPro.click();

			ProductDetailsPage pdp = new ProductDetailsPage(driver);
			pdp.addToCart("4");

			Assert.assertTrue(pdp.isAddedMessageDisplayed());
			pdp.closeAddedMessage();
			hp.selectCartOption();
			CartPage cp = new CartPage(driver);
			Assert.assertTrue(cp.isProductDisplayed());

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
