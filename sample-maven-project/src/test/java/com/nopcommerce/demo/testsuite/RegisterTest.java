package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 11:50
 **/

public class RegisterTest extends TestBase
{
    RegisterPage registerPage = new RegisterPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToRegistrationPageSuccessfully()
    {
        String Regiser_Welcome_Text = "Register";

        registerPage.clickOnRegisterLink();
        Assert.assertEquals(Regiser_Welcome_Text,registerPage.RegisterWelcomeText());
    }

    @Test
    public void userShouldRegisterSuccessfully()
    {
        registerPage.clickOnRegisterLink();
        registerPage.selectGender();

        registerPage.enterFirstName(loadProperty.getProperty("first_name"));
        registerPage.enterLastName(loadProperty.getProperty("Last_name"));

        registerPage.selectDay(loadProperty.getProperty("dob_day"));
        registerPage.selectMonth(loadProperty.getProperty("dob_month"));
        registerPage.selectYear(loadProperty.getProperty("dob_year"));

        registerPage.enterEmailAddress();
        registerPage.enterCompanyName(loadProperty.getProperty("company_name"));
        registerPage.enterPassword(loadProperty.getProperty("password"));
        registerPage.enterConfirmPassword(loadProperty.getProperty("confirm_password"));

        registerPage.clickOnRegisterButton();

        String Registration_completed_text = "Your registration completed";
        String Actual_text = driver.findElement(By.xpath("//div[@class='result']")).getText();

        Assert.assertEquals(Registration_completed_text,Actual_text);
    }
}
