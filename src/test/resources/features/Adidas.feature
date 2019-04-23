# Login feature review the behavior in thie feature
Feature: Adidas Products

  Scenario Outline: Home page Adidas is displayed
    Given 'Adidas' page is loaded
    And select option 'Hombre' on 'Adidas' page
    And select on the column 'Tenis' suboption 'Futbol' on 'Adidas' page
    Then verify that title "<product title>" is in the list of 'Adidas' page
    And get first Price "<product title>" on list of 'Adidas' page
    And click "<product title>" on list of 'Adidas' page
    And select of talla on list "<size>" of the form product cart
    And click in 'aniadir al carrito' of the form product cart
    Then verify that 'cantidad' is the same that "<quantity>" on the 'cart modal'
    And click on 'Ver Carrito link' on the 'cart modal'
    Then verify that title product "<product title>" is displayed on 'cart show' page
    Then verify that price partial product is "<price partial product>" on 'cart show' page
    Then verify that price total product is "<price total product>" on 'cart show' page

    Examples:
      | product title               | size   | quantity    | price partial product | price total product |
      | CALZADO DE FÚTBOL X 18.3 TF | MX 9.5 | Cantidad: 1 | $1,329.00            | $1,428.00            |


#  Scenario: POSTMAN- GET using java-cucumber-restassure
#    Given GET "/headers" postman endpoint is configured
#    Then the status code should be 200
#
#  Scenario: POSTMAN- Pot using java-cucumber-restassure
#    Given POST "/post" postman endpoint is configured
#    Then the responde 'data' value is "diplomado testing"
#    And the status code should be 200