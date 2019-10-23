package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class RegisterPage extends Util {

    By Register_Link = By.linkText("Register");
    By RegisterWelcomeText = By.xpath("//h1[contains(text(),'Register')]");
    By Gender = By.xpath("//span[@class='male']");
    By Firstname = By.id("FirstName");
    By Lastname = By.id("LastName");

    By DOB_Day = By.xpath("//select[@name='DateOfBirthDay']");
    By DOB_Month = By.xpath("//select[@name='DateOfBirthMonth']");
    By DOB_Year = By.xpath("//select[@name='DateOfBirthYear']");

    By Email = By.xpath("//input[@id='Email']");
    By Company_Name = By.id("Company");

    By Password = By.id("Password");
    By Confirm_Password  = By.id("ConfirmPassword");
    By Register_btn = By.id("register-button");

    public void clickOnRegisterLink()
    {
        clickOnElement(Register_Link);
    }

    public String RegisterWelcomeText()
    {
        return getTextFromElement(RegisterWelcomeText);
    }

    public void selectGender()
    {
        clickOnElement(Gender);
    }

    public void enterFirstName(String str)
    {
        sendTextToElement(Firstname,str);
    }

    public void enterLastName(String str)
    {
        sendTextToElement(Lastname,str);
    }

    public void selectDay(String str)
    {
        selectByValueFromDropDown(DOB_Day,str);
    }

    public void selectMonth(String str)
    {
        selectByVisibleTextFromDropDown(DOB_Month,str);
    }

    public void selectYear(String str)
    {
        selectByValueFromDropDown(DOB_Year,str);
    }

    public void enterEmailAddress()
    {
        String Email_Add = "Dev" + generateRandomNumber() + "@gmail.com";
        sendTextToElement(Email,Email_Add);
    }

    public void enterCompanyName(String str)
    {
        sendTextToElement(Company_Name,str);
    }

    public void enterPassword(String str)
    {
        sendTextToElement(Password,str);
    }

    public void enterConfirmPassword(String str)
    {
        sendTextToElement(Confirm_Password,str);
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(Register_btn);
    }

}
