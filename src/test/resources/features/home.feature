Feature: Home page tests

  Background: Navigate to Home page
    Given I open url of homepage

  @smoke @US500
  Scenario:  Test nav buttons are displayed
    Then Verify button "Get Support" is displayed
    Then Verify button "Job Career" is displayed
    Then Verify button "Feedback" is displayed
    When I click nav button English
    Then Verify button "English" is displayed
    Then Verify button "Spanish" is displayed
    Then Verify button "French" is displayed


  @AS-9
  Scenario Outline: Verify the Navigation Menu is Displayed while Scrolling Through the Home Page

    Then Scroll down the page
    Then Verify Navigation Menu is Displayed
    Then Test the Navigation "<buttons>"
    When I click "<NavButtons>"
    Then Verify "<URL>" of Destination Page
    Examples:

      | buttons    | NavButtons | URL                                                                 |
      | Home       | Home       | https://tla-batch-6.github.io/advance-systems-test-b6/index.html    |
      | About Us   | About Us   | https://tla-batch-6.github.io/advance-systems-test-b6/about.html    |
      | Services   | Services   | https://tla-batch-6.github.io/advance-systems-test-b6/services.html |
      | Clients    | Clients    | https://tla-batch-6.github.io/advance-systems-test-b6/clients.html  |
      | Contact Us | Contact Us | https://tla-batch-6.github.io/advance-systems-test-b6/contact.html  |

