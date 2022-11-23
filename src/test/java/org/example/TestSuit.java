package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
  //creating object for home page
  HomePage homePage = new HomePage();
  //creating object for register page
  RegisterPage  registerPage= new RegisterPage();
  //creating object for register result page
  RegisterResultPage registerResultPage = new RegisterResultPage();
    // ElectronicsPage electronicsPage= new ElectronicsPage();
//     CameraPhotoPage cameraPhotoPage= new CameraPhotoPage();
    EmailAFriend emailAFriend= new EmailAFriend();
    NewReleaseComment newsComments = new NewReleaseComment();
    NewsResultPage newsResultPage = new NewsResultPage();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();

  @Test
    public void verifyUserShouldAbleToRegisterSuccessfully()
    {   //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user has been registered successfully
        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
        //verify user registered message is displayed
        registerResultPage.verifyRegisteredMessageIsDisplayed();

    }
  //    @Test
//      public void verifyEachProductHasName()
//    {
//
////        electronicsPage.clickONCameraPhotoPage();
////        cameraPhotoPage.printProductTitle();
//    }

//    @Test
//    public void toGetAllTheNamesOfProductsFromCameraPhotoPage()
//  {    CameraPhotoPage.clickONCameraPhotoPage();
//
//  }
     @Test
     public void verifyCorrectCurrencyDisplayed()
     {
      homePage.verifyUSDSymbol();
      homePage.verifyEuroSymbol();
     }


    @Test
    public void verifyUserShouldAbleToEmailAFriendSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
        registerPage.verifyUserToClickOnContinueButton();
        homePage.clickOnAppleMacProPicture();
        emailAFriend.clickOnEmailAFriendButton();
        emailAFriendResultPage.verifyUserHasBeenSentEmailSuccessfully();
    }
    @Test
    public void verifyAlertPopUpOnVoteButton()
    {
        homePage.verifyVoteButton();
    }
    @Test
    public void verifyFaceUrlOpenInNextTab()
    {
        homePage.clickOnFacebookLogo();
    }

    @Test
    public void productHasName()
    {
      homePage.clickOnElectronics();
      //electronicsPage.clickOnCameraAndPhoto();

    }
    @Test
    public void verifyCommentIsAddedAtTheBottom()
    {
      homePage.clickOnDetails();
      newsComments.clickOnNewCommentButton();
      newsResultPage.verifyCommentMessageIsDisplayed();
    }

}
