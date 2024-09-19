package com.jameszilchtask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerHomePage extends BasePage {

    @FindBy(className = "customer-toggle")
    private WebElement customerToggle;

    @FindBy(partialLinkText = "Sign in")
    private WebElement signInButton;

    public CustomerHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
