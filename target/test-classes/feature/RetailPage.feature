@Retailtest
Feature: Retail Page Feature

  Background: 
    Given user is on Retail home Page
    When user click on MyAccount
    And user click on Login option
    And user enter userName "vas987@gmail.com"  and password "0123456"
    And user click on login button
    Then user should be logged into myAccount Page
@test1
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company  | website      | taxID   | paymentMethod| payeeName |
      | USA tek | tekschool.com | 1234231 | Cheque       |  Vasila  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
@test2
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | Chase     |   12387134 |  55746132 | checking      |    223136452 |
    And User click on Continue button
    Then User should see a success message
@test3
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email                   | telephone  |
      | Vasila     | Rakhmonkulova      | usat.edit07011@gmail.com | 22241242474 |
    And User click on Continue button
    #Then User should see a message 'Success: Your account has been successfully updated.'
