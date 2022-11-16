package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{
    private final By registeredMsg=By.className("result");

    static String expectedRegMsg = "Your registration completed";
    public void verifyUserHasBeenRegisteredSuccessfully()
    {
        waitForUrlTobe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",20);
    }
   public void verifyRegisteredMessageIsDisplayed()


   {
          String regMsg=getTextFromElement(registeredMsg);
          Assert.assertEquals(regMsg,expectedRegMsg);

   }

}
