Feature: SalesForces
  Test SalesForces methods

  @CreateAccount
  Scenario: Create Group
    Given I build "POST" request to create an account
    When I execute the request to create the account with the name "CucumberTest"
    Then the response status code should be account created "201"

  @CreateCampaign
  Scenario: Create a Campaign
    Given I build "POST" request request to create a Campaign
    When I execute the request to create the campaign with the name "CucumberTest"
    Then the response status code should be campaign created "201"

  @CreatePriceBook
  Scenario: Create a priceBook
    Given I build "POST" request request to create a pricebook
    When I execute the request to create the pricebook with the name "CucumberTest"
    Then the response status code should be pricebook created "201"

  @CreateProduct2
  Scenario: Create Product2
    Given I build "POST" request request to create a Product2
    When I execute the request to create the Product2 with the name "CucumberTest"
    Then the response status code should be Product2 created "201"

  @CreateContact
  Scenario: Create a Contact
    Given I build "POST" request request to create a Contact
    When I execute the request to create the Contact with the name "CucumberTest"
    Then the response status code should be Contact created "201"

  @CreateCase
  Scenario: Get a token
    Given I build "POST" request request to create a Case
    When I execute the request to create the Case with the name "CucumberTest"
    Then the response status code should be Case created "201"