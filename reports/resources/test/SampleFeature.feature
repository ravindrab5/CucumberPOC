@LoginFunctionality
Feature: To check the sample tests

  Background: SomeSteps Before background
    Given inside background given
    When inside background when


  Scenario: Check the login functionality
    Given a user navigates to login page
    When he enters valid username
    And valid password
    Then he successfully logs in to the system.

  Scenario: Check the login functionality with invalid username or password
    Given a user navigates to login page
    When he enters valid username
    And invalid password
    Then an error message should be displayed.