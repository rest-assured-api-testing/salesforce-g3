Feature: Post for the features of salesforce

  #CreateACampaign
  Scenario: Create a Campaign
    Given I build "POST" request
    When I execute create "INVALID_CAMPAIGN" request with invalid values
      | name | Created campaign name |
    Then Status response of request should be "NOT_FOUND"

  #CreateACase
  Scenario: Create a Case
    Given I build "POST" request
    When I execute create "INVALID_CASE" request with invalid values
      | status | Working |
    Then Status response of request should be "NOT_FOUND"

  #CreateAContact
  Scenario: Create a Contact
    Given I build "POST" request
    When I execute create "INVALID_CONTACT" request with invalid values
      | lastname | Lalo Landa |
    Then Status response of request should be "NOT_FOUND"

  #CreateAPriceBook
  Scenario: Create a priceBook
    Given I build "POST" request
    When I execute create "INVALID_PRICE_BOOK" request with invalid values
      | name | Created PriceBook |
    Then Status response of request should be "NOT_FOUND"

  #CreateAProduct2
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "INVALID_PRODUCT2" request with invalid values
      | name | Created Product |
    Then Status response of request should be "NOT_FOUND"
  #CreateAnAccount
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "INVALID_ACCOUNT" request with invalid values
      | name | Created account |
    Then Status response of request should be "NOT_FOUND"