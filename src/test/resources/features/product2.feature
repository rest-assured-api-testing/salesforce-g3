Feature: Request for product2 feature
  All request for the endpoint case

  @ShowAllProduct2
  Scenario: Get all Product2
    Given I build "GET" request
    When I execute "PRODUCT2" request
    Then Status response of request should be "OK"

  @UseCreatedProduct2
  Scenario: Validate Schema of A Product2 Updated
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | name | product2 cucumber updated |
    Then "response" schema status response of request should be "CREATED"

  @UseCreatedProduct2
  Scenario: Validate Schema of A Product2 Obtained
    Given I build "GET" request
    When I execute "PRODUCT2_ID" request with param
    Then "product2" schema status response of request should be "OK"

  @UseCreatedProduct2
  Scenario: Response body is the same name for A Product2 Created
    Given I build "GET" request
    When I execute "PRODUCT2_ID" request with param
    Then The product2 response body name of the attribute is the same as the wait and request must be "OK"

  @DeleteProduct2
  Scenario: Response body to Success is true for A Product2
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | name | product2 cucumber |
    Then Response body status request should be "CREATED"

  @UseCreatedProduct2
  Scenario: Get a Product2
    Given I build "GET" request
    When I execute "PRODUCT2_ID" request with param
    Then Status response of request should be "OK"

  @CantShowAccountWithWrongId
  Scenario Outline: Can't get an account with wrong id
    Given I build "GET" request
    When I execute "PRODUCT2_ID" with <id>
    Then Status response of request should be "NOT_FOUND"
    Examples:
      | id                    |
      | " "                   |
      | " 123xVmf#$dfdw234"   |
      | "123xVmf#$dfdw234"     |

  @DeleteProduct2
  Scenario Outline: A Product2 can be created with name parameter only
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | name | <name> |
    Then Status response of request should be "CREATED"
    Examples:
    | name                  |
    | Product #45 - BD      |
    | product2 cucumber     |
    | letters and 9897      |
    | chars %#$%/&&#%##     |
    | ""                    |
    | "  "                  |
    | "  _"                 |
    | " _Product35: Tests"  |
    | " _Testing a  v e r y  l o n g  n a m e  f o r  a  p r o d u c t  t o  s e e  l i m i t   o r  t o  s e e  i f  h a s  c h a r  l i m i t  ."  |

  @DeleteProduct2
  Scenario Outline: A Product2 can be created and set as active or not
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | name     | <name>       |
      | IsActive | <active>     |
    Then Status response of request should be "CREATED"
    Examples:
    | name                  | active          |
    | Some product name:45  | true            |
    | Some product name:45  | false           |

  @DeleteProduct2
  Scenario Outline: A Product2 can be created with more parameters
    Given I build "POST" request
    When I execute create "PRODUCT2" request
      | name        | <name>       |
      | ProductCode | <code>     |
    Then Status response of request should be "CREATED"
    Examples:
      | name                  | code           |
      | Product #3: Cucumber  | Code +456BO/SN |
      | Product #3: Cucumber  | 94385784583    |
      | Product #3: Cucumber  |                |
      | Product #3: Cucumber  | " "            |
      | Product #3: Cucumber  | "S/N"          |

  @UseCreatedProduct2
  Scenario Outline: Only name of a Product2 can be updated
    Given I build "PATCH" request
    When I execute update "PRODUCT2_ID" request
      | name | <name> |
    Then Status response of request should be "NO_CONTENT"
    Examples:
    | name                      |
    | only letters              |
    | letters and 847584        |
    | chars $%/456#$%&*¿?"      |
    | " "                       |

  @UseCreatedProduct2
  Scenario Outline: Product2 can be updated with more parameters
    Given I build "PATCH" request
    When I execute update "PRODUCT2_ID" request
      | name        | <name>        |
      | description | <description> |
    Then Status response of request should be "NO_CONTENT"
    Examples:
    | name                  | description                               |
    | ProductName updated   | Description with letters and 847383/%#$%  |
    | ProductName updated   | Updated description                       |
    | ProductName updated   |                                           |
    | ProductName updated   | "  "                                      |

  @UseCreatedProduct2
  Scenario Outline: A Product2 active state can be udpdated
    Given I build "PATCH" request
    When I execute update "PRODUCT2_ID" request
      | name     | <name>       |
      | IsActive | <active>     |
    Then Status response of request should be "NO_CONTENT"
    Examples:
      | name                  | active  |
      | ProductName updated   | true    |
      | ProductName updated   | false   |

  @CantUpdateProductWrongId
  Scenario Outline: Product2 can' be updated with wrong Id
    Given I build "PATCH" request
    When I execute update "PRODUCT2_ID" request with specific <id>
    Then Status response of request should be "NOT_FOUND"
    Examples:
      | id                      |
      | "94548498cvXvmsj435"    |
      | " 94548498cvXvmsj435"   |

  @CreateProduct2
  Scenario: Delete an Account
    Given I build "DELETE" request
    When I execute "PRODUCT2_ID" request with param
    Then Status response of request should be "NO_CONTENT"

  @CreateProduct2
  Scenario Outline: Delete an Account
    Given I build "DELETE" request
    When I execute "PRODUCT2_ID" with <id>
    Then Status response of request should be "NOT_FOUND"
    Examples:
      | id                    |
      | " 94548498cvXvmsj435" |
      | "94548498cvXvmsj435"  |

  @UseCreatedProduct2
  Scenario: Attribute response body is kind product2 for A Product2 Created
    Given I build "GET" request
    When I execute "PRODUCT2_ID" request with param
    Then The product2 response body kind of the attribute is the same as the wait and request must be "OK"
