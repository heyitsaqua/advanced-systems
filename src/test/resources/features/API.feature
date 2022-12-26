Feature: End to end test

  Background: URL
    Given User gets Base URL

  @ASY-21
  Scenario: GET existing courses
    When User send GET request to the endpoint "/api/school/programs/devcourse"
    Then User should get status code 200
    When User send GET request to the endpoint "/api/school/programs/sdetcourse"
    Then User should get status code 200
#   Then the response should include fields called "_id", "name" and "duration"
    Then the response should include following fields
      | "_id"      |
      | "name"     |
      | "duration" |

  @ASY-27a
  Scenario: Bearer token retrieval
    When User adds basic auth with username "user" and password "user123"
    Then User should get status code 200
    Then response should contain a "token"

@AS-27b
    Scenario: Bearer token retrieval
    When User adds basic auth with username "user" and password "user1234"
    Then User should get status code 401
    Then response should contain a message "Invalid username or password"


  @AS-24
  Scenario: Add new student performing POST request
    Then User should be able to add to student with required fields like batch name, firstname, lastname, email
    And Verify if student added
    And User should get status code 200
