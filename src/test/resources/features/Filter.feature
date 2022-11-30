@smoke
Feature: Filter functionality
  User Story: As a user I want to be able to filter products on the 'clothing & shoes' page
  AC1: Verify that 'FREE shipping' filter filters only free shipping sales
  AC2: Verify that 'Under USD 25' filter shows only products which cost at most $25
  AC3: Verify tht User can choose custom price filter and it also works properly

  Background: for all Test Scenarios User should be on the Home page and click on Clothing & Shoes and click All Filters button
    Given user is on home page
    When user clicks on clothing & shoes
    When user clicks on All Filters button

  Scenario: FREE shipping
    When user selects FREE shipping option
    And user clicks on apply button
    Then all products on the page appear with "FREE shipping" label

  Scenario: Under USD 25
    When user selects Under USD 25 option
    And user clicks on apply button
    Then all products on the page should appear with price of no more less than $25

  @wip
  Scenario Outline: Custom Filter
    When user selects custom under price option
    When user sets low parameter to $"<low_parameter>"
    When user sets high parameter to $"<high_parameter>"
    And user clicks on apply button
    Then All Items on the page should appear with price in range of $"<low_parameter>" to $"<high_parameter>"

    Examples:
      | low_parameter | high_parameter |
      | 20            | 40             |
      | 0             | 14             |
      | 50            | 100            |
      | 19            | 34             |
      | 67            | 100            |
      | 0             | 50             |


