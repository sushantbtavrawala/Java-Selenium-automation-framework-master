package utils;

import com.google.gson.stream.JsonReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class browserFactory  {



    protected static WebDriver apply() throws IOException, ParseException {


        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");

        //Read user input from property file
        prop.load(fis);

        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge"))    {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("Chrome"))  {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        return null;
    }

    public browserFactory() throws IOException, ParseException {
    }
}
