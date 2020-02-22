Feature: Add Tariff
  I want to use this template for my feature file

  Scenario: AddTAriff plan with to dim
    And User click on add tariff plan button
    When User enters all the fields with two dim list
      | 400 | 300 | 200 | 100 | 1 | 4 | 9 |
      | 200 | 300 | 500 | 400 | 5 | 6 | 2 |
      | 800 | 900 | 200 | 700 | 6 | 4 | 1 |
      | 100 | 900 | 700 | 300 | 7 | 5 | 8 |
    And User clicks on submit button
    Then User should be display confirm message

@smoke
  Scenario: AddTAriff plan with to dim
    And User click on add tariff plan button
    When User enters all the fields with two dim map
      | MR  | FLM | FIS | FSP | LMC | IMC | SMS |
      | 400 | 300 | 200 | 100 |   1 |   4 |   9 |
      | 200 | 300 | 500 | 400 |   5 |   6 |   2 |
      | 800 | 900 | 200 | 700 |   6 |   4 |   1 |
      | 100 | 900 | 700 | 300 |   7 |   5 |   8 |
    And User clicks on submit button
    Then User should be display confirm message
    
   Scenario Outline: AddTAriff plan with to dim
    And User click on add tariff plan button
    When User enters all the fields "<MR>","<FLM>","<FIS>","<FSP>","<LMC>","<IMC>","<SMS>"
    And User clicks on submit button
    Then User should be display confirm message 
    
    Examples:
      | MR  | FLM | FIS | FSP | LMC | IMC | SMS |
      | 400 | 300 | 200 | 100 |   1 |   4 |   9 |
      | 200 | 300 | 500 | 400 |   5 |   6 |   2 |
      | 800 | 900 | 200 | 700 |   6 |   4 |   1 |
      | 100 | 900 | 700 | 300 |   7 |   5 |   8 |  
