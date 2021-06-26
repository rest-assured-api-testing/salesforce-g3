Feature: Delete for the features of salesforce

  #DeleteACampaign
  Scenario: Delete a Campaign
    Given I build "DELETE" request
    When I execute delete "CAMPAIGN_ID" with an "INVALID_CAMPAIGN_ID" request
    Then Status response of request should be "NOT_FOUND"

  #DeleteACase
  Scenario: Delete a Case
    Given I build "DELETE" request
    When I execute delete "CASE_ID" with an "INVALID_CASE_ID" request
    Then Status response of request should be "NOT_FOUND"

  #DeleteAContact
  Scenario: Delete a Contact
    Given I build "DELETE" request
    When I execute delete "CONTACT_ID" with an "INVALID_CONTACT_ID" request
    Then Status response of request should be "NOT_FOUND"

  #DeleteAPriceBook
  Scenario: Delete a priceBook
    Given I build "DELETE" request
    When I execute delete "PRICE_BOOK_ID" with an "INVALID_PRICE_BOOK_ID" request
    Then Status response of request should be "NOT_FOUND"

  #DeleteAProduct2
  Scenario: Delete a Product
    Given I build "DELETE" request
    When I execute delete "PRODUCT2_ID" with an "INVALID_PRODUCT2_ID" request
    Then Status response of request should be "NOT_FOUND"
  #DeleteAnAccount
  Scenario: Delete an Account
    Given I build "DELETE" request
    When I execute delete "ACCOUNT_ID" with an "INVALID_ACCOUNT_ID" request
    Then Status response of request should be "NOT_FOUND"