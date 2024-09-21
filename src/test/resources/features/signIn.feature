@smokeTest
@loginTest

Feature: Sign In

  Scenario: User successfully navigates to the Sign In page from the Customer Home Page
    Given I am on the Customer Home Page
    When I click on Sign In
    Then I see the Sign In page

  Scenario Outline: Email field validation
    Given I am on the Customer Home Page
    And I click on Sign In
    And I see the Sign In page
    And I enter an invalid email address "<email>"
    And I enter a password "<password>"
    And I click log in
    #first login click doesn't seem to trigger anything
    And I click log in
    Then I see the error message "<error>"
    # these tests would work but end up triggering a captcha

  Examples:
    | email       | password  | error                               |
    | test        | test      | Please enter a valid email address  |
    | @test.com   | test      | Please enter a valid email address  |
    | test@.com   | test      | Please enter a valid email address  |