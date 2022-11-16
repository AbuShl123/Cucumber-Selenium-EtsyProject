@wip
Feature: Filter functionality
  User Story: As a user I want to be able to filter products on the 'clothing & shoes' page
    AC1: Verify that 'FREE shipping' filter filters only free shipping sales
    AC2: Verify that 'Under USD 25' filter shows only products which cost at most $25
    AC3: Verify tht User can choose custom price filter and it also works properly

  Background: for all Test Scenarios User should be on the Home page and click on Clothing & Shoes
    Given user is on home page
    When user clicks on clothing & shoes

  Scenario: FREE shipping
    When user clicks on All Filters button
    When user selects FREE shipping option
    And user clicks on apply button
    Then all products on the page appear with "FREE shipping" label