package uk.co.ebay.browserselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import uk.co.ebay.basepage.BasePage;
import uk.co.ebay.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/**
 * Created by : Divyesh Patel
 * since : Monday  21/10/2019
 * Time  : 21:20
 **/

public class BrowserSelector extends BasePage {

    String baseurl = new LoadProperty().getProperty("baseurl");
    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseurl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseurl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } else if (browser.equalsIgnoreCase("ie")) {
            // System.setProperty("webdriver.ie.driver");
            driver = new InternetExplorerDriver();
            driver.get(baseurl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else {
            System.out.println("Wrong browser name");
        }
    }

}





