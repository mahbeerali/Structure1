package org.example;

import org.openqa.selenium.By;

public class NewReleaseComment extends Utils
{

    private By _titleField = By.id("AddNewComment_CommentTitle");
    private By _commentField= By.id("AddNewComment_CommentText");
    private By _newCommentButton =By.className("buttons");

    public void clickOnNewCommentButton()
    {
        typeText(_titleField, "New products");
        //finding a location of Comment Text field  by id and send value
        typeText(_commentField, "New products will be added");
        //click on new Comment button
        clickOnElement(_newCommentButton);
    }
}