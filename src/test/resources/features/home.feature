Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage



  @AS-4 @smoke
  Scenario: Verify the Header, Description and Read More button
    When User Verify "Header" is displayed
    And User Verify "Description" text is displayed
    Then User Verify "Read More" button is displayed
    Then User click on "Read More" Btn
    And  Verify "Advance Systems - Services" button takes User to page


  @AS-12
    Scenario: Verify header and message should be displayed
    Then Verify the  header should display "Words from our Clients"
    Then Verify testimonials, name, state should display on the page

    @AS-15 @smoke
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

    @AS-16 @smoke
    Scenario Outline: Verify that each social media link is displayed properly
      And I wait 1 seconds
      Then Verify social media button with link "<link>" is displayed
      Examples:
      | link |
      | https://facebook.com |
      | https://twitter.com |
      | https://skype.com |
      | https://linkedin.com |

  @AS-3 @smoke
  Scenario Outline: Verify contact info is displayed on the top of the main page
    Then Verify "<contact>" info is displayed
    Examples:
      | contact           |
      | 10090 Main Street |
      | Fairfax, VA, USA  |
      | Quick Contact:    |
      | +1 703-831-3217   |

  @AS-14 @smoke
  Scenario Outline: Verify following information is displayed in footer section
    Then Verify "<footerinfo>" is displayed
    Examples:
    |footerinfo|
    |Address: 10090 Main St, Fairfax, VA  |
    | Phone: +1 703-831-3217               |
    |Email: info@advancesystems.us        |
    |Mon to Sat: 9.00 am to 5:00 pm       |


  @AS-6 @smoke
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


  @AS-10
#    BUG -> there is no instagram!!!

  @AS-10 @smoke

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


    @AS-8

    @smoke @AS-13
   Scenario: List of Companies
      Then verify Company names are displayed in one row


    @AS-8 @smoke

    Scenario:  Test Join Now button should be clickable and take up Join Us page
      Then Verify button "Join Now" is displayed
      Then Verify click "Join Now" button is enabled
      Then Verify "Advance Systems - Join Us" of the page

  @AS-9 @smoke
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
      | Join Us    | Join Us    | https://tla-batch-6.github.io/advance-systems-test-b6/joinUs.html   |
      | Contact Us | Contact Us | https://tla-batch-6.github.io/advance-systems-test-b6/contact.html  |

