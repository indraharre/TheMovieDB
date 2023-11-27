Feature: Submit search form

  Scenario: Navigating to Oppenheimer profile
    Given I am on the homepage
    And There is a search bar
    When I enter the name Oppenheimer
    When I click the Search button
    Then The first item should the profile of Oppenheimer