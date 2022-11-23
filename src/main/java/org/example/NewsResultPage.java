package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsResultPage extends Utils
{
    private  By _newsCommentResult=By.className("result");

    static String newsCommentMsg = "News comment is successfully added.";

    public void verifyCommentMessageIsDisplayed()
    {
        waitForUrlTobe("https://demo.nopcommerce.com/nopcommerce-new-release",20);
        String commentMsg=getTextFromElement(_newsCommentResult);
        Assert.assertEquals(commentMsg,newsCommentMsg);

    }







}

