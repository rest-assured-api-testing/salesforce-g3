Feature: Request for contact feature
  All request for the endpoint contact

  @ShowContactWithId
  Scenario: Get a Contact
    Given I build a "GET" request
    When I execute for contact "CONTACT_ID" request
    Then Status response of request should be "OK"

  @UpdateCaseWithId
  Scenario: Update a Contact
    Given I build a "PATCH" request
    When I update body "CONTACT_ID" request
    Then Status response of request should be like "NO_CONTENT"