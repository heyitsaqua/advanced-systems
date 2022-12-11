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

  @AS-14
  Scenario Outline: Verify following information is displayed in footer section
    Then Verify "<footerinfo>" is displayed
    Examples:
    |footerinfo|
    |Address: 10090 Main St, Fairfax, VA  |
    | Phone: +1 703-831-3217               |
    |Email: info@advancesystems.us        |
    |Mon to Sat: 9.00 am to 5:00 pm       |




