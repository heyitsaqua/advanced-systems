Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

    @AS-15
    Scenario Outline: Verify that each quick link is displayed and opens properly
      And I wait 1 seconds
      Then Verify button "<button name>" is displayed
      And I click a button "<button name>"
      Then Verify page opens
      Examples:
      | button name |
      | Home |
      | About Us |
      | Services |
      | Clients |
      | Join Us |
      | Contact Us |

    @AS-16
    Scenario Outline: Verify that each social media link is displayed properly
      And I wait 1 seconds
      Then Verify social media button with link "<link>" is displayed
      Examples:
      | link |
      | https://facebook.com |
      | https://twitter.com |
      | https://skype.com |
      | https://linkedin.com |

