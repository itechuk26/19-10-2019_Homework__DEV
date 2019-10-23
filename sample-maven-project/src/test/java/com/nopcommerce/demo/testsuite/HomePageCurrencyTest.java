package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 22:57
 **/

public class HomePageCurrencyTest extends TestBase {

    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldAbleToSelectCurrencySuccessfully() {

        homePage.selectCurrencyFromMenu(loadProperty.getProperty("currency"));

        if (loadProperty.getProperty("currency") == "Euro")
            homePage.verifyEuroCurrencySelectedSuccessfully();
        if (loadProperty.getProperty("currency") == "US Dollar")
            homePage.verifyDollorCurrencySelectedSuccessfully();
    }
}
