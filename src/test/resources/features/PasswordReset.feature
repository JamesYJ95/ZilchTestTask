@smokeTest
@passwordResetTest

 Feature: Password Reset

   Scenario Outline: Email Address Validation
     Given I am on the Customer Home Page
     And I click on Sign In
     And I am on the Sign In page
     And I click on 'Forgot your password?'
     And I am on the Password Reset page
     And I enter an invalid email address "<email>"
     And I click on Send Link
     Then I see the error message "<error>"

     Examples:
       | email       | error                               |
       | test        | Please enter a valid email address  |
       | @test.com   | Please enter a valid email address  |
       | test@.com   | Please enter a valid email address  |
       |             | Oops, this can't be left empty!     |
