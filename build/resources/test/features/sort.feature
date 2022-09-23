Feature: deleting item and continue shopping

  Scenario Outline: sorting item
    Given I already Logged in
    When I click filter by "<filter>"
    Then Product filtered by "<filter>"
    Examples:
    |filter|
    |Price (high to low)|
    |Name (Z to A)      |

  Scenario Outline: add to cart
    Given I already Logged in
    When I select item "<item>"
    And I click cart icon
    Then Show "<product>" on cart page
    Examples:
      |item|product|
      |add-to-cart-test.allthethings()-t-shirt-(red)|Test.allTheThings() T-Shirt (Red)|

  Scenario Outline: add to cart from product detail
    Given I already Logged in
    When I click on "<product>" tittle
    And I select item "<item>"
    And I click cart icon
    Then Show "<product>" on cart page
    Examples:
    |item|product|
    |add-to-cart-sauce-labs-backpack|Sauce Labs Backpack|

  Scenario: go to cart page
    Given I already Logged in
    When I click cart icon
    Then I redirected to chart page

  Scenario: delete item from cart
    Given I already Logged in
    And I already add 2 product to cart
    And I already on cart page
    When I click remove item
    Then Show 1 item on cart page

  Scenario: Continue shopping
    Given I already Logged in
    And I on cart page
    When I click Continue Shopping
    Then I redirected to inventory page

