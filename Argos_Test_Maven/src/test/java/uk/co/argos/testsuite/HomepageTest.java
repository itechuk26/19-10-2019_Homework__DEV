package uk.co.argos.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.argos.pages.HomePage;
import uk.co.argos.testbase.TestBase;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 07:18
 **/

public class HomepageTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToHomepageSuccessfully() {
        String homepage_title = "Argos | Same Day Delivery or Faster In-Store Collection";

        Assert.assertEquals(homePage.getHomepageTitle(), homepage_title);
    }
}
