package com.jameszilchtask.steps;

import com.jameszilchtask.pages.CustomerHomePage;
import com.jameszilchtask.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CustomerHomePageSteps {
    private CustomerHomePage customerHomePage = new CustomerHomePage((DriverFactory.getDriver()));

    @When("I click on Sign In")
    public void iClickOnSignIn() {
        customerHomePage.clickSignInButton();
    }

    @Given("I am on the Customer Home Page")
    public void iAmOnTheCustomerHomePage() {
        customerHomePage.waitForCustomerHomePageToLoad();
    }

}
