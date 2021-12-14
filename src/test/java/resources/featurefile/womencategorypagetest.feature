Feature: I should navigate and add products on the women page

  @smoke
  Scenario Outline: I should add product to the cart successfully
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
