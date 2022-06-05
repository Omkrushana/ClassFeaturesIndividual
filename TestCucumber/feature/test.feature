@tag
Feature: Testing Login functionality
Scenario: Verify for correct credentials
    Given Browser is opned
    When Enter correct credentials & clicked login button		
    Then Application should be navigated to home page
