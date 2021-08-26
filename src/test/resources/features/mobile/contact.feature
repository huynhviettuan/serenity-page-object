@Mobile
Feature: Contact test

  Scenario: search contact
    Given I search "Sara"
    Then I verify first contact is "Sara Alston"
    When I navigate to search result details
    Then I verify contact name "Sara Alston"