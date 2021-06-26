Feature: Patch for the features of salesforce

  @UpdateCampaign
  Scenario: Update an already created Case
    Given I build "PATCH" request
    When I execute update "CAMPAIGN_ID" request
      | name | Updated campaign name |
    Then Status response of request should be "UPDATED"

  @UpdateCase
  Scenario: Update an already created Case
    Given I build "PATCH" request
    When I execute update "CASE_ID" request
      | status | Working |
    Then Status response of request should be "UPDATED"

  @UpdateContact
  Scenario: Update an already created Case
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | lastname | Pedro Juarez |
    Then Status response of request should be "UPDATED"

  @UpdatePriceBook
  Scenario: Update an already created Case
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | name | Update PriceBook name |
    Then Status response of request should be "UPDATED"

  @UpdateProduct2
  Scenario: Update an already created Case
    Given I build "PATCH" request
    When I execute update "PRODUCT2_ID" request
      | name | Update Product name |
    Then Status response of request should be "UPDATED"