package com.w3schools.testbase;

import com.w3schools.basepage.BasePage;
import com.w3schools.browserselector.BrowserSelector;
import com.w3schools.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 06:37
 **/

public class TestBase extends BasePage {
    String browser  = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
