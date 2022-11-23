package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils
{


        private By _emailMsg=By.className("result");

        static String expectedEmailMsg = "Your message has been sent.";

        public void verifyUserHasBeenSentEmailSuccessfully()
        {
            waitForUrlTobe("https://demo.nopcommerce.com/productemailafriend/4",20);
            String commentMsg=getTextFromElement(_emailMsg);
            Assert.assertEquals(commentMsg,expectedEmailMsg);

        }





    }
