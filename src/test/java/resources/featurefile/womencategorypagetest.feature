Feature: Verify page navigation and add products in the cart on the women page

  @smoke @regression
  Scenario: I should navigate to women category page successfully
    Given I am on Homepage
    And I click on 'WOMEN' tab
    And verify 'WOMEN' text on the page
    Then I should be able to navigate to women category page successfully

  @sanity @regression
  Scenario Outline: I should be able to add product to the cart successfully
    Given I am on Homepage
    And I click on 'WOMEN' tab
    And click on the product name "<product>"
    And change the quantity "<qty>"
    And select the size "<size>"
    And select the colour "<colour>"
    And click on add to cart button
    And verify the pop up message
    And click on x button to close the popup
    Then the products should be added to cart successfully
    Examples:
      | product                                | qty | size | colour |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |
