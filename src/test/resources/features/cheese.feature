Feature: For the love of cheese

  Scenario: The search for cheese
    Given I am on Google home page
    When I enter the keyword of "Cheese"
    And click the Submit button
    Then the page title returned is "Cheese - Google Search"

  Scenario: The search for Star Wars
    Given I am on Google home page
    When I enter the keyword of "Star Wars"
    And click the Submit button
    Then the page title returned is "Star Wars - Google Search"
        
  Scenario: The search for tinker Bell
    Given I am on firefox home page
    When I enter the keyword "Tinker Bell"
    Then the page returns searches for "Tinker Bell"
    
    
  Scenario:
    