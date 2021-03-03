#By using this hash symbol we can put comment like
# Author: Sudhir Soni
# Created on: 2/2/2021
# Modified By:
# Modified on:
#**By using @ sign we could tag whole feature file and/or individual test
@LoginTest
Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Sudhir   |    12345 |
      | Deepti   |    12345 |
      | Tanush   |    12345 |
      | Aarush   |    12345 |
