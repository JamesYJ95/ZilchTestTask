package com.jameszilchtask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordResetPage extends BasePage{

    @FindBy(id = "forgot-password-button")
    private WebElement forgotPasswordButton;

    @FindBy(id = "email-field")
    private WebElement emailField;

    @FindBy(id = "email-field-validation-msg")
    private WebElement emailFieldValidationMsg;

    public PasswordResetPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPasswordResetPageToLoad() { waitForPageToLoad(forgotPasswordButton, 5);}

    public void enterEmail(String email) {
        super.enterEmail(emailField, email);
    }

    public void clickForgotPasswordButton() {forgotPasswordButton.click();}

    public String getEmailValidationErrorMessage() {return emailFieldValidationMsg.getText();}
}
