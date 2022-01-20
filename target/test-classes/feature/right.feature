Feature: Check the right side

  Scenario: Check form functionality
    Given I navigate to the Try Testing This page
    And I enter username and password
    And I select the gender
    And I select only one option
    And I  select multiple options
    And I chose applicable options
    When I scroll page
    And I typing an answer
    And I select a color
    And I select a date
    And I scroll range value 
    And I select a file
    And I select a quantity
    And I typing a long message
    And I press the submit button
    And I close the tab
    Then I close the browser
