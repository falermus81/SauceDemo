Feature: Checkout

  Scenario: As a user I can finish to checkout
    Given The web "https://www.saucedemo.com" has been opened using Chrome
    And I login using an account
    | username      | password     |
    | standard_user | secret_sauce |
    And I add an item "Sauce Labs Backpack" into the cart
    When I tap checkout button
    And In Info Page I input "Falery" and "Mustika" and "54321"
    And In Overview Page I confirm my order
    Then In Complete Page I quit the browser