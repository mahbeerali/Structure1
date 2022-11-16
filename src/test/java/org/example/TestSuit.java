package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
  //creating object for home page
  HomePage homePage = new HomePage();
  //creating object for register page
  RegisterPage  registerPage= new RegisterPage();
  //creating object for register result page
  RegisterResultPage registerResultPage = new RegisterResultPage();
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

}
