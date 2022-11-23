package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriend extends Utils

{
//    RegisterResultPage registerResultPage= new RegisterResultPage();
    private By _emailAFriend = By.className("email-a-friend");
    private By _friendsEmailField= By.id("FriendEmail");
    private By _personalMessage= By.id("PersonalMessage");
    private By _button =By.className("buttons");
    static String expectedRegMsg = "Only registered customers can use email a friend feature";

    public void clickOnEmailAFriendButton()
{
    clickOnElement(_emailAFriend);
    typeText(_friendsEmailField,"ami_ash@hotmail.co.uk");
    typeText(_personalMessage,"Pls ensure that this is right Product");
    clickOnElement(_button);
}



//    public void verifyPersonalMessageIsDisplayed()
//
//
//   {
//    String regMsg=getTextFromElement(personalMsg);
//    Assert.assertEquals(regMsg,expectedRegMsg);
//
//}
//    public void verifyUserIsRegisterToSendEmail()
//    {
//        //using assertion to confirm the register page is open and url is changed
//       // Assert.assertTrue(driver.getCurrentUrl().contains(""));
//        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
//    }

}
