package uk.co.ebay.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.ebay.basepage.BasePage;
import uk.co.ebay.loadproperty.LoadProperty;
import uk.co.ebay.pages.HomePage;
import uk.co.ebay.testbase.TestBase;

/**
 * Created by : Divyesh Patel
 * since : Monday  21/10/2019
 * Time  : 23:34
 **/

public class HomepageTest extends TestBase
{
    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToHomepageSuccessfully()
    {

        String page_title = homePage.homePageTitle();
        Assert.assertEquals(page_title,"Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
    }
}
