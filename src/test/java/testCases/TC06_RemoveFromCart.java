package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CartPage;
import pageObject.HomePage;
import pageObject.LoginPage;

public class TC06_RemoveFromCart extends BaseClass {
	
	@Test(dependsOnMethods = "addProcuctToCart")
	void RemoveProduct() {
		try {
			
		HomePage hp = new HomePage(driver);
		hp.ClickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.loginS(TC01_AccountRegister.email, p.getProperty("Password"));
		
		hp.selectCartOption();
		CartPage cp1 = new CartPage(driver);
		
		cp1.removeProduct();
		Assert.assertTrue(cp1.isEmptyCart());
		}
		catch(Exception e) {
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
	}
	


}
