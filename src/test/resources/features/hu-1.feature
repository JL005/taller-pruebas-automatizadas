Feature: Ver detalles de reserva antes de finalizar la transaccion

  Scenario: Verificar visualizacion de tarifa e impuestos de la reserva
    Given que soy un cliente que ha realizado una reserva
    When accedo a la seccion de detalles de la reserva
    Then deberia ver la tarifa de la reserva
    And deberia ver los impuestos aplicados

  Scenario: Verificar la no visualizacion de tarifa e impuestos de la reserva
    Given que soy un cliente que ha realizado una reserva
    When accedo a la sección de detalles de una reserva que no existe o no es mia
    Then deberia ver un mensaje que me confirme que no se encontraron datos
