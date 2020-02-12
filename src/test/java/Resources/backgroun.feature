Feature: Creating  example feature
@SmokeTest
  Background: Login the website
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on human resources on top
    And Click on setup

  Scenario: Create a position salary

    And Click on position salary
    And Click on plus icon
    And Type in new positions salary "abcdefgh"

    When Click on save button
    Then "abcdefgh" should be displayed
    Then Remove the data "abcdefgh"
    Then Verify data is removed "abcdefgh"

  Scenario Outline: Creating the positions

    And Click on positions
    And Click on plus icon
    And Type in new positions names "<positionsNames>"
    And Type in shortnames"<psn>"
    When Click on save button
    Then "<positionsNames>" should be displayed
    And Remove the data "<positionsNames>"
    Then Verify data is removed "<positionsNames>"

    Examples:
      | positionsNames | psn  |
      | name1          | shn1 |
      | name2          | shn2 |
      | name3          | shn3 |
