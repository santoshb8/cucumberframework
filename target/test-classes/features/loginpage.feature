Feature: google search feature

  Scenario Outline: google search feature
    Given browser is open2
    And user is on saucelabs page
    When text in login creds with "<username>" and "<password>"
    And hits submit
    Then user is navigated with logincreds

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
