package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegisterPage;

public class TC01_AccountRegister extends BaseClass {

	public static String email = Randomusername() + "@gma.coo";

	@Test(groups = { "Functional", "Master" })
	public void register() {

		HomePage home = new HomePage(driver);
		home.clickRegi();

		try {

			RegisterPage RegiP = new RegisterPage(driver);

			logger.info("Test cases started");

			RegiP.setText_FirstName("Mahesh");

			RegiP.setText_LastName("Patil");
			logger.info(" Entered First and Last Name");

			RegiP.setText_Email(email);

			RegiP.setText_Company("CorporateWorld");

			RegiP.setText_Password("Aaaaa@11");

			RegiP.setText_ConfirmPassword("Aaaaa@11");

			RegiP.clickRegister();
			logger.info("Assertion sucess message assertion starts");

			String actualM = RegiP.GetSuccessMessage();

			Assert.assertEquals(actualM, "Your registration completed");

			logger.info("assertion done...");

			home.clickLogout();
		} catch (Exception e) {
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
		}

	}

}
