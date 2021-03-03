@googleSearch
Feature: Search an element in Google

  Scenario: Search for String Step by Step Automation
    Given Browser is open
    And Google url given in browser
    When Enter value in search box
    And Click on Search button
    Then Verify search result page available