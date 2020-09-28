Feature: Scenario Outline

	@Sanity
  Scenario Outline: Login functionality for a social networking site.
    Given the user navigates to Facebook
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful

    Examples: 
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |
