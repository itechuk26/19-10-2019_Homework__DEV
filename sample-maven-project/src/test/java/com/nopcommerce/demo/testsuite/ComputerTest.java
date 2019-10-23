package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 19:41
 **/

public class ComputerTest extends TestBase {

    ComputerPage computerpage = new ComputerPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        computerpage.clickOnComputerPage();

        String welcometext = "Computers";
        String Actualtext = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]")).getText();

        Assert.assertEquals(Actualtext,welcometext);
    }
}
