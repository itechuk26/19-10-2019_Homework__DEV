package uk.co.ebay.pages;

import org.openqa.selenium.By;
import uk.co.ebay.basepage.BasePage;
import uk.co.ebay.utility.Util;

/**
 * Created by : Divyesh Patel
 * since : Monday  21/10/2019
 * Time  : 23:16
 **/

public class HomePage extends Util {

    public String homePageTitle() {
        return driver.getTitle();
    }

}
