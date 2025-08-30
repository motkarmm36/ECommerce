package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

public class TC04_HomePageUI extends BaseClass {
	HomePage hp;

	@Test(groups = { "Master", "UI" })
	void HeaderShown() {
		try {

			hp = new HomePage(driver);
			logger.info("Header Shown started");
			Assert.assertTrue(hp.isHeaderDisplayed());
			logger.info("Header passed");
		} catch (Exception e) {
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
			;
		}
	}

	@Test(groups = { "Master", "UI" })
	void informationSitemapShown() {
		try {

			logger.info("SitemapShown started");

			Assert.assertEquals(true, hp.isinformationSitemapDisplayed());

			logger.info("SitemapShown finished");
		} catch (Exception e) {
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
			logger.error("Exception occured");
			logger.debug("Debug logs..");
			Assert.fail();
		}

	}

	@Test(groups = { "Master", "UI" })
	void isLogoDisplayed() {
		try {

			logger.info("LogoDisplayed started");

			Assert.assertEquals(hp.isLogoDisplayed(), true);
			logger.info("LogoDisplayed finished");
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
