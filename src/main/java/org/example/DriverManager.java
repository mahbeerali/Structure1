package org.example;
//importing org.openqa.selenium.chrome.ChromeDriver Package
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//importing java.time.duration
import java.time.Duration;
import java.util.List;

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
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.linkText("Electrics")).click();
//        driver.findElement(By.linkText("Camera & Photo")).click();
//        List<WebElement> productTitle=driver.findElements(By.xpath("//h2[@class='product-title']"));
//        System.out.println(productTitle.size());
//        for (WebElement element:productTitle)
//        {
//            System.out.println(element.getText());
//           // System.out.println(productTitle.getText());
//        }

    }

    public void closeBrowser()
    {
        //closing all the URL pages
        driver.quit();
    }

}
