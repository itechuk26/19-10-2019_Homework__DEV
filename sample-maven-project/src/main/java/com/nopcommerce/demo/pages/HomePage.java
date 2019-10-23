package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class HomePage extends Util {

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void selectCurrencyFromMenu(String str) {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='customerCurrency']"),str);
    }

    public void verifyDollorCurrencySelectedSuccessfully() {
        String expectedValue = "$1,200.00";
        String actualValue = getTextFromElement(By.xpath("//span[contains(text(),'$1,200.00')]"));

        verifyActualAndExpected(expectedValue, actualValue);
    }

    public void verifyEuroCurrencySelectedSuccessfully() {

        String expectedValue = "Ђ1548.00";
        String actualValue = getTextFromElement(By.xpath("//span[contains(text(),'1548.00')]"));

        verifyActualAndExpected(expectedValue, actualValue);
    }
}
