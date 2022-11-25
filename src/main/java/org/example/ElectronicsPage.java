package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{
    private By _cameraPhoto= By.linkText("Camera & photo");
    public void navigateToCameraPhoto()
    {
        clickOnElement(_cameraPhoto);
    }
}
