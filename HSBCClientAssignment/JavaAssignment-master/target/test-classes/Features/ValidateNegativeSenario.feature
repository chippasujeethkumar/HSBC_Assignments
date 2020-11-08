Feature: Foreign currency exchange rates API with currency conversion

 Scenario: Checking the error URL response
    Given Rates API for Latest Foreign Exchange rates Incorrect URL
    When The API response is giving error
    Then Check the response of the code