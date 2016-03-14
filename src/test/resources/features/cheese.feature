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

  Scenario: The search for Tinker Bell
    Given I am on Google home page
    When I enter the keyword of "Tinker Bell"
    And click the Submit button
    Then the page title returned is "Tinker Bell - Google Search"

  @manual
  Scenario: My test scenario
    Given I have something
    When I act on it
    Then I should see something else

  Scenario: The search for Mickey Mouse
    Given I am on Google home page
    When I enter the keyword of "Mickey Mouse"
    And click the Submit button
    Then the page title returned is "Mickey Mouse - Google Search"

  @regression
  Scenario Outline: The search for <keyword>
    Given I am on Google home page
    When I enter the keyword of "<keyword>"
    And click the Submit button
    Then the page title returned is "<title>"

    Examples: Google Search
    | keyword         | title                           |
    | Marvel Avengers | Marvel Avengers - Google Search |
    | Daredevil       | Daredevil - Google Search       |
