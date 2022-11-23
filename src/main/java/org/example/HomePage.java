package org.example;
//importing org.openqa.selenium to use method by
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//importing org.testng.Assert
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePage extends Utils

{
    //finding a location of register button on homepage
    private  By _registerButton = By.linkText("Register");
    private By _facebook = By.xpath("//li[@class=\"facebook\"]/a");

    private  By  _electronics  = By.linkText("Electronics");
    private  By _appleMacBookProPicture = By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]");

    private By _customerCurrency = By.name("customerCurrency");
    private  By _voteButton=(By.id("vote-poll-1"));
    private By _detailsButton =By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a");

//  public void waitForUrlTobe()
//
//  {
//      waitForUrlTobe("https://demo.nopcommerce.com/",20);
//  }
  public void clickOnRegisterButton()
  {
      //calling a method click on register button to click and verify the register button on home page
      clickOnElement(_registerButton);
      //using assertion to verify the presence of register button by its class name
      Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","verifyRegisterButtonPresent");

  }
  public void verifyUSDSymbol()
  {
      selectFromDropdownByVisibleText(_customerCurrency, "US Dollar");
      List<WebElement> currency = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
      for (WebElement element : currency)
      {
          Assert.assertTrue(element.getText().contains("$"),element.getText());
          System.out.println(element.getText());
      }

  }
    public void verifyEuroSymbol()
    {
        selectFromDropdownByVisibleText(_customerCurrency, "Euro");
        List<WebElement> currency = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement element : currency)
        {
            Assert.assertTrue(element.getText().contains("€"),element.getText());
            System.out.println(element.getText());
        }

    }


     public void clickOnElectronics()
        {
         clickOnElement(_electronics);
        }
       public void verifyVoteButton()
        {
         clickOnElement(_voteButton);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         try
         {
             wait.until(ExpectedConditions.alertIsPresent());
             Alert alert= driver.switchTo().alert();
             alert.accept();
         }
         catch (Exception e)
         {
             System.out.println("No alert");
         //driver.switchTo().alert().accept();
         }
        }
         public void clickOnAppleMacProPicture()
         {
            clickOnElement(_appleMacBookProPicture);
         }
         public void clickOnFacebookLogo()
        {
        clickOnElement(_facebook);
        }
    //finding a location of news button by xpath click on the news button
       // driver.findElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a")).click();
        public void clickOnDetails()
        {

            clickOnElement(_detailsButton);
        }
}
