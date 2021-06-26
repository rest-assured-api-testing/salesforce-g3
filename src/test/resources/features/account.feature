Feature: Request for account feature
  All request for the endpoint case

  @ShowAllAccount
  Scenario: Get all Account
    Given I build "GET" request
    When I execute "ACCOUNT" request
    Then Status response of request should be "OK"

  @CreateDeleteAccount
  Scenario: Get a Account
    Given I build "GET" request
    When I execute for "ACCOUNT_ID" request with param
    Then Status response of request should be "OK"

  @DeleteAccount
  Scenario: Create a Account
    Given I build "POST" request
    When I execute for "ACCOUNT" request with params
      | name | account cucumber |
    Then Status response of request should be "CREATED"

  @CreateAccount
  Scenario: Delete a Account
    Given I build "DELETE" request
    When I execute for "ACCOUNT_ID" request with param
    Then Status response of request should be "NO_CONTENT"

  @CreateDeleteAccount
  Scenario: Update a Account
    Given I build "PATCH" request
    When I execute for "ACCOUNT_ID" request with updated name
      | name | account cucumber updated |
    Then Status response of request should be "UPDATED"

#    CREATE
  @DeleteAccount
  Scenario: Validate Schema of A Account
    Given I build "POST" request
    When I execute for "ACCOUNT" request with params
      | name | account cucumber |
    Then "response" schema status response of request should be "CREATED"

  @DeleteAccount
  Scenario: Response body to Success is true for A Account
    Given I build "POST" request
    When I execute for "ACCOUNT" request with params
      | name | account cucumber |
    Then Response body status request should be "CREATED"

  @DeleteAccount
  Scenario: Accept special characters A Account
    Given I build "POST" request
    When I execute for "ACCOUNT" request with params
      | name | "@!"#$%(=)/)(/()/&&/%"$%!"$!%")" |
    Then Status response of request should be "CREATED"

  @DeleteAccount
  Scenario: Create a Account with various params
    Given I build "POST" request
    When I execute for "ACCOUNT" request with params
      | name  | account cucumber |
      | phone | 123456789        |
    Then Status response of request should be "CREATED"

  @DeleteAccount
  Scenario: Create a Account with letters in attribute phone
    Given I build "POST" request
    When I execute for "ACCOUNT" request with params
      | name  | account cucumber      |
      | phone | words and not numbers |
    Then Status response of request should be "CREATED"

#    PATCH
  @CreateDeleteAccount
  Scenario: Validate Schema of A Account Updated
    Given I build "PATCH" request
    When I execute for "ACCOUNT_ID" request with updated name
      | name | account cucumber updated |
    Then "response" schema status response of request should be "UPDATED"

  @CreateDeleteAccount
  Scenario: Response body to Success is true for A Account Updated
    Given I build "PATCH" request
    When I execute for "ACCOUNT_ID" request with updated name
      | name | account cucumber updated |
    Then Response body status request should be "UPDATED"

  @CreateDeleteAccount
  Scenario: Accept special characters A Account Updated
    Given I build "PATCH" request
    When I execute for "ACCOUNT_ID" request with updated name
      | name | "@!"#$%(=)/)(/()/&&/%"$%!"$!%") updated" |
    Then Status response of request should be "UPDATED"

  @CreateDeleteAccount
  Scenario: Update a Account with various params
    Given I build "PATCH" request
    When I execute for "ACCOUNT_ID" request with updated name
      | name  | account cucumber updated |
      | phone | 123456789                |
    Then Status response of request should be "UPDATED"

  @CreateDeleteAccount
  Scenario: Update a Account with letters in attribute phone
    Given I build "PATCH" request
    When I execute for "ACCOUNT_ID" request with updated name
      | name  | account cucumber updated |
      | phone | words and not numbers    |
    Then Status response of request should be "UPDATED"

#    GET
  @CreateDeleteAccount
  Scenario: Validate Schema of A Account Obtained
    Given I build "GET" request
    When I execute for "ACCOUNT_ID" request with param
    Then "account" schema status response of request should be "OK"

  @CreateDeleteAccount
  Scenario: Response body is the same name for A Account Created
    Given I build "GET" request
    When I execute for "ACCOUNT_ID" request with param
    Then The account response body name of the attribute is the same as the wait and request must be "OK"

  @CreateDeleteAccount
  Scenario: Attribute response body is kind account for A Account Created
    Given I build "GET" request
    When I execute for "ACCOUNT_ID" request with param
    Then The account response body kind of the attribute is the same as the wait and request must be "OK"