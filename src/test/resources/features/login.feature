Feature: login
  Scenario Outline: Successfully Logged In
    Given I am already on Log in page
    When I input username "<username>"
    And I input password "<password>"
    And I click login button
    Then I redirected to inventory page
    Examples:
    |username|password|
    |standard_user|secret_sauce|
    |problem_user|secret_sauce|

