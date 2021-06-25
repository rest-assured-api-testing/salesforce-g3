Feature: Patch for the features of salesforce

  @UpdateCase
  Scenario: Update an already created Case
    Given I build a "PATCH" request
    When I set update case "CASES_ID"  with "caseId" request
    Then Status response of request should be updated "NO_CONTENT"

  @UpdateContact
  Scenario: Update an already created Case
    Given I build a "PATCH" request
    When I set update contact "CONTACT_ID"  with "contactId" request
    Then Status response of request should be updated "NO_CONTENT"

  @UpdateCampaign
  Scenario: Update an already created Case
    Given I build a "PATCH" request
    When I set update campaign "CAMPAIGN_ID"  with "campaignId" request
    Then Status response of request should be updated "NO_CONTENT"

  @UpdatePriceBook
  Scenario: Update an already created Case
    Given I build a "PATCH" request
    When I set update pricebook "PRICE_BOOK_ID"  with "priceId" request
    Then Status response of request should be updated "NO_CONTENT"


