Feature: Post for the features of salesforce

  @CreateACampaign
  Scenario: Create a Campaign
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | nombre | Created campaign name |
    Then Status response of request should be "BAD_REQUEST"

  @CreateACase
  Scenario: Create a Case
    Given I build "POST" request
    When I execute create "CASE" request
      | nombre | Working |
    Then Status response of request should be "BAD_REQUEST"

  @CreateAContact
  Scenario: Create a Contact
    Given I build "POST" request
    When I execute create "CONTACT" request
      | nombre | Lalo Landa |
    Then Status response of request should be "BAD_REQUEST"

  @CreateAPriceBook
  Scenario: Create a priceBook
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | nombre | Created PriceBook |
    Then Status response of request should be "BAD_REQUEST"

  @CreateAProduct2
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | nombre | Created Product |
    Then Status response of request should be "BAD_REQUEST"
  @CreateAnAccount
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "ACCOUNT" request
      | nombre | Created account |
    Then Status response of request should be "BAD_REQUEST"