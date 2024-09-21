package com.jameszilchtask.steps;

import com.jameszilchtask.pages.SignInPage;
import com.jameszilchtask.utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignInPageSteps {
    private SignInPage signInPage = new SignInPage(DriverFactory.getDriver());

    @Then("I see the Sign In page")
    public void iSeeTheSignInPage() {
        signInPage.waitForSignInPageToLoad();
        Assert.assertEquals("Sign in - Zilch Customer Portal", signInPage.getPageTitle());
    }

    @Given("I am on the Sign In page")
    public void iAmOnTheSignInPage() {signInPage.waitForSignInPageToLoad();}

    @And("I click on 'Forgot your password?' link")
    public void iClickOnForgotYourPassword() {signInPage.clickForgotPasswordLink();}

}
