Feature: Request for Campaign feature

  @CreateACampaign
  Scenario: Create a Campaign
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name | Created campaign name |
    Then Status response of request should be "CREATED"

  @CreateACampaign
  Scenario: Create a Campaign with one character name
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name | A |
    Then Status response of request should be "CREATED"

  #CreateACampaign
  Scenario: Create a Campaign with invalid body
    Given I build "POST" request
    When I execute create "CAMPAIGN" request with invalid values
      | nombre | Created campaign name |
    Then Status response of request should be "BAD_REQUEST"

  #CreateACampaign
  Scenario: Create a Campaign with invalid EndPoint
    Given I build "POST" request
    When I execute create "INVALID_CAMPAIGN" request with invalid values
      | name | Created campaign name |
    Then Status response of request should be "NOT_FOUND"

  @DeleteACampaign
  Scenario: Delete a Campaign
    Given I build "DELETE" request
    When I execute delete "CAMPAIGN_ID" request
    Then Status response of request should be "NO_CONTENT"

  #DeleteACampaign
  Scenario: Delete a Campaign with an invalid ID
    Given I build "DELETE" request
    When I execute delete "CAMPAIGN_ID" with an "INVALID_CAMPAIGN_ID" request
    Then Status response of request should be "NOT_FOUND"

  #DeleteACampaign
  Scenario: Delete a Campaign with an invalid EndPoint and ID
    Given I build "DELETE" request
    When I execute delete "INVALID_CAMPAIGN_ENDPOINT" with an "INVALID_CAMPAIGN_ID" request
    Then Status response of request should be "NOT_FOUND"

  @UpdateCampaign
  Scenario: Update an already created Campaign
    Given I build "PATCH" request
    When I execute patch "CAMPAIGN_ID" request
      | name | Updated campaign name |
    Then Status response of request should be "NO_CONTENT"

  @UpdateCampaign
  Scenario: Update an already created Campaign with invalid body
    Given I build "PATCH" request
    When I execute patch "CAMPAIGN_ID" request
      | nombre | Updated campaign name |
    Then Status response of request should be "BAD_REQUEST"

  @GetCampaign
  Scenario: Validate Schema of a Campaign Obtained
    Given I build "GET" request
    When I execute for "CAMPAIGN_ID" request with param to get a object info
    Then Status response of request should be "OK"