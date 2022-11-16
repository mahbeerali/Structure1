package org.example;
//importing org.openqa.selenium.chrome.ChromeDriver Package
import org.openqa.selenium.chrome.ChromeDriver;
//importing java.time.duration
import java.time.Duration;

public class DriverManager extends Utils
{


    public void openBrowser()

    {

        //set the driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        //create driver object for Chrome browser
        driver = new ChromeDriver();
        //to maximize window interface of the driver class
        driver.manage().window().maximize();
        //get the URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //wait for 20 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser()
    {
        //closing all the URL pages
        driver.quit();
    }

}
