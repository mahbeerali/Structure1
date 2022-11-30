package org.example;
//importing org.openqa.selenium.chrome.ChromeDriver Package
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//importing java.time.duration
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class DriverManager extends Utils
{
   // String browserName = LoadProp.getProperty("browser");
    public static final String USERNAME = LoadProp.getProperty("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = LoadProp.getProperty("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    String browserName = LoadProp.getProperty("browser");
    //    String browserName = System.getProperty("browser");
    boolean runInCloud = Boolean.parseBoolean(LoadProp.getProperty("cloud"));
    MutableCapabilities capabilities = new MutableCapabilities();



    public void openBrowser()

    {
        //run in cloud ============================================
        if (runInCloud)
        {
            //connect to cloud
            if (browserName.equalsIgnoreCase("Edge")) {
                ///connect with browserstack
                capabilities.setCapability("browserName", "Edge");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);

            } else if (browserName.equalsIgnoreCase("Firefox"))
            {
                ///connect with browserstack
                capabilities.setCapability("browserName", "firefox");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);
            } else {
                System.out.println("Your browser name is wrong or missing implementation:" + browserName);
            }
            try {
                driver = new RemoteWebDriver(new URL(URL), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);

            }}
            else
            {
            // run in locally
            if (browserName.equalsIgnoreCase("Chrome")) {
                //set the driver path for Chrome browser
                System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
                //create driver object for Chrome browser
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {
                //set the driver path for Edge browser
                System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
                //create driver object for edge browser
                driver = new EdgeDriver();
            } else {
                System.out.println("Your browser name is wrong or missing:" + browserName);
            }
        }






        //to maximize window interface of the driver class
        driver.manage().window().maximize();
        //get the URL of the page
        //driver.get("https://demo.nopcommerce.com/");
        //wait for 20 seconds
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(LoadProp.getProperty("url"));


    }

    public void closeBrowser()
    {
        //closing all the URL pages
        driver.quit();
    }

}
