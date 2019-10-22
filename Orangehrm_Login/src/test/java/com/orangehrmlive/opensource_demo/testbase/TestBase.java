package com.orangehrmlive.opensource_demo.testbase;

import com.orangehrmlive.opensource_demo.basepage.BasePage;
import com.orangehrmlive.opensource_demo.browserslector.BrowserSelector;
import com.orangehrmlive.opensource_demo.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
