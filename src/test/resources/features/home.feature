@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage


  @AS-3
  Scenario Outline: Verify contact info is displayed on the top of the main page
    Then Verify "<contact>" info is displayed
    Examples:
      | contact           |
      | 10090 Main Street |
      | Fairfax, VA, USA  |
      | Quick Contact:    |
      | +1 703-831-3217   |



