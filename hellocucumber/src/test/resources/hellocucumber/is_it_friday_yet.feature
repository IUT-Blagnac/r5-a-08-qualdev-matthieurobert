Feature: Is it friday yet

  Scenario Outline: Is it friday
    Given today is "<day>"
    When I ask if it's Friday
    Then It should tell "<answer>"

  Examples:
    | day            | answer |
    | Friday         | TGIF   |
    | Sunday         | Nope   |
    | anything else! | Nope   |