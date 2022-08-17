Feature: Login

  Scenario Outline: As a user I can login with correct username and password
    Given The web "https://www.saucedemo.com" has been opened using Chrome
    When I input <username> and <password>
    Then I should see a page with header "PRODUCTS"
    And I quit the test
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario Outline: As a user I cannot login with locked out user
    Given The web "https://www.saucedemo.com" has been opened using Chrome
    When I input <username> and <password>
    Then I should see a toast with text "Epic sadface: Sorry, this user has been locked out."
    And I quit the test
    Examples:
      | username        | password     |
      | locked_out_user | secret_sauce |

  Scenario Outline: As a user I cannot login with incorrect username and password
    Given The web "https://www.saucedemo.com" has been opened using Chrome
    When I input <username> and <password>
    Then I should see a toast with text "Epic sadface: Username and password do not match any user in this service"
    And I quit the test
    Examples:
      | username      | password     |
      | standard_user | anything     |
      | new_user      | secret_sauce |