package com.jameszilchtask.steps;

import com.jameszilchtask.pages.SignInPage;
import com.jameszilchtask.utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SignInPageSteps {
    private SignInPage signInPage = new SignInPage(DriverFactory.getDriver());

    @Then("I see the Sign In page")
    public void iSeeTheSignInPage() {
        signInPage.waitForSignInPageToLoad();
        Assert.assertEquals("Sign in - Zilch Customer Portal", signInPage.getPageTitle());
    }

    @Given("I am on the Sign In page")
    public void iAmOnTheSignInPage() {signInPage.waitForSignInPageToLoad();}

    @And("I enter an invalid email address \"([^\"]*)\"$")
    public void iEnterAnInvalidEmailAddress(String email){signInPage.enterEmail(email);}

    @And("I enter a password \"([^\"]*)\"$")
    public void iEnterAPassword(String password){signInPage.enterPassword(password);}
    @And("I click log in")
    public void iClickThePageHeader(){signInPage.clickLoginButton();}

    @Then("I see the error message \"([^\"]*)\"$")
    public void iSeeTheErrorMessage(String errorMessage){
        signInPage.waitForEmailFieldErrorMessage();
        Assert.assertEquals(errorMessage, signInPage.getEmailValidationErrorMessage());
    }

}
