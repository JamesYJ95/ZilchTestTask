package com.jameszilchtask.steps;

import com.jameszilchtask.pages.CustomerHomePage;
import com.jameszilchtask.pages.PasswordResetPage;
import com.jameszilchtask.utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PasswordResetPageSteps {
    private PasswordResetPage passwordResetPage = new PasswordResetPage((DriverFactory.getDriver()));

    @Given("I am on the Password Reset page")
    public void iAmOnThePasswordReset() {passwordResetPage.waitForPasswordResetPageToLoad();}

    @And("I enter an invalid email address \"([^\"]*)\"$")
    public void iEnterAnInvalidEmailAddress(String email) {passwordResetPage.enterEmail(email);}

    @And("I click on Send Link")
    public void iClickOnSendLink() {passwordResetPage.clickForgotPasswordButton();}

    @Then("I see the error message \"([^\"]*)\"$")
    public void iSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage, passwordResetPage.getEmailValidationErrorMessage());
    }
}
