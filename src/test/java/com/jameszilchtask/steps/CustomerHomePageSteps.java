package com.jameszilchtask.steps;

import com.jameszilchtask.pages.CustomerHomePage;
import com.jameszilchtask.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CustomerHomePageSteps {
    private CustomerHomePage customerHomePage = new CustomerHomePage((DriverFactory.getDriver()));

    @When("I click on Sign In")
    public void iClickOnSignIn() {
        customerHomePage.clickSignInButton();
    }

    @Then("I see the Sign In Page title as Sign In")
    public void iSeeTheSignInPage() {
        Assert.assertEquals("Sign In", customerHomePage.getPageTitle());
    }

    @Given("I am on the Customer Home Page")
    public void iAmOnTheCustomerHomePage() {
    }
}
