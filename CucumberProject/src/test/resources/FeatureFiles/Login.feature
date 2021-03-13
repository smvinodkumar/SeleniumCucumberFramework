Feature: To validate the facebook login functionality

  Scenario: To verify login with invalid credentials
    Given user is on facebook login page
    When user enter username and password
    And user clic on the Login button
    Then user is on Facebook Home Page