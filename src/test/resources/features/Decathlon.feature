Feature: Open Decathlon Website, search for item, add to cart and validate order summary

  Background: Open website and close login popup if available
    Given User is on home page
    When User verifies if login popup is available and closes it

  @SmokeTest
  Scenario Outline: Order "<item>" item which is <orderFromTop> option from search suggestions and has "<size>" size
    When User searches for item "<item>"
    And User selects the <orderFromTop> option from top
    And User fetches the price of the product
    And User selects the "<size>" size
    And User clicks on Add to Cart button
    And User clicks on Go to Cart button
    Then User validates order summary with price and quantity that was selected
    And User clicks on Proceed to Checkout button
    And User verifies Login popup is present with title "LOGIN"

    Examples:
      | item           | orderFromTop | size |
      | boxing glove   | 1            | 4oz  |
      | mountain glove | 1            | 2XL  |