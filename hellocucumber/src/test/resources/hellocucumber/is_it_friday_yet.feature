Feature: Is it friday yet

  Scenario: Sunday isn't Friday 
    Given today is Sunday
    When I ask if it's Friday
    Then It should tell "no"

  Scenario: Friday is Friday
    Given today is Friday
    When I ask if it's Friday
    Then It should tell "TGIF"

  Scenario: anything else! isn't Friday 
    Given today is anything else!
    When I ask if it's Friday
    Then It should tell "no"