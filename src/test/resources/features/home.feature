Feature: Home page tests

  Background: Navigate to Home page
    Given I open url of homepage

  @AS-4
  Scenario: Verify Header, description and Read More button
    Then Verify section "Header" is displayed
    Then Verify section "Description" text is displayed
    Then Verify section "Read More" button is displayed
    Then user click on "Read More" button


  @AS-12
    Scenario: Verify header and message should be displayed
    Then Verify the  header should display "Words from our Clients"
    Then Verify testimonials, name, state should display on the page

