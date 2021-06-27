Feature: Scenario test for Case feature
  Tests Scenarios for Case

  @GetAllCases
  Scenario: Get all the Cases
    Given I build "GET" request
    When I execute "CASE" request
    Then Status response of request should be "OK"

  @UseCreatedCase
  Scenario: Get a specific case by Id
    Given I build "GET" request
    When I execute "CASE_ID" with correct request
    Then Status response of request should be "OK"

  @CantGetCaseWithCorrectIdButBlankSpaceBefore
  Scenario: Get a specific case with blank spaces before id
    Given I build "GET" request
    When I execute "CASE_ID" with wrong id " 5005e000000xr4MAAQ" request
    Then Status response of request should be "NOT_FOUND"

  @CantGetCaseWithWrongId
  Scenario: Can't get Case with wrong Id
    Given I build "GET" request
    When I execute "CASE_ID" with wrong id "9879987" request
    Then Status response of request should be "NOT_FOUND"

  @CantGetCaseWithEmptyId
  Scenario: Can't get Case with empty
    Given I build "GET" request
    When I execute "CASE_ID" with wrong id " " request
    Then Status response of request should be "NOT_FOUND"

  @UseDeleteCase
  Scenario: Case can be created with null data
    Given I build "POST" request
    When I execute create "CASE" request
      | status |  |
    Then Status response of request should be "CREATED"

  @UseDeleteCase
  Scenario: Case can be created with empty data
    Given I build "POST" request
    When I execute create "CASE" request
      | status | " " |
    Then Status response of request should be "CREATED"

  @UseDeleteCase
  Scenario: Case can be created with different letters and characters data
    Given I build "POST" request
    When I execute create "CASE" request
      | status | Some created %$ Status $% |
    Then Status response of request should be "CREATED"

  @UseDeleteCase
  Scenario: Case can be created with different letters and characters
  with blank spaces before data
    Given I build "POST" request
    When I execute create "CASE" request
      | status | "        Some created %$ Status $%" |
    Then Status response of request should be "CREATED"

  @UseCreatedCase
  Scenario: Case can be updated with null data
    Given I build "PATCH" request
    When I execute update "CASE_ID" request
      | status |  |
    Then Status response of request should be "NO_CONTENT"

  @UseCreatedCase
  Scenario: Case can be updated with empty data
    Given I build "PATCH" request
    When I execute update "CASE_ID" request
      | status | " " |
    Then Status response of request should be "NO_CONTENT"

  @UseCreatedCase
  Scenario: Case can be updated with different letters and characters data
    Given I build "PATCH" request
    When I execute update "CASE_ID" request
      | status | Some created %$ Status $% |
    Then Status response of request should be "NO_CONTENT"

  @UseCreatedCase
  Scenario: Case can be updated with different letters and characters
  with blank spaces before data
    Given I build "PATCH" request
    When I execute update "CASE_ID" request
      | status | "        Some created %$ Status $%" |
    Then Status response of request should be "NO_CONTENT"

  @CantUpdatedWithEmptyId
  Scenario: Case can't be updated with empty Id
    Given I build "PATCH" request
    When I execute update "CASE_ID" request with specific id " "
      | status | " " |
    Then Status response of request should be "NOT_FOUND"

  @CantUpdatedWithNullId
  Scenario: Case can't be updated with null Id
    Given I build "PATCH" request
    When I execute update "CASE_ID" request with specific id ""
      | status | " " |
    Then Status response of request should be "NOT_ALLOWED"

  @CantUpdatedWithWrongId
  Scenario: Case can't be updated with empty Id
    Given I build "PATCH" request
    When I execute update "CASE_ID" request with specific id "348934598"
      | status | " " |
    Then Status response of request should be "NOT_FOUND"

  @CantUpdatedWithCorrectIdWithBlankSpaceBefore
  Scenario: Case can't be updated with empty Id
    Given I build "PATCH" request
    When I execute update "CASE_ID" request with specific id "  5005e000000xr4MAAQ"
      | status | " " |
    Then Status response of request should be "NOT_FOUND"