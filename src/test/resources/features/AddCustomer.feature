#AddCustomer
@regression @addcust @sprint1
Feature: To test add customer functionality

  @us1
  Scenario: To test the generate customer ID functionality1
    Given the user is in add customer pag
    When the user fill in valid customer details
      | firstName   | test           |
      | lastName    | one            |
      | emailAdress | test@gmail.com |
      | adress      | chennai        |
      | phoneNum    |        7464849 |
    And the user clicks the submit button
    Then the user should see the customer id generated

  @us2 @smoke
  Scenario: To test the generate customer ID functionality2
    Given the user is in add customer pag
    When the user fill in valid customer details
      | firstName   | test           |
      | lastName    | two            |
      | emailAdress | test@gmail.com |
      | adress      | chennai        |
      | phoneNum    |        7464849 |
    And the user clicks the submit button
    Then the user should see the customer id generated

  @us3
  Scenario: To test the generate customer ID functionality3
    Given the user is in add customer pag
    When the user fill in valid customer details
      | firstName   | test           |
      | lastName    | three          |
      | emailAdress | test@gmail.com |
      | adress      | chennai        |
      | phoneNum    |        7464849 |
    And the user clicks the submit button
    Then the user should see the customer id generated
