Feature: Post for the features of salesforce

  @CreateACampaign
  Scenario: Create a Campaign
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name | Created campaign name |
    Then Status response of request should be "CREATED"

  @CreateACase
  Scenario: Create a Case
    Given I build "POST" request
    When I execute create "CASE" request
      | status | Working |
    Then Status response of request should be "CREATED"

  @CreateAContact
  Scenario: Create a Contact
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | Lalo Landa |
    Then Status response of request should be "CREATED"

  @CreateAPriceBook
  Scenario: Create a priceBook
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | Created PriceBook |
    Then Status response of request should be "CREATED"

  @CreateAProduct2
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | name | Created Product |
    Then Status response of request should be "CREATED"
  @CreateAnAccount
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "ACCOUNT" request
      | name | Created account |
    Then Status response of request should be "CREATED"