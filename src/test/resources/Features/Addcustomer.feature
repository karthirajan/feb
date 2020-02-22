@regression
Feature: Add Customer
  I want to use this template for my feature file

Background:
    And User click on add customer button
  
  
  Scenario: Title of your scenario
    When User enters all the fields
    And User click on submit button
    Then User should be display cutomer id
 
 @karthi 
  Scenario: Title of your scenario with oneDim
    When User enters all the fields with one dim list
    |karthi|rajan|rjan@gmail.com|tanjore|123565432|
    And User click on submit button
    Then User should be display cutomer id
    
    Scenario: Title of your scenario with oneDim
    When User enters all the fields with one dim map
    |fname|soundar|
    |lname|rajan|
    |mail|rajan@gmail.com|
    |addr|trichy|
    |phno|76656126421|
    And User click on submit button
    Then User should be display cutomer id
    



