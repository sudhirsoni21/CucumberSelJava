Feature: Check Login functionality

  @HooksTest
  Scenario Outline: 
    Given user is on login page
    When user enters valid <userid> and <password>
    And click on login button
    Then user is navigate to home page

    Examples: 
      | userid | password |
      | Sudhir |    12345 |
      | Deepti |    12345 |
      | Tanush |    12345 |
      | Aarush |    12345 |
