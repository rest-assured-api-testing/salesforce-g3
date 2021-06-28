Feature: Request for PriceBook feature

  @CreateAPriceBook
  Scenario: Create a priceBook
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | Created PriceBook |
    Then Status response of request should be "CREATED"

  @CreateAPriceBook
  Scenario: Create a priceBook with one character
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | A |
    Then Status response of request should be "CREATED"

  @CreateAPriceBook
  Scenario: Create a priceBook with special characters
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | name | "@!"#$%(=)/)(/()/&&/%"$%!"$!%")" |
    Then Status response of request should be "CREATED"

  @CreateAPriceBook
  Scenario: Create a priceBook with mora than one parameters
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request
      | Name | Parameter PriceBook|
      | Description | PriceBook Description |
    Then Status response of request should be "CREATED"

  #CreateAPriceBook
  Scenario: Create a priceBook with invalid body
    Given I build "POST" request
    When I execute create "PRICE_BOOK" request with invalid values
      | nombre | Created PriceBook |
    Then Status response of request should be "BAD_REQUEST"

  #CreateAPriceBook
  Scenario: Create a priceBook with invalid endpoint
    Given I build "POST" request
    When I execute create "INVALID_PRICE_BOOK" request with invalid values
      | name | Created PriceBook |
    Then Status response of request should be "NOT_FOUND"

  @DeleteAPriceBook
  Scenario: Delete a priceBook
    Given I build "DELETE" request
    When I execute delete "PRICE_BOOK_ID" request
    Then Status response of request should be "NO_CONTENT"

  #DeleteAPriceBook
  Scenario: Delete a priceBook with invalid ID
    Given I build "DELETE" request
    When I execute delete "PRICE_BOOK_ID" with an "INVALID_PRICE_BOOK_ID" request
    Then Status response of request should be "NOT_FOUND"

  #DeleteAPriceBook
  Scenario: Delete a priceBook with invalid EndPoint and ID
    Given I build "DELETE" request
    When I execute delete "INVALID_PRICE_BOOK_ENDPOINT" with an "INVALID_PRICE_BOOK_ID" request
    Then Status response of request should be "NOT_FOUND"

  @UpdatePriceBook
  Scenario: Update an already created pricebook
    Given I build "PATCH" request
    When I execute patch "PRICE_BOOK_ID" request
      | name | Update PriceBook name |
    Then Status response of request should be "NO_CONTENT"

  @UpdatePriceBook
  Scenario: Update an already created with special Characters
    Given I build "PATCH" request
    When I execute patch "PRICE_BOOK_ID" request
      | name | "@!"#$%(=)/)(/()/&&/%"$%!"$!%")" |
    Then Status response of request should be "NO_CONTENT"

  @UpdatePriceBook
  Scenario: Update an already created with a single Characters
    Given I build "PATCH" request
    When I execute patch "PRICE_BOOK_ID" request
      | name | A |
    Then Status response of request should be "NO_CONTENT"

  @UpdatePriceBook
  Scenario: Update an already created pricebook with invalid body
    Given I build "PATCH" request
    When I execute patch "PRICE_BOOK_ID" request
      | nombre | Update PriceBook name |
    Then Status response of request should be "BAD_REQUEST"

  #UpdatePriceBook
  Scenario: Update an already created pricebook with invalid params
    Given I build "PATCH" request
    When I execute patch "INVALID_PRICE_BOOK_ENDPOINT" with an "INVALID_PRICE_BOOK_ID" request
      | name | Updated campaign name |
    Then Status response of request should be "NOT_FOUND"

  #UpdatePriceBook
  Scenario: Update an already created pricebook with invalid ID
    Given I build "PATCH" request
    When I execute patch "PRICE_BOOK_ID" with an "INVALID_PRICE_BOOK_ID" request
      | name | Updated campaign name |
    Then Status response of request should be "NOT_FOUND"

  @GetPriceBook
  Scenario: Validate Schema of a Campaign Obtained
    Given I build "GET" request
    When I execute for "PRICE_BOOK_ID" request with param to get a object info
    Then Status response of request should be "OK"

  #GetPriceBook
  Scenario: Get a Campaign with an invalid EndPoint and ID
    Given I build "GET" request
    When I execute get "INVALID_PRICE_BOOK_ENDPOINT" with an "INVALID_PRICE_BOOK_ID" request
    Then Status response of request should be "NOT_FOUND"

  #GetPriceBook
  Scenario: Get a Campaign with an invalid ID
    Given I build "GET" request
    When I execute get "PRICE_BOOK_ID" with an "INVALID_CAMPAIGN_ID" request
    Then Status response of request should be "NOT_FOUND"