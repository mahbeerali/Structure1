package org.example;
//importing org.openqa.selenium by
import org.openqa.selenium.By;
//importing org.testng.Assert
import org.testng.Assert;

public class RegisterPage extends Utils
{   // going to "gender"  with its locator by Xpath
    private final By genderFemale =By.xpath("//label[@for=\"gender-female\"]");
    // going to "First name field"  with its locator by id
    private final By firstNameField =By.id("FirstName");
    // going to "Last name field"  with its locator by id
    private final By lastNameField =By.id("LastName");
    // going to "date of BirthDay select"  with its locator by name
    private final By dateOfBirthDaySelect =By.name("DateOfBirthDay");
    // going to "date of BirthMonth select"  with its locator by name
    private final By dateOfBirthMonthSelect =By.name("DateOfBirthMonth");
    // going to "date of BirthYear select"  with its locator by name
    private final By dateOfBirthYearSelect =By.name("DateOfBirthYear");
    // going to "email Field"  with its locator by name
    private final By emailField=By.name("Email");
    // going to "newsLetter"  with its locator by xpath

    private final By companyField=By.name("Company");
   // going to  password Field  with its locator By id
   private final By newsLetter=By.xpath("//input[@type=\"checkbox\"]");
    // going to "company Field"  with its locator by name
    private final By passwordField=By.id("Password");
    // going to   confirm password Field  with its locator By id
    private final By ConfirmPasswordField=By.id("ConfirmPassword");
    // going to  register Submit Button  with its locator By id
    private final By registerSubmitButton=By.id("register-button");


    public void verifyUserIsOnRegisterPage()
    {
        //using assertion to confirm the register page is open and url is changed
        Assert.assertTrue(driver.getCurrentUrl().contains("Register"));
    }


    public void enterRegistrationDetails()
    {

        //using the method "click on element"
        clickOnElement(genderFemale);
        //using the method "type text"
        typeText(firstNameField,"Amna");
        //using the method "type text"
        typeText(lastNameField,"Ashraf");
        //using the method " select from drop down by Value"
        selectFromDropdownByValue(dateOfBirthDaySelect,"10");
        //using the method " select from drop down by Visible text"
        selectFromDropdownByVisibleText(dateOfBirthMonthSelect,"November");
        //using the method " select from drop down by value"
        selectFromDropdownByValue(dateOfBirthYearSelect,"1987");
        //using the method "type text"
        typeText(emailField,"Rajesh03" +timeStamp()+ "@gmail.com");
        //using the method "type text"
        typeText(companyField,"ABC limited");
        //using the method "click on element"
        clickOnElement(newsLetter);
        //using the method "type text"
        typeText(passwordField,"123456@");
        //using the method "type text"
        typeText(ConfirmPasswordField,"123456@");
        //using the method "click on element"
        clickOnElement(registerSubmitButton);
    }


}
