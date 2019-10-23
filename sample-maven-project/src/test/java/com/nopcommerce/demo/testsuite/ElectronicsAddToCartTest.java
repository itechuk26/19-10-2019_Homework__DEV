package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Thursday  24/10/2019
 * Time  : 00:10
 **/

public class ElectronicsAddToCartTest extends TestBase {

    ElectronicsPage electronics = new ElectronicsPage();

    @Test

    public void userShouldAbleToAddItemInTheCart() {

        electronics.openElectronicsPage();
        electronics.openCellphoneOption();
        electronics.clickOnHTCMobile();
        electronics.addToCart();
        electronics.verifyNotificationBarText();
    }
}
