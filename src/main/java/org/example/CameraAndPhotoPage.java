package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraAndPhotoPage extends Utils
{
    public void printProductNameWithList()
    {
        // private By _printProductNameWithList = By.xpath("//h2[@class=\"product-title\"");
       List<WebElement> productTitle = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
       System.out.println(productTitle.size());
       for (WebElement element :productTitle)
    {
        System.out.println(element.getText());
    }



}}
