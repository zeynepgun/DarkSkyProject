@homepage
Feature:DarkSky Weather Check
  Scenario: Lowest and Highest Temperatures
    Given I am on darksky homepage
    When I enter the location in the location field
    Then I see the lowest and highest Temperatures

