Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given : I navigate to the login page
    And : I enter the following for Login
      | username | password      |
      | admin    | adminpassword |

    And : I click the login button
    Then : I should see the userform page

  Scenario Outline: Login with correct username and password using outline
    Given : I navigate to the login page
    And : I enter <username> and <password>
    And : I click the login button
    Then : I should see the userform page
    Examples:
      | username | password  |
      | test     | executed  |
      | test2    | executed2 |







