Feature: Request for Campaign feature

  @ShowAllCampaign
  Scenario: Get all Campaigns
    Given I build "GET" request
    When I execute "CAMPAIGN" request
    Then Response status should be "OK"

  @UseCreatedCampaign
  Scenario: Validate Schema of specific campaign
    Given I build "GET" request
    When I execute "CAMPAIGN_ID" request with param
    Then Response status should be "OK"
    And  "campaign" schema status should be "OK"


  @DeleteCampaign
  Scenario: Validate the schema and status of a new created campaign
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name | New campaign created |
    Then Response body status request should be "CREATED"
    And "response" schema status should be "CREATED"

  @UseCreatedCampaign
  Scenario: Get an specific Campaign
    Given I build "GET" request
    When I execute "CAMPAIGN_ID" request with param
    Then Response status should be "OK"
    And "campaign" schema status should be "OK"

  @CantShowACaseWithWrongId
  Scenario Outline: It is not possible to get a campaign with wrong or empty id
    Given I build "GET" request
    When I execute "CAMPAIGN_ID" with <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                  |
      | "   "               |
      | " VCB&/%$FV¨¨:sd24" |
      | "VCB&/%$FV¨¨:sd24"  |

  @DeleteCampaign
  Scenario Outline: A Campaign can be created with only the name parameter
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name | <name> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name                    |
      | Campaign text name      |
      | Campaign #45 - US +5938 |
      | ""                      |
      | "  "                    |
      | "  _"                   |

  @DeleteCampaign
  Scenario Outline: A Campaign can be created with active status
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name      | <name>   |
      | isactive  | <active> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name              | active |
      | New Campaign name | true   |
      | New Campaign name | false  |

  @DeleteCampaign
  Scenario Outline: A Campaign can be created with more than one parameters
    Given I build "POST" request
    When I execute create "CAMPAIGN" request
      | name          | <name> |
      | description   | <description> |
    Then Response status should be "CREATED"
    And "response" schema status should be "CREATED"
    Examples:
      | name                | description                         |
      | New Campaign name   | Some description                    |
      | New Campaign name   | Description of Campaigns 06/11/2021 |
      | New Campaign name   | Description #45 - 456400+23Csmdf    |
      | New Campaign name   | " " |
      | New Campaign name   | ""  |

  @UseCreatedCampaign
  Scenario Outline: Campaign can be updated only with name
    Given I build "PATCH" request
    When I execute update "CAMPAIGN_ID" request
      | name | <name> |
    Then Response status should be <status>
    Examples:
      | name                    | status        |
      | Parameter Campaign      | "NO_CONTENT"  |
      | Created campaign name   | "NO_CONTENT"  |
      | Updated name #4545*&/   | "NO_CONTENT"  |
      | ""                      | "NO_CONTENT"  |
      | "  "                    | "NO_CONTENT"  |
      | "  _"                   | "NO_CONTENT"  |

  @UseCreatedCampaign
  Scenario: Campaign can not be updated with null name
    Given I build "PATCH" request
    When I execute update "CAMPAIGN_ID" request
      | name |  |
    Then Response status should be "BAD_REQUEST"


  @UseCreatedCampaign
  Scenario Outline: Campaign state active can be updated
    Given I build "PATCH" request
    When I execute update "CAMPAIGN_ID" request
      | description     | <description> |
      | isactive        | <active>      |
    Then Response status should be "NO_CONTENT"
    Examples:
      | description     | active |
      | description  #1 | true   |
      | description  #2 | false  |

  @UseCreatedCampaign
  Scenario Outline: Campaign can  be updated with more parameters
    Given I build "PATCH" request
    When I execute update "CAMPAIGN_ID" request
      | description | <description> |
      | status      | <status>      |
    Then Response status should be "NO_CONTENT"
    Examples:
      | description     | status      |
      | description  #1 | Completed   |
      | description  #2 | Aborted     |
      | description  #1 | Random text |
      | description  #2 | State #45   |
      | description  #1 | " "         |
      | description  #2 |             |

  @CantUpdateACampaignWithWrongId
  Scenario Outline: Campaign can't be updated with wrong or empty id
    Given I build "PATCH" request
    When I execute update "CAMPAIGN_ID" request with specific <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                   |
      | "Mv234498cvXvmsj435" |
      | " Mv23498cvXvmsj435" |

  @CreateCampaign
  Scenario: Delete a Campaign
    Given I build "DELETE" request
    When I execute "CAMPAIGN_ID" request with param
    Then Response status should be "NO_CONTENT"

  @CantDeleteCaseWithWrongId
  Scenario Outline: Delete a Campaign with wrong id
    Given I build "DELETE" request
    When I execute "CAMPAIGN_ID" with <id>
    Then Response status should be "NOT_FOUND"
    Examples:
      | id                    |
      | " Mv234498cvXvmsj435" |
      | "Mv234498cvXvmsj435"  |
