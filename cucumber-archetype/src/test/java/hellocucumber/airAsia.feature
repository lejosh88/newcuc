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
@airasia
Feature: Flight Search on AirAsia.
@Flight
Scenario: Navigate 
Scenario Outline: Flight Search
Given Launch the browser and navigate to AirAsia with given "<url>"
When Verify the title  of the page
Then Navigate and search one way from "<source>" to "<destination>" with given "<date>"
     
 Examples: 
      |url  | source | destination |date|
      | https://www.airasia.com/en/gb?cid=1 |   Bengaluru | Pune |31-12-2019|
  
  @Login
 Scenario:Login
 Scenario Outline: Enter login credentionals
  Given Launch the browser and navigate to AirAsia with given "<url>"
  When Verify the title  of the page
    Then Validate the login credentinals with valid "<username>" and "<password>"
    
Examples: 
      |url |username|password|
      | https://www.airasia.com/en/gb?cid=1 |a@gmail.com|India1234|
 
    
     
