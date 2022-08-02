Feature: google search feature

  Scenario Outline: google search feature
     Given browser is open
    And user is on saucelabs pag
    When text in login creds with "<username>" and "<password>"
    And hits submit
    Then user is navigated with logincreds

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
