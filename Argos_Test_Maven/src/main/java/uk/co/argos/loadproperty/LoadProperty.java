package uk.co.argos.loadproperty;

import uk.co.argos.basepage.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 07:10
 **/

public class LoadProperty  {

    static Properties prop;

    static FileInputStream input;

    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\uk\\co\\argos\\resources\\properties\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
