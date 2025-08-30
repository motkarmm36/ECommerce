package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CartPage;
import pageObject.HomePage;
import pageObject.LoginPage;

public class TC06_RemoveFromCart extends BaseClass {
	
	@Test(dependsOnMethods = "addProcuctToCart")
	void RemoveProduct() {
		HomePage hp = new HomePage(driver);
		hp.ClickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.loginS(TC01_AccountRegister.email, p.getProperty("Password"));
		
		hp.selectCartOption();
		CartPage cp = new CartPage(driver);
		cp.removeProduct();
		Assert.assertTrue(cp.isEmptyCart());
		
	}
	


}
