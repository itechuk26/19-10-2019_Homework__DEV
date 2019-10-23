package uk.co.argos.pages;

import uk.co.argos.utility.Util;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 07:14
 **/

public class HomePage extends Util {

    public String getHomepageTitle()
    {
        return driver.getTitle();
    }
}
