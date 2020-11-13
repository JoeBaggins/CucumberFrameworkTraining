#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@testLogin
Feature: 	In order to perform successful login
					As a user
					I want to enter correct username and password

	Background:
	
		Given User navigates to PE Login Page

  @positiveScenarios @passingStringValues
  Scenario: Single User login    
    And User enters valid Username "NRA7621" and Password "test123"
    When User clicks the Submit button
    Then User should be able to login to PE
    And User should see the Main page
    
    
    @positiveScenarios @dataTable
  Scenario Outline: Single User login
    And User enters valid Username "<username>" and Password "<password>"
    When User clicks the Submit button
    Then User should be able to login to PE
    And User should NOT see the Main page
  
  Examples:
    
    |username	|password	|
    |NRA1234	|test123	|
    |NRA5678	|test890	|

  