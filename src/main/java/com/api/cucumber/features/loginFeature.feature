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
@tag
Feature: Login To The Application
  Testing scnarios for testing login feature of the application

  @tag1
  Scenario: User Login Scenario
    Given User is at the login page of the application
    When User loing with the username and password as
      | user1 | password1 |
      | user2 | password2 |
      | user3 | password3 |
    Then User should be able to login with correct user name and password
