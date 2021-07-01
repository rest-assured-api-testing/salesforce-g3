Feature: Request for account feature
  All request for the endpoint case

  @ShowAllAccount
  Scenario: Get all Account
    Given I build "GET" request
    When I execute "ACCOUNT" request
    Then Response status should be "OK"

  @UseCreatedAccount
  Scenario: Validate Schema of A Account Obtained
    Given I build "GET" request
    When I execute "ACCOUNT_ID" request with param
    Then "account" schema status should be "OK"
    And  Response status should be "OK"

  @UseCreatedAccount
  Scenario: Get an Account
    Given I build "GET" request
    When I execute "ACCOUNT_ID" request with param
    Then Response status should be "OK"
    And "account" schema status should be "OK"


  @CantShowAccountWithWrongId
  Scenario Outline: Can't get an account with wrong id
    Given I build "GET" request
    When I execute "ACCOUNT_ID" with <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id              |
      | " "             |
      | " 98494xMwe"    |
      | "98494xMwe"     |

  @DeleteAccount
  Scenario Outline: An account can be created with name parameter only
    Given I build "POST" request
    When I execute create "ACCOUNT" request
      | name | <name> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name                    |
      | "account cucumber"      |
      | " "                     |
      | " account cucumber"     |
      | "@!"#%(=/%!"$!%")"      |
      | "numbers 8975893"       |

  @DeleteAccount
  Scenario Outline: Account can be create with name and phone,
  phone can have characters, numbers, letters
    Given I build "POST" request
    When I execute create "ACCOUNT" request
      | name  | <name>  |
      | phone | <phone> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name                    | phone                 |
      | "account cucumber"      | 7688987               |
      | "account cucumber"      | +591 798898768 BO     |
      | " "                     | " "                   |
      | " account cucumber"     | "phone with letters"  |
      | "@!"#%(=/%!"$!%")"      | "chars)&/$##%&%/"     |
      | "account cucumber"      |                       |

  @UseCreatedAccount
  Scenario Outline: An Account can be updated with one parameter
    Given I build "PATCH" request
    When I update "ACCOUNT_ID" request
      | name | <name> |
    Then Response status should be <status>
    Examples:
      | name                  | status        |
      | update with letters   | "NO_CONTENT"  |
      | update numbers 84758  | "NO_CONTENT"  |
      | update chars %/#%&%&  | "NO_CONTENT"  |
      | " "                   | "NO_CONTENT"  |
      |                       | "BAD_REQUEST" |

  @UseCreatedAccount
  Scenario Outline: An Account can be updated with more parameters
    Given I build "PATCH" request
    When I execute update "ACCOUNT_ID" request
      | name  | <name>  |
      | phone | <phone> |
    Then Response status should be "NO_CONTENT"
    Examples: Data with two parameters
      | name                      | phone             |
      | @!"#$%(=)%!"!%") updated  |                   |
      | account cucumber updated  | 123456789         |
      | account cucumber updated  | + 837 84737282848 |
      | account cucumber updated  | + 837 8473728 UR  |
      | account cucumber updated  | updated           |
      | account cucumber updated  | " "               |

  @UseCreatedAccount
  Scenario: Delete an Account
    Given I build "DELETE" request
    When I execute "ACCOUNT_ID" request with param
    Then Response status should be "NO_CONTENT"

  Scenario Outline: Delete an Account
    Given I build "DELETE" request
    When I execute "ACCOUNT_ID" with <wrongId>
    Then Response status should be "NOT_FOUND"
    Examples:
      | wrongId                |
      | "  "                   |
      | " 95849586cxMnd"       |
      | "95849586cxMnd"        |
