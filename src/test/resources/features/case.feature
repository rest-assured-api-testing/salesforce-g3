Feature: Scenario test for Case feature
  Tests Scenarios for Case

  @ShowAllCases
  Scenario: Get all Cases
    Given I build "GET" request
    When I execute "CASE" request
    Then Response status should be "OK"

  @DeleteCase
  Scenario: Created response of new Case body should match schema response
    Given I build "POST" request
    When I execute create "CASE" request
      | status | new |
    Then Response body status request should be "CREATED"
    And "response" schema status should be "CREATED"

  @UseCreatedCase
  Scenario: Get a specific Case with id
    Given I build "GET" request
    When I execute "CASE_ID" request with param
    Then Response status should be "OK"
    And "case" schema status should be "OK"

  @CantShowACaseWithWrongId
  Scenario Outline: Can't get a case with wrong or empty id
    Given I build "GET" request
    When I execute "CASE_ID" with <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                    |
      | " "                   |
      | " 929300Xcbnd#$!#$"   |
      | "929300Xcbnd#$!#$"    |

  @DeleteCase
  Scenario Outline: A Case can be created with status parameter only
    Given I build "POST" request
    When I execute create "CASE" request
      | status | <status> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | status              |
      | New                 |
      | Working             |
      | text and 93843      |
      | text and #$87¡!     |
      | ""                  |
      | "  "                |
      | "  _"               |
      |                     |

  @DeleteCase
  Scenario Outline: A Case can be created with status and case origin
    Given I build "POST" request
    When I execute create "CASE" request
      | status | <status> |
      | Origin  | <origin> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | status                | origin      |
      | New                   | Phone       |
      | Working               | email       |
      | text and 93843        | Web         |
      | text and #$87¡!       | text        |
      | ""                    | 93985       |
      | "  "                  | origin#45$  |
      | "  _"                 | " "         |
      | "  _"                 | ""          |

  @UseCreatedCase
  Scenario Outline: Case can be updated only with status
    Given I build "PATCH" request
    When I execute update "CASE_ID" request
      | status | <status> |
    Then Response status should be "NO_CONTENT"
    Examples:
      | status              |
      | New                 |
      | Working             |
      | text and 93843      |
      | text and #$87¡!     |
      | ""                  |
      | "  "                |
      | "  _"               |
      |                     |

  @UseCreatedCase
  Scenario Outline: Case can be updated with status and origin
    Given I build "PATCH" request
    When I execute update "CASE_ID" request
      | status      | <status>      |
      | origin      | <origin>      |
    Then Response status should be "NO_CONTENT"
    Examples:
      | status                | origin      |
      | New                   | Phone       |
      | Working               | email       |
      | text and 93843        | Web         |
      | text and #$87¡!       | text        |
      | ""                    | 93985       |
      | "  "                  | origin#45$  |
      | "  _"                 | " "         |
      | "  _"                 | ""          |
      |                       |             |

  @CantUpdateACaseWithWrongId
  Scenario Outline: Case can't be updated with wrong or empty id
    Given I build "PATCH" request
    When I execute update "CASE_ID" request with specific <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                      |
      | "Mv234498cvXvmsj435"    |
      | " Mv23498cvXvmsj435"    |

  @CreateCase
  Scenario: A created case can be deleted with correct Id
    Given I build "DELETE" request
    When I execute "CASE_ID" request with param
    Then Response status should be "NO_CONTENT"

  @CantDeleteCaseWithWrongId
  Scenario Outline: Case can't be deleted with wrong or empty id
    Given I build "DELETE" request
    When I execute "CASE_ID" with <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                    |
      | " Mv234498cvXvmsj435" |
      | "Mv234498cvXvmsj435"  |
      | " "                   |
