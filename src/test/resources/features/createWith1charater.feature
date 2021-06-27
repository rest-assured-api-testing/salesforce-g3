Feature: Post for the features of salesforce

  @CreateACampaign
  Scenario: Create a Campaign
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name | A |
    Then Status response of request should be "CREATED"

  @CreateACase
  Scenario: Create a Case
    Given I build "POST" request
    When I execute create "CASE" request
      | status | A |
    Then Status response of request should be "CREATED"

  @CreateAContact
  Scenario: Create a Contact
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | A |
    Then Status response of request should be "CREATED"

  @CreateAPriceBook
  Scenario: Create a priceBook
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | A |
    Then Status response of request should be "CREATED"

  @CreateAProduct2
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | name | A |
    Then Status response of request should be "CREATED"
  @CreateAnAccount
  Scenario: Create a Product
    Given I build "POST" request
    When I execute create "ACCOUNT" request
      | name | A |
    Then Status response of request should be "CREATED"