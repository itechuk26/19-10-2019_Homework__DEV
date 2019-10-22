package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.browserslector.BrowserSelector;
import com.orangehrmlive.opensource_demo.loadproperty.LoadProperty;
import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldLoginSuccessfully() {
        loginPage.enterUserName(loadProperty.getProperty("username"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();

        String welcomeText = "Welcome Admin";
        Assert.assertEquals(loginPage.welcomeText(), welcomeText);
    }
}
