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
