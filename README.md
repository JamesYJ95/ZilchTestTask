# Project Title: Zilch Technical Task

For my task, I have created a test automation framework in Java utilising Selenium & Cucumber & a Page-Object model to test the Zilch customer site.
Using Cucumber allows for greater test clarity, reusable test steps and easy reporting & CI/CD integration, while also supporting parameterization.
The page object model was used to reduce code duplication and make the framework easier to maintain.

IntelliJ IDE was used too

Note: As this is using the production site, we run into some captcha issues.
## TO DO
 - Write more tests, this is obviously far from a complete set of comprehensive front-end tests.
 - Implement a mock web service to allow for stubbed API requests, which can allow for better edge case coverage, and removes the dependency on live APIs.
 - Integrate with CI/CD pipeline.

## Installation
 - Checkout the main branch
 - Update the path to chromedriver in DriverFactory.java to be relevant to your machine
 - Install Maven (mvn install) to set up any dependencies
 - Navigate to the feature file and select the scenario you'd like to run.
