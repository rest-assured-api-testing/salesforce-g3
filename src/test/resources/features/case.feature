Feature: Request for case feature
  All request for the endpoint case

  @ShowCaseWithId
  Scenario: Get a Case
    Given I build "GET" request
    When I execute "CASES_ID" request
    Then Status response of request should be added "OK"
    
  @UpdateCaseWithId
  Scenario: Update a Case
    Given I build "PATCH" request
    When I set update body "CASES_ID" request
    Then Status response of request should be updated "NO_CONTENT"