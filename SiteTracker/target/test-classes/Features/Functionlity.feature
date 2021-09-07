Feature: Update and verify the data under preview tab

  Scenario Outline: data in preview
    Given the application URL and browser
      | browser   |
      | <browser> |
    And Click on Tab "Component References
    When User search "datatable" in quickfind
    And user clicks on "datatable"
    And select "DataTable from inline edit" from the dropdown
    And Click on the run button
    And under the section "preview" update the values for all rows in colum 3
      | Label     | WebSite            | phoneNumber    | CloseAt | Balance |
      | LarryPage | https://google.com | (555)-755-6575 | Today   |  770.54 |
    Then Validate the data has been updated

    Examples: 
      | browser |
      | chrome  |

