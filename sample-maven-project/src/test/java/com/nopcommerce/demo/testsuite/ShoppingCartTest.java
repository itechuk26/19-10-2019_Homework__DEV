package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Thursday  24/10/2019
 * Time  : 00:00
 **/

public class ShoppingCartTest extends TestBase {

    ShoppingCartPage shoppingcartpage = new ShoppingCartPage();

    @Test
    public void userShouldNavigatetoShoppingCartSuccessfully()
    {
        shoppingcartpage.clickOnShoppingCart();
        shoppingcartpage.verifyText();
    }







}
