package uk.co.argos.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.argos.basepage.BasePage;
import uk.co.argos.browserselector.BrowserSelector;
import uk.co.argos.loadproperty.LoadProperty;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 07:17
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
