package com.jameszilchtask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(css = "[data-testid='login-title-one']")
    private WebElement loginTitle;

    @FindBy(id = "email-field")
    private WebElement emailField;

    @FindBy(id = "email-field-validation-msg")
    private WebElement emailFieldValidationMsg;

    @FindBy(id = "password-field")
    private WebElement passwordField;

    @FindBy(id = "log-in-button")
    private WebElement loginButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void waitForSignInPageToLoad(){
        waitForPageToLoad(loginTitle, 5);
    }

    public void enterEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){loginButton.click();}

    public void waitForEmailFieldErrorMessage(){waitForElement(emailFieldValidationMsg, 5);}

    public String getEmailValidationErrorMessage(){return emailFieldValidationMsg.getText();}
}
