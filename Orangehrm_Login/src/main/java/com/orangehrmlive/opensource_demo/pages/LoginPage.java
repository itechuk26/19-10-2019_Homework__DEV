package com.orangehrmlive.opensource_demo.pages;

import com.orangehrmlive.opensource_demo.utility.Util;
import org.openqa.selenium.By;

public class LoginPage extends Util {

    By UserNameField = By.id("txtUsername");
    By PasswordFild = By.id("txtPassword");
    By Loginbtn = By.id("btnLogin");
    By WelcomeText = By.xpath("//a[@id='welcome']");


    public void enterUserName(String email){
        sendTextToElement(UserNameField, email);
    }

    public void enterPassword(String password)
    {
        sendTextToElement(PasswordFild, password);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(Loginbtn);
    }

    public String welcomeText()
    {
        return getTextFromElement(WelcomeText);
    }

}
