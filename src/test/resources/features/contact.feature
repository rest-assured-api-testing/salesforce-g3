Feature: Scenario test for Contact feature
  Tests Scenarios for Contact

  @GetAllContacts
  Scenario: Get all the Contacts created
    Given I build "GET" request
    When I execute "CONTACT" request
    Then Status response of request should be "OK"

  @UseCreatedContact
  Scenario: Get a specific contact by Id
    Given I build "GET" request
    When I execute "CONTACT_ID" with correct request
    Then Status response of request should be "OK"

  @UseDeleteContact
  Scenario: Contact can be created with letters and characters
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | "#$%/ New lastname #$%/" |
    Then Status response of request should be "CREATED"

  @UseCreatedContact
  Scenario: Contact can be deleted
    Given I build "DELETE" request
    When I execute delete "CONTACT_ID" request
    Then Status response of request should be "NO_CONTENT"

  @CantGetContactWithCorrectIdButBlankSpaceBefore
  Scenario: Get a specific contact with blank spaces before id
    Given I build "GET" request
    When I execute "CONTACT_ID" with wrong id " 5005e000000xr4MAAQ" request
    Then Status response of request should be "NOT_FOUND"

  @CantGetContactWithWrongId
  Scenario: Can't get Contact with wrong Id
    Given I build "GET" request
    When I execute "CONTACT_ID" with wrong id "9879987" request
    Then Status response of request should be "NOT_FOUND"

  @CantGetContactWithEmptyId
  Scenario: Can't get Contact with empty id
    Given I build "GET" request
    When I execute "CONTACT_ID" with wrong id " " request
    Then Status response of request should be "NOT_FOUND"

  @UseCreatedContact
  Scenario: Contact can't be created with null data
    Given I build "POST" request
    When I execute update "CONTACT_ID" request
      | lastname |  |
    Then Status response of request should be "NOT_ALLOWED"

  @UseDeleteContact
  Scenario: Contact can be created with empty data
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | " " |
    Then Status response of request should be "CREATED"


  @UseDeleteContact
  Scenario: Contact can be created with different letters and characters data
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | Some created %$ lastname $% |
    Then Status response of request should be "CREATED"

  @UseDeleteContact
  Scenario: Contact can be created with different letters and characters
  with blank spaces before data
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | "        Some created %$ Status $%" |
    Then Status response of request should be "CREATED"

  @UseCreatedContact
  Scenario: Contact can't be updated with null data
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | lastname |  |
    Then Status response of request should be "BAD_REQUEST"

  @UseCreatedContact
  Scenario: Contact can be updated with empty data
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | lastname | " " |
    Then Status response of request should be "NO_CONTENT"

  @UseCreatedContact
  Scenario: Contact can be updated with different letters and characters data
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | lastname | Some created %$ Status $% |
    Then Status response of request should be "NO_CONTENT"

  @UseCreatedContact
  Scenario: Contact can be updated with different letters and characters
  with blank spaces before data
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | lastname | "        Some created %$ lastname $%" |
    Then Status response of request should be "NO_CONTENT"

  @CantUpdatedWithEmptyId
  Scenario: Contact can't be updated with empty Id
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request with specific id " "
      | lastname | " " |
    Then Status response of request should be "NOT_FOUND"

  @CantUpdatedWithNullId
  Scenario: Contact can't be updated with null Id
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request with specific id ""
      | lastname | " " |
    Then Status response of request should be "NOT_ALLOWED"

  @CantUpdatedWithWrongId
  Scenario: Contact can't be updated with empty Id
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request with specific id "348934598"
      | lastname | " " |
    Then Status response of request should be "NOT_FOUND"

  @CantUpdatedWithCorrectIdWithBlankSpaceBefore
  Scenario: Contact can't be updated with empty Id
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request with specific id "  5005e000000xr4MAAQ"
      | lastname | " " |
    Then Status response of request should be "NOT_FOUND"