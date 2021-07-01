Feature: Request for PriceBook feature

  @ShowAllPriceBooks
  Scenario: Get all Price books
    Given I build "GET" request
    When I execute "PRICE_BOOK" request
    Then Response status should be "OK"

  @DeletePrice
  Scenario: Validate Schema of a Price book
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | Price name book |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"

  @DeletePrice
  Scenario: Response body to Success is true for an specific Price book
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | Price book name new |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"

  @UseCreatedPrice
  Scenario: Get an specific Price book
    Given I build "GET" request
    When I execute "PRICE_BOOK_ID" request with param
    Then Response status should be "OK"
    And "pricebook2" schema status should be "OK"

  @CantShowAPriceBookWithWrongId
  Scenario Outline: Can't get a price book with wrong or empty id
    Given I build "GET" request
    When I execute "PRICE_BOOK_ID" with <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                    |
      | "   "                 |
      | " 9384Xcdn34fmxV34534"|
      | "9384Xcdn34fmxV34534" |

  @DeletePrice
  Scenario Outline: A Price book can be created with only the name parameter
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | <name> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name                  |
      | PriceBook name        |
      | Price name, text only |
      | 1324$%¡!#4            |
      | ""                    |
      | "  "                  |
      | "  _"                 |

  @UseCreatedPrice
  Scenario: Price book can't be created with null data
    Given I build "POST" request
    When I execute update "PRICE_BOOK_ID" request
      | name |  |
    Then Response status should be "NOT_ALLOWED"

  @DeletePrice
  Scenario Outline: A Price book can be created with name and description
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name          | <name> |
      | description   | <description> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name       | description |
      | PriceBook1 | Some text descrip.          |
      | new Price  | Numbers, letters 345        |
      | (*&/%)     | Description number# 56- IED |
      | 24324324   | ""                          |
      | 24324324   | " "                         |
      | 24324324   |                             |

  @DeletePrice
  Scenario Outline: A Price book status can be set when create
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name     | <name>   |
      | isactive | <active> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name            | active |
      | Price book name | true   |
      | Price book name | false  |

  @UseCreatedPrice
  Scenario Outline: Price book can be updated only with name
    Given I build "PATCH" request
    When I execute update "PRICE_BOOK_ID" request
      | name | <name> |
    Then Response status should be <status>
    Examples:
      | name            | status        |
      | PriceStore      | "NO_CONTENT"  |
      | price update    | "NO_CONTENT"  |
      | pricebok#45 -56$| "NO_CONTENT" |
      | ""              | "NO_CONTENT"  |
      | "  "            | "NO_CONTENT"  |
      | "  _"           | "NO_CONTENT"  |
      |                 | "BAD_REQUEST" |

  @UseCreatedPrice
  Scenario: Campaign can not be updated with null name
    Given I build "PATCH" request
    When I execute update "PRICE_BOOK_ID" request
      | name |  |
    Then Response status should be "BAD_REQUEST"

  @UseCreatedPrice
  Scenario Outline: A Price book status can be updated
    Given I build "PATCH" request
    When I execute update "PRICE_BOOK_ID" request
      | name        | <name>    |
      | isactive    | <active>  |
    Then Response status should be "NO_CONTENT"
    Examples:
      | name            | active |
      | Price book name | true   |
      | Price book name | false  |

  @CantUpdateAPriceBookWithWrongId
  Scenario Outline: Price book can't be updated with wrong or empty id
    Given I build "PATCH" request
    When I execute update "PRICE_BOOK_ID" request with specific <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                   |
      | "Mv234498cvXvmsj435" |
      | " Mv23498cvXvmsj435" |

  @CreatePrice
  Scenario: Delete a Price book
    Given I build "DELETE" request
    When I execute "PRICE_BOOK_ID" request with param
    Then Response status should be "NO_CONTENT"

  @CantDeletePriceWithWrongId
  Scenario Outline: Delete a Price Book with wrong id
    Given I build "DELETE" request
    When I execute "PRICE_BOOK_ID" with <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                    |
      | " Mv234498cvXvmsj435" |
      | "Mv234498cvXvmsj435"  |
