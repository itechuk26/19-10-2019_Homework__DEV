package com.w3schools.pages;

import com.w3schools.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 06:29
 **/

public class Homepage extends Util {

    By welcomtext = By.xpath("//div[@class='w3-right'][contains(text(),\"THE WORLD'S LARGEST WEB DEVELOPER SITE\")]");

    public String welcomeText()
    {
        return getTextFromElement(welcomtext);
    }


}
