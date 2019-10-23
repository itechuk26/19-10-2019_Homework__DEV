package com.w3schools.testsuite;

import com.w3schools.loadproperty.LoadProperty;
import com.w3schools.pages.Homepage;
import com.w3schools.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 06:39
 **/

public class HomepageTest extends TestBase {

    Homepage homepage = new Homepage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToHomepageSuccessfully()
    {
        String WelcomeText = "THE WORLD'S LARGEST WEB DEVELOPER SITE";

        Assert.assertEquals(homepage.welcomeText(),WelcomeText);
    }

}
