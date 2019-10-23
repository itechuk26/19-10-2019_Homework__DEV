package uk.co.argos.browserselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.co.argos.basepage.BasePage;
import uk.co.argos.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 07:12
 **/

public class BrowserSelector extends BasePage {
    String baseUrl = new LoadProperty().getProperty("baseurl");

    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("ie")) {

            //System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
            driver = new EdgeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else {
            System.out.println("Wrong browser name");
        }
    }
}
