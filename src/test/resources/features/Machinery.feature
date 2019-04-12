Feature: Funcionalidad de Maquinarias

  Scenario: Mostrar maquinarias de una categoria
    Given 'Tienda Online' page is loaded
    And click 'ver Lista' in 'card'

  Scenario Outline: Anadir maquinaria a una categoria
    Given 'Tienda Online' page is loaded
    And click 'ver Lista' in 'card'
    And click 'anadir Maquinaria' in 'category list'
    And fill 'datos de Maquinaria' in 'form'
    Then Verify que "<Marca Maquinaria>" se liste en un card de 'category'

    Examples:
      | Marca Maquinaria |
      | Test |

  Scenario: Eliminar una maquinaria de una categoria
    Given 'Tienda Online' page is loaded
    And click 'ver Lista' in 'card'
    And click 'eliminar Maquinaria' in 'list'