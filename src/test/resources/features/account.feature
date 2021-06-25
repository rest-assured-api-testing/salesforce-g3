Feature: Request for account feature
  All request for the endpoint case

  @ShowAllAccount
  Scenario: Get all Accounts
    Given I build "GET" request
    When I execute "ACCOUNT" request
    Then Status response of request should be added "OK"
