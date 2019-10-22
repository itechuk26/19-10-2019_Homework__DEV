package uk.co.ebay.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.ebay.basepage.BasePage;
import uk.co.ebay.browserselector.BrowserSelector;
import uk.co.ebay.loadproperty.LoadProperty;

/**
 * Created by : Divyesh Patel
 * since : Monday  21/10/2019
 * Time  : 23:26
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
