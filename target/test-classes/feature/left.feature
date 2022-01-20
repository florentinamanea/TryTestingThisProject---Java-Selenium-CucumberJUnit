Feature: Check the left side

  Scenario: Check alert button functionality 
    Given user enters the page
    When user press the alert button
    And user confirm the alert
    Then user close the browser

  Scenario: Check functionality login page
    Given user enters the page
    When user enter username and password
    And user press login button
    Then user close the browser
