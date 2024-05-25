Feature: Ingresar datos del metodo de pago

  Scenario: Verificar formulario de ingreso de datos del metodo de pago
    Given que soy un cliente que esta realizando un pago
    When llego al paso de ingresar los datos del metodo de pago
    Then deberia ver un formulario para ingresar los datos del metodo de pago

