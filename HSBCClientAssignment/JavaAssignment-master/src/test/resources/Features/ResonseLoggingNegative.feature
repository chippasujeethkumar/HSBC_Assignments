Feature: Foreign currency exchange rates API with currency conversion

Scenario: Validating the API for the negative Scenario
	Given API for foreign exchange 
	When posted with future date information
	Then validate positive response code received Store the response into response object