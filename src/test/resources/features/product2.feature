Feature: Request for product2 feature
  All request for the endpoint case

  @ShowAllProduct2
  Scenario: Get all Product2
    Given I build "GET" request
    When I execute "PRODUCT2" request
    Then Status response of request should be "OK"

  @CreateDeleteProduct2
  Scenario: Get a Product2
    Given I build "GET" request
    When I execute for "PRODUCT2_ID" request with param
    Then Status response of request should be "OK"

  @DeleteProduct2
  Scenario: Create a Product2
    Given I build "POST" request
    When I execute for "PRODUCT2" request with params
      | name | product2 cucumber |
    Then Status response of request should be "CREATED"

  @CreateProduct2
  Scenario: Delete a Product2
    Given I build "DELETE" request
    When I execute for "PRODUCT2_ID" request with param
    Then Status response of request should be "NO_CONTENT"

  @CreateDeleteProduct2
  Scenario: Update a Product2
    Given I build "PATCH" request
    When I execute for "PRODUCT2_ID" request with updated name
      | name | product2 cucumber updated |
    Then Status response of request should be "UPDATED"

    #    CREATE
  @DeleteProduct2
  Scenario: Validate Schema of A Product2
    Given I build "POST" request
    When I execute for "PRODUCT2" request with params
      | name | product2 cucumber |
    Then "response" schema status response of request should be "CREATED"

  @DeleteProduct2
  Scenario: Response body to Success is true for A Product2
    Given I build "POST" request
    When I execute for "PRODUCT2" request with params
      | name | product2 cucumber |
    Then Response body status request should be "CREATED"

  @DeleteProduct2
  Scenario: Accept special characters A Product2
    Given I build "POST" request
    When I execute for "PRODUCT2" request with params
      | name | "@!"#$%(=)/)(/()/&&/%"$%!"$!%")" |
    Then Status response of request should be "CREATED"

  @DeleteProduct2
  Scenario: Create a Product2 with various params
    Given I build "POST" request
    When I execute for "PRODUCT2" request with params
      | name        | product2 cucumber           |
      | description | product created by cucumber |
    Then Status response of request should be "CREATED"

  @DeleteProduct2
  Scenario: Create a Product2 with attribute IsActive true
    Given I build "POST" request
    When I execute for "PRODUCT2" request with params
      | name     | product2 cucumber |
      | IsActive | true              |
    Then Status response of request should be "CREATED"

#    PATCH
  @CreateDeleteProduct2
  Scenario: Validate Schema of A Product2 Updated
    Given I build "PATCH" request
    When I execute for "PRODUCT2_ID" request with updated name
      | name | product2 cucumber updated |
    Then "response" schema status response of request should be "UPDATED"

  @CreateDeleteProduct2
  Scenario: Response body to Success is true for A Product2 Updated
    Given I build "PATCH" request
    When I execute for "PRODUCT2_ID" request with updated name
      | name | product2 cucumber updated |
    Then Response body status request should be "UPDATED"

  @CreateDeleteProduct2
  Scenario: Accept special characters A Product2 Updated
    Given I build "PATCH" request
    When I execute for "PRODUCT2_ID" request with updated name
      | name | "@!"#$%(=)/)(/()/&&/%"$%!"$!%") updated" |
    Then Status response of request should be "UPDATED"

    #BUG
  @CreateDeleteProduct2
  Scenario: Update a Product2 with various params
    Given I build "PATCH" request
    When I execute for "PRODUCT2_ID" request with updated name
      | name        | product2 cucumber updated   |
      | description | product updated by cucumber |
    Then Status response of request should be "UPDATED"

  @CreateDeleteProduct2
  Scenario: Update a Product2 with attribute IsActive to true
    Given I build "PATCH" request
    When I execute for "PRODUCT2_ID" request with updated name
      | name     | product2 cucumber updated |
      | IsActive | true                      |
    Then Status response of request should be "UPDATED"

#    GET
  @CreateDeleteProduct2
  Scenario: Validate Schema of A Product2 Obtained
    Given I build "GET" request
    When I execute for "PRODUCT2_ID" request with param
    Then "product2" schema status response of request should be "OK"

  @CreateDeleteProduct2
  Scenario: Response body is the same name for A Product2 Created
    Given I build "GET" request
    When I execute for "PRODUCT2_ID" request with param
    Then The product2 response body name of the attribute is the same as the wait and request must be "OK"

  @CreateDeleteProduct2
  Scenario: Attribute response body is kind product2 for A Product2 Created
    Given I build "GET" request
    When I execute for "PRODUCT2_ID" request with param
    Then The product2 response body kind of the attribute is the same as the wait and request must be "OK"