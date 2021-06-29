Feature: Scenario test for Contact feature
  Tests Scenarios for Contact

  @ShowAllContacts
  Scenario: Get all Contacts
    Given I build "GET" request
    When I execute "CONTACT" request
    Then Status response of request should be "OK"

  @DeleteContact
  Scenario: Validate Schema of a Contact
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | Ramirez Perez |
    Then "response" schema status response of request should be "CREATED"

  #@UseCreatedContact
  #Scenario: Validate Schema of specific Contact
  #  Given I build "GET" request
  #  When I execute "CONTACT_ID" request with param
  #  Then "contact" schema status response of request should be "OK"

  #@UseCreatedCampaign
  #Scenario: Response body is the same name for a created Case
  #  Given I build "GET" request
  #  When I execute "CAMPAIGN_ID" request with param
  #  Then The campaign response body name of the attribute is the same as the wait and request must be "OK"

  @DeleteContact
  Scenario: Response body to Success is true for a specific Contact
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | New contact created |
    Then Response body status request should be "CREATED"

  @UseCreatedContact

  Scenario: Get a specific Contact
    Given I build "GET" request
    When I execute "CONTACT_ID" request with param
    Then Status response of request should be "OK"

  @CantShowAContactWithWrongId
  Scenario Outline: Can't get a contact with wrong or empty id
    Given I build "GET" request
    When I execute "CONTACT_ID" with <id>
    Then Status response of request should be "NOT_FOUND"
    Examples:
      | id                    |
      | "   "                 |
      | " 9384Xcdn34fmxV34534"|
      | "9384Xcdn34fmxV34534" |

  @DeleteContact
  Scenario Outline: A Contact can be created with lastname parameter only
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname | <lastname> |
    Then Status response of request should be "CREATED"
    Examples:
      | lastname                  |
      | Ramírez Huaylla           |
      | Some lastname, text only  |
      | 1324$%¡!#4                |
      | ""                        |
      | "  "                      |
      | "  _"                     |

  @UseCreatedContact
  Scenario: Contact can't be created with null data
    Given I build "POST" request
    When I execute update "CONTACT_ID" request
      | lastname |  |
    Then Status response of request should be "NOT_ALLOWED"

  @DeleteContact
  Scenario Outline: A Contact can be created with default and personal salutation
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname      | <lastname>    |
      | salutation    | <salutation>  |
    Then Status response of request should be "CREATED"
    Examples:
      | lastname                | salutation|
      | Ortuño                  | Mr.       |
      | Ortuño                  | Ms.       |
      | Ortuño                  | Dr.       |
      | Ortuño                  | Greetings |
      | Ortuño                  | Welcome#32|
      | Ortuño                  | ""        |
      | Ortuño                  | " "       |

  @DeleteContact
  Scenario Outline: A Contact can be created with more parameters
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname    | <lastname>    |
      | email       | <email>       |
      | salutation  | <salutation>  |
    Then Status response of request should be "CREATED"
    Examples:
      | lastname                | email                   | salutation  |
      | Ramírez Peñaranda       | some.email@gmail.com    | Mr.         |
      | Ramírez Peñaranda       | $email%trash!%          | Mr.         |
      | Ramírez Peñaranda       |                         | Mr.         |
      | Ramírez Peñaranda       | " "                     | Mr.         |
      | Ramírez Peñaranda       | ""                      | Mr.         |

  @DeleteContact
  Scenario Outline: A Contact can be created with more parameters
    Given I build "POST" request
    When I execute create "CONTACT" request
      | lastname    | <lastname>    |
      | HomePhone   | <HomePhone>   |
      | salutation  | <salutation>  |
    Then Status response of request should be "CREATED"
    Examples:
      | lastname                | HomePhone               | salutation  |
      | Ramírez Peñaranda       | 463757382               | Mr.         |
      | Ramírez Peñaranda       | +46358 4948BO           | Mr.         |
      | Ramírez Peñaranda       |                         | Mr.         |
      | Ramírez Peñaranda       | " "                     | Mr.         |
      | Ramírez Peñaranda       | ""                      | Mr.         |

  @UseCreatedContact
  Scenario Outline: Contact can be updated only with lastname
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | lastname | <lastname> |
    Then Status response of request should be <status>
    Examples:
    Examples:
      | lastname        | status        |
      | Pérez Araneda   | "NO_CONTENT"  |
      | Marƒrens        | "NO_CONTENT"  |
      | #3 - Rogelio    | "NO_CONTENT"  |
      | ""              | "NO_CONTENT"  |
      | "  "            | "NO_CONTENT"  |
      | "  _"           | "NO_CONTENT"  |
      |                 | "BAD_REQUEST" |

  @UseCreatedContact
  Scenario Outline: Campaign can  be updated with more parameters
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request
      | homephone       | <homephone>      |
      | salutation      | <salutation>      |
    Then Status response of request should be "NO_CONTENT"
    Examples:
      | homephone       | salutation|
      | +46358 4948BO   | MR.       |
      | 463757382       | MS.       |
      |                 | Regards   |
      | " "             | Dr.       |
      | ""              | Dr.       |

  @CantUpdateAContactWithWrongId
  Scenario Outline: Campaign can't be updated with wrong or empty id
    Given I build "PATCH" request
    When I execute update "CONTACT_ID" request with specific <id>
    Then Status response of request should be "NOT_FOUND"
    Examples:
      | id                      |
      | "Mv234498cvXvmsj435"    |
      | " Mv23498cvXvmsj435"    |

  @CreateContact
  Scenario: Delete a Contact
    Given I build "DELETE" request
    When I execute "CONTACT_ID" request with param
    Then Status response of request should be "NO_CONTENT"

  @CantDeleteContactWithWrongId
  Scenario Outline: Delete a Contact
    Given I build "DELETE" request
    When I execute "CONTACT_ID" with <id>
    Then Status response of request should be "NOT_FOUND"
    Examples:
      | id                    |
      | " Mv234498cvXvmsj435" |
      | "Mv234498cvXvmsj435"  |

  #@UseCreatedCampaign
  #Scenario: Attribute response body is kind campaign for A campaign Created
  #  Given I build "GET" request
  #  When I execute "CAMPAIGN_ID" request with param
  #  Then The campaign response body kind of the attribute is the same as the wait and request must be "OK"
