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
Feature: User Login to PE
  I want to use this template for my feature file

  @positiveScenarios @regression
  Scenario: Single User login
    Given User navigates to PE Login Page
    And User enters valid Username and Password
    When User clicks the Submit button
    Then User should be able to login to PE
    And User should see the Main page

  @multipleLoginCredentials
  Scenario Outline: Multiple User Login
    Given User navigates to PE Login Page
    And User enters valid user name <username> and password <password>
    When User clicks the Submit button
    Then User should see the Main page

    Examples: 
      | username  | password |
      | NRA0504 |     test123 |
      | NRA7621 |     test123 |
