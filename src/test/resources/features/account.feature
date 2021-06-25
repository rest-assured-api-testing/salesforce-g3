Feature: Request for account feature
  All request for the endpoint case

  @ShowAllAccount
  Scenario: Get all Accounts
    Given I build "GET" request
    When I execute "ACCOUNT" request
    Then Status response of request should be "SC_OK"

  @CreateDeleteAccount
  Scenario: Get a Account
    Given I build "GET" request
    When I execute for "ACCOUNT_ID" request
    Then Status response of request should be "SC_OK"

  @DeleteAccount
  Scenario: Create a Account
    Given I build "POST" request
    When I execute for "ACCOUNT" request with name "account cucumber"
    Then Status response of request should be created "SC_CREATED"

  @CreateAccount
  Scenario: Delete a Account
    Given I build "DELETE" request
    When I execute for "ACCOUNT_ID" request
    Then Status response of request should be like "SC_NO_CONTENT"

  @CreateDeleteAccount
  Scenario: Update a Account
    Given I build "PATCH" request
    When I execute for "ACCOUNT_ID" request with updated name "account cucumber updated"
    Then Status response of request should be created "SC_CREATED"