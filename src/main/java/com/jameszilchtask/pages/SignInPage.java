package com.jameszilchtask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(css = "[data-testid='login-title-one']")
    private WebElement loginTitle;

    //not ideal to use xpath here, but very unlikely that this would change.
    @FindBy(xpath = "//*[text() = 'Forgot your password?']")
    private WebElement forgotPasswordLink;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void waitForSignInPageToLoad(){
        waitForPageToLoad(loginTitle, 5);
    }

    public void clickForgotPasswordLink(){forgotPasswordLink.click();}

}
