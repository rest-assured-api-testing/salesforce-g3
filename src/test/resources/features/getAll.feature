Feature: Request for get all feature
  All request for the endpoint case

  @ShowAllAccount
  Scenario: Get all Accounts
    Given I build "GET" request
    When I execute "ACCOUNT" request
    Then Status response of request should be added "OK"

  @ShowAllAccount
  Scenario: Get all Campaign
    Given I build "GET" request
    When I execute "CAMPAIGN" request
    Then Status response of request should be added "OK"

  @ShowAllAccount
  Scenario: Get all Cases
    Given I build "GET" request
    When I execute "CASES" request
    Then Status response of request should be added "OK"

  @ShowAllAccount
  Scenario: Get all Contact
    Given I build "GET" request
    When I execute "CONTACT" request
    Then Status response of request should be added "OK"

  @ShowAllAccount
  Scenario: Get all PriceBook
    Given I build "GET" request
    When I execute "PRICE_BOOK" request
    Then Status response of request should be added "OK"

  @ShowAllAccount
  Scenario: Get all Product
    Given I build "GET" request
    When I execute "PRODUCT2" request
    Then Status response of request should be added "OK"