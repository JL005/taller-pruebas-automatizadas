Feature: Seleccion de multiples metodos de pago

  Scenario: Verificar disponibilidad de multiples metodos de pago
    Given que soy un cliente que esta realizando una transaccion
    When llego al paso de seleccion de metodo de pago
    Then deberia ver al menos dos opciones de metodos de pago disponibles

  Scenario: Seleccionar un metodo de pago
    Given que soy un cliente que esta realizando una transaccion
    And tengo al menos dos opciones de metodos de pago disponibles
    When selecciono un metodo de pago
    Then deberia ver la confirmacion de mi seleccion
