Feature: Ver detalles de reserva antes de finalizar la transacción

  Scenario: Verificar visualización de tarifa e impuestos de la reserva
	  Given que soy un cliente que ha realizado una reserva
	  When accedo a la sección de detalles de la reserva
	  Then debería ver la tarifa de la reserva
  	And debería ver los impuestos aplicados

  Scenario: Verificar la no visualización de tarifa e impuestos de la reserva
    Given que soy un cliente que ha realizado una reserva
    When accedo a la sección de detalles de una reserva que no existe o no es mía
    Then debería ver un mensaje que me confirme que no se encontraron datos.
