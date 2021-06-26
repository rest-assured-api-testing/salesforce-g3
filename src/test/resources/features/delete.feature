Feature: Delete for the features of salesforce

  @DeleteACampaign
  Scenario: Delete a Campaign
    Given I build "DELETE" request
    When I execute delete "CAMPAIGN_ID" request
    Then Status response of request should be "NO_CONTENT"

  @DeleteACase
  Scenario: Delete a Case
    Given I build "DELETE" request
    When I execute delete "CASE_ID" request
    Then Status response of request should be "NO_CONTENT"

  @DeleteAContact
  Scenario: Delete a Contact
    Given I build "DELETE" request
    When I execute delete "CONTACT_ID" request
    Then Status response of request should be "NO_CONTENT"

  @DeleteAPriceBook
  Scenario: Delete a priceBook
    Given I build "DELETE" request
    When I execute delete "PRICE_BOOK_ID" request
    Then Status response of request should be "NO_CONTENT"

  @DeleteAProduct2
  Scenario: Delete a Product
    Given I build "DELETE" request
    When I execute delete "PRODUCT2_ID" request
    Then Status response of request should be "NO_CONTENT"
  @DeleteAnAccount
  Scenario: Delete a Product
    Given I build "DELETE" request
    When I execute delete "ACCOUNT_ID" request
    Then Status response of request should be "NO_CONTENT"