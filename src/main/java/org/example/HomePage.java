package org.example;
//importing org.openqa.selenium to use method by
import org.openqa.selenium.By;
//importing org.testng.Assert
import org.testng.Assert;

public class HomePage extends Utils

{
    //finding a location of register button on homepage
    private final By registerButton = By.className("ico-register");

  public void verifyRegisterButtonPresent()
 {
     //using assertion to verify the presence of register button by its class name
      Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","verifyRegisterButtonPresent");
  }
  public void waitForUrlTobe()
  {
      waitForUrlTobe("https://demo.nopcommerce.com/",20);
  }
  public void clickOnRegisterButton()
  {
      //calling a method click on register button to click and verify the register button on home page
      clickOnElement(registerButton);

  }


}
