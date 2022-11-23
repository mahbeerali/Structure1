package org.example;
//importing org.openqa.selenium by
import org.openqa.selenium.By;
//importing org.testng.Assert
import org.testng.Assert;

public class RegisterPage extends Utils
{   // going to "gender"  with its locator by Xpath
    private  By _genderFemale =By.xpath("//label[@for=\"gender-female\"]");
    // going to "First name field"  with its locator by id
    private  By _firstNameField =By.id("FirstName");
    // going to "Last name field"  with its locator by id
    private  By _lastNameField =By.id("LastName");
    // going to "date of BirthDay select"  with its locator by name
    private  By _dateOfBirthDaySelect =By.name("DateOfBirthDay");
    // going to "date of BirthMonth select"  with its locator by name
    private  By _dateOfBirthMonthSelect =By.name("DateOfBirthMonth");
    // going to "date of BirthYear select"  with its locator by name
    private  By _dateOfBirthYearSelect =By.name("DateOfBirthYear");
    // going to "email Field"  with its locator by name
    private  By _emailField=By.name("Email");
    // going to "newsLetter"  with its locator by xpath

    private  By _companyField=By.name("Company");
   // going to  password Field  with its locator By id
   private  By _newsLetter=By.xpath("//input[@type=\"checkbox\"]");
    // going to "company Field"  with its locator by name
    private  By _passwordField=By.id("Password");
    // going to   confirm password Field  with its locator By id
    private By _ConfirmPasswordField=By.id("ConfirmPassword");
    // going to  register Submit Button  with its locator By id
    private By _registerSubmitButton=By.id("register-button");
    private By _continueButton =By.xpath("//a[@class=\"button-1 register-continue-button\"]");
   // private By _continueButton =By.xpath("//a[@class=\"button-1 register-continue-button\"]");

    public void verifyUserIsOnRegisterPage()
    {
        //using assertion to confirm the register page is open and url is changed
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }


    public void enterRegistrationDetails()
    {

        //using the method "click on element"
        clickOnElement(_genderFemale);
        //using the method "type text"
        typeText(_firstNameField,"Amna");
        //using the method "type text"
        typeText(_lastNameField,"Ashraf");
        //using the method " select from drop down by Value"
        selectFromDropdownByValue(_dateOfBirthDaySelect,"10");
        //using the method " select from drop down by Visible text"
        selectFromDropdownByVisibleText(_dateOfBirthMonthSelect,"November");
        //using the method " select from drop down by value"
        selectFromDropdownByValue(_dateOfBirthYearSelect,"1987");
        //using the method "type text"
        typeText(_emailField,"Rajesh03" +timeStamp()+ "@gmail.com");
        //using the method "type text"
        typeText(_companyField,"ABC limited");
        //using the method "click on element"
        clickOnElement(_newsLetter);
        //using the method "type text"
        typeText(_passwordField,"123456@");
        //using the method "type text"
        typeText(_ConfirmPasswordField,"123456@");
        //using the method "click on element"
        clickOnElement(_registerSubmitButton);}
        public void verifyUserToClickOnContinueButton()
        {
        clickOnElement(_continueButton);
        }
        //clickOnElement(By.xpath("//a[@class=\"button-1 register-continue-button\"]"));

    }



