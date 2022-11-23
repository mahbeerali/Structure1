package org.example;
//importing org.openqa.selenium.by
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//importing org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
//importing org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.Select;
//importing org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.WebDriverWait;
//importing java.text.SimpleDateFormat
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
//importing java.time.Duration
import java.time.Duration;

public class Utils extends BasePage
{
    // creating an object for click action to click on the element
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    // creating an object for sendKeys
    public  static void typeText(By by,String text)
    {
       driver.findElement(by).sendKeys(text);
    }
    // creating an object for get text from an element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //importing DateFormat by creating object timeStamp
    public static String timeStamp()
    {

        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

    }
    // creating an object for wait action to click on the element
    public static void waitForElementToBeClickable(By by,int timeInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    // creating an object for wait action
    public static void waitForElementToBeVisible(By by,int timeInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
         wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    // creating an object for wait action
    public static void waitForUrlTobe(String url,int timeInSeconds )
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.urlToBe(url));

    }
    // creating an object for select from drop down by visible text
    public static void selectFromDropdownByVisibleText(By by,String text)
    {
        Select selectText=new Select(driver.findElement(by));
        selectText.selectByVisibleText(text);
    }
    // creating an object for select from drop down by value
    public static void selectFromDropdownByValue(By by,String value)
    {
        Select selectValue=new Select(driver.findElement(by));
        selectValue.selectByValue(value);
    }
    // creating an object for select from drop down by index
    public static void selectFromDropdownByIndex(By by,int i)
    {
        Select selectValue=new Select(driver.findElement(by));
        selectValue.selectByIndex(i);
    }
    public static void captureScreenShot(String screenShot)
    {
        TakesScreenshot scrShot =((TakesScreenshot) driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile=new File("src/ScreenShots"+screenShot+timeStamp()+".jpg");
//Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
