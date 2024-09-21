@smokeTest
@loginTest

Feature: Sign In

  Scenario: User successfully navigates to the Sign In page from the Customer Home Page
    Given I am on the Customer Home Page
    When I click on Sign In
    Then I see the Sign In page