Feature: Home page tests

  Background: Navigate to Home page
    Given I open url of homepage

  @AS6
  Scenario: Test title of the home page
    Then Verify title text is "Advance Systems - Home"


  @AS-11
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


  @AS-10a
  Scenario Outline: Verify social media buttons are displayed
    Then Verify button media Btn is displayed
    Examples:
      |Facebook       |
      |Twitter        |
      |Google         |
      |Linkedin       |

  @AS-10b
  Scenario Outline: Each button should take the user to corresponding page
    When I click "<media>" button
    Then Verify "<title>" of the destination page matching
    Examples:
        |media           |title                        |
        |facebook        |Facebook - log in or sign up |
        |twitter         |Twitter           |
        |instagram       |Instagram                       |
        |linkedin        |LinkedIn: Log In or Sign Up  |

