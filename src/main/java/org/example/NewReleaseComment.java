package org.example;

import org.openqa.selenium.By;

public class NewReleaseComment extends Utils {

    private By _titleField = By.id("AddNewComment_CommentTitle");
    private By _commentField= By.id("AddNewComment_CommentText");
    private By _newCommentButton =By.className("buttons");

    public void clickOnNewCommentButton()
    {
        typeText(_titleField,"New products");
   // driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("New products");
    //finding a location of Comment Text field  by id and send value
        typeText(_commentField,"New products will be added");
        //driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("New products will be added");
    //click on NEW COMMENT button
        //driver.findElement(By.className("buttons")).click();
        clickOnElement(_newCommentButton);
    //returns text of the element
    //String newsMsg= driver.findElement(By.className("result")).getText();
    //Print news message
    //   System.out.println(newsMsg);
    //closing the opened URL page
    //   driver.quit();


     }
}
