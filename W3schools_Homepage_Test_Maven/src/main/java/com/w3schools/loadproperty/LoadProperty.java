package com.w3schools.loadproperty;

import com.w3schools.basepage.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  23/10/2019
 * Time  : 06:16
 **/

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;

    String projectpath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectpath + "\\src\\test\\java\\com\\w3schools\\resources\\properties\\config.properties");
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}


