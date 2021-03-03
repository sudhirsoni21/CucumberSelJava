@BackgroundTest
Feature: Check Home Page functionality

  Background: User is logged in
    Given user is on Login page
    When user enters userid and password
    And clicks on login button
    Then user navigated to Home Page

  Scenario: check Logout link
    When User clicks on welcome link
    Then Logout link is present

  Scenario: verify quick launch toolbar is present
    When User clicks on dashboard link
    Then Quick launch toolbar is displayed
