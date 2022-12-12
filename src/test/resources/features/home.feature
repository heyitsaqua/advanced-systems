Feature: Home page tests

  Background: Navigate to Home page
    Given I open url of homepage

  @AS6 @smoke
  Scenario: Test title of the home page
    Then Verify title text is "Advance Systems - Home"

  @AS-11 @smoke
  Scenario Outline:  There should be a section with 5 items displayed as a headers and descriptions under it
    Then Verify  "<items>" are displayed
    Examples:
      |items                         |
      | Leadership Development       |
      | Capability Building          |
      | Employee & Employer          |
      | Relations                    |
      | Rewards & Benefits           |
      | Excellent Customer Service   |

  @AS-10 @smoke
#    BUG -> there is no instagram!!!
  Scenario Outline: Each button should take the user to corresponding page
    And Verify "<media>" Btn is displayed
    And I click "<media>" button
    Then Verify "<title>" of the destination page matching
    Examples:
        |media           |title                        |
        |facebook        |Facebook - log in or sign up |
        |twitter         |Twitter                      |
        |instagram       |Instagram                    |
        |linkedin        |LinkedIn: Log In or Sign Up  |

  @smoke @AS-7
  Scenario:  Test nav buttons are displayed
    Then Verify button "Get Support" is displayed
    Then Verify button "Job Career" is displayed
    Then Verify button "Feedback" is displayed
    When I click nav button English
    Then Verify button "English" is displayed
    Then Verify button "Spanish" is displayed
    Then Verify button "French" is displayed

    @AS-8 @smoke
    Scenario:  Test Join Now button should be clickable and take up Join Us page
      Then Verify button "Join Now" is displayed
      Then Verify click "Join Now" button is enabled
      Then Verify "Advance Systems - Join Us" of the page




