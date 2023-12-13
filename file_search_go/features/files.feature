Feature: search dotfiles

  Scenario Outline: Search for a dotfile
    Given I have a dotfile named "<dotfile>"
    When I search for "<dotfile>"
    Then I should see "<message>"

    Examples:
      | dotfile |  message |
      | .vimrc  |  .vimrc found |
      | .bashrc |  .bashrc found |
      | .zshrc  |  .zshrc found |