@browser
Feature: browser

  @firefox
  Scenario: Finding some cheese
    Given I am on the Google search page
    When I search for "Cheese!"
    Then the page title should start with "cheese"
    
  @chrome
  Scenario: Finding some sausage
    Given I am on the Google search page
    When I search for "Sausage!"
    Then the page title should start with "sausage"