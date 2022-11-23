package org.example;
//importing org.testng.annotations.after method
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//importing org.testng.annotations.before method
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
      //creating a method through object name for driver manager
      DriverManager driverManager = new DriverManager();
      //importing annotations before method to open browser
    @BeforeMethod
    public void setUp()
    {
        driverManager.openBrowser();
    }
    //importing annotations after method to close browser
    @AfterMethod
    public void tearDown(ITestResult result)
    {
        if (!result.isSuccess())
        {
            captureScreenShot(result.getName());
        }
        driverManager.closeBrowser();
    }

}
