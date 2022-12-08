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

#  @US501
#  Scenario: Verify language buttons are displayed when user click on nav button English
#    When I click nav button English
#    Then Verify button "English" is displayed
#    Then Verify button "Spanish" is displayed
#    Then Verify button "French" is displayed




