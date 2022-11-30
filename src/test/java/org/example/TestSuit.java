package org.example;

import org.testng.annotations.Test;

import static org.example.LoadProp.getProperty;

public class TestSuit extends BaseTest
{
  //creating object for home page
  HomePage homePage = new HomePage();
  //creating object for register page
  RegisterPage  registerPage= new RegisterPage();
  //creating object for register result page
  RegisterResultPage registerResultPage = new RegisterResultPage();
  ElectronicsPage electronicsPage= new ElectronicsPage();
  CameraAndPhotoPage cameraAndPhotoPage= new CameraAndPhotoPage();
  EmailAFriend emailAFriend= new EmailAFriend();
  NewReleaseComment newsComments = new NewReleaseComment();
  NewsResultPage newsResultPage = new NewsResultPage();
  EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
  FacebookPage facebookPage =new FacebookPage();
    NikePage nikePage = new NikePage();

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
    public void facebook()
    {
        //clicking on facebook logo
        homePage.clickOnFacebookLogo();
        //giving handle to new tab and bring the handle back
        facebookPage.newTab();
    }


    @Test
    public void verifyAllProductPricesAreDisplayed()
    {
      homePage.clickOnElectronics();
      electronicsPage.navigateToCameraPhoto();
      cameraAndPhotoPage.printProductNameWithList();
      cameraAndPhotoPage.addToCartButtonCheck();

    }
    @Test
    public void verifyCommentIsAddedAtTheBottom()
    {
      homePage.clickOnDetails();
      newsComments.clickOnNewCommentButton();
      newsResultPage.verifyCommentMessageIsDisplayed();
    }
    @Test
    public void verifyUserAbleToHoover()
    {
      homePage.hoverActionComputer();
    }

    @Test
    public void verifyUserSeeTheNikeProducts()
    {
     homePage.searchBar();
     nikePage.verifySearchFunctionality();

    }
//    @Test
//    public void readKeys() {
//        System.out.println(getProperty("url"));
//    }

}
