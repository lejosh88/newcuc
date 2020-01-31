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

@AutomationPractice
Feature: AutomationPractice registeration with Parameters
@ValidCredentionals
  Scenario: Automation Practice create user 
    Scenario Outline: Automation Practice Registeration.
    Given Navigate to Automation Practice with given "<url>"
    And   Validate the Email "<email>"
    When  Enter all mandatory fields for registeration "<firstName>","<lastName>","<password>","<FnameInAddr>","<LnameinAddr>","<company>","<addressone>","<addresstwo>","<city>","<state>","<postcode>","<Country>","<Otherinfo>","<Phone>","<Mobile>","<alias>"
    And   Submit the form AutomationPractice
    Then  Validate AutomationPractice registeration is successful or not.
   
   Examples: 
 |url|email|firstName|lastName |password|FnameInAddr|LnameinAddr|company| addressone|addresstwo|city|state|postcode|Country|Otherinfo| Phone|Mobile|alias|
 |http://automationpractice.com/index.php|lej498@gmail.com|add|no|Password@123|ok|My add|Company|add one|add two|Pune|Alabama|12345|United States|otherinfo|123457876|868768768768|alias|
 |http://automationpractice.com/index.php|lej499@gmail.com|add|no|Password@123|ok|My add|Company|add one|add two|Pune|Alabama|12345|United States|otherinfo|123457876|868768768768|alias|
 |http://automationpractice.com/index.php|le489@gmail.com|add|no|Password@123|ok|My add|Company|add one|add two|Pune|Alabama|12345|United States|otherinfo|123457876|868768768768|alias|
 
 @Errorvalidation
 Scenario: Automation Practice, verify error validation
    Scenario Outline: Automation Practice login, by using already used email id
    Given Navigate to Automation Practice with given "<url>"
    When   Validate the Email "<email>"
    Then Validate error message "<error>"
    Examples: 
 |url|email|error|
  |http://automationpractice.com/index.php|Toolas898@gmail.com|An account using this email address has already been registered. Please enter a valid password or request a new one.|