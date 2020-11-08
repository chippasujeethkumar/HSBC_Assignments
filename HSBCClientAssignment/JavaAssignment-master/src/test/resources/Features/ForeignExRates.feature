Feature: Foreign currency exchange rates api with currency conversion

  Scenario: Checking status code
    Given Rates API for Latest Foreign Exchange rates
    When The API is available
    Then Validate the code

  Scenario: Testing
    Given Test method
    When Variables is available
    Then Assert the response

 
