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
@Travel
Feature: New Tour registeration with Parameters
  Scenario: Navigate 
    Scenario Outline: User Registeration.
    Given Navigate to NewTour with given "<url>"
    And   Click to registeration link 
    When  Enter all mandatory fields for registeration "<firstName>","<lastName>","<phone>","<userName>","<country>","<email>","<password>","<confirmPassword>"
    And   Submit the form
    And   log in to the application with given "<username>" and "<password>" registeration credentionals 
    Then  Validate registeration is successful or not.
   Examples: 
 |url|firstName|lastName|phone|userName|country|email|password|confirmPassword|username|password|
 |http://newtours.demoaut.com|aai|dd|9090909090|askme|INDIA|ajja1@aaa.com|12345|12345|ajja1@aaa.com|12345|
 |http://newtours.demoaut.com|aac|dd|9090909090|askme|INDIA|ajja2@aaa.com|12345|12345|ajja2@aaa.com|12345|
 |http://newtours.demoaut.com|aad|dd|9090909090|askme|INDIA|ajja3@aaa.com|12345|12345|ajja3@aaa.com|12345|
 |http://newtours.demoaut.com|aae|dd|9090909090|askme|INDIA|ajja4@aaa.com|12345|12345|ajja4@aaa.com|12345|
 |http://newtours.demoaut.com|aaf|dd|9090909090|askme|INDIA|ajja5@aaa.com|12345|12345|ajja5@aaa.com|12345|
 |http://newtours.demoaut.com|aag|dd|9090909090|askme|INDIA|ajja6@aaa.com|12345|12345|ajja6@aaa.com|12345|
 |http://newtours.demoaut.com|aah|dd|9090909090|askme|INDIA|ajja7@aaa.com|12345|12345|ajja7@aaa.com|12345|
 |http://newtours.demoaut.com|aai|dd|9090909090|askme|INDIA|ajja8@aaa.com|12345|12345|ajja8@aaa.com|12345|
 |http://newtours.demoaut.com|aaj|dd|9090909090|askme|INDIA|ajja9@aaa.com|12345|12345|ajja9@aaa.com|12345|
 |http://newtours.demoaut.com|aak|dd|9090909090|askme|INDIA|ajja10@aaa.com|12345|12345|ajja10@aaa.com|12345|