Feature: Ingresar datos del metodo de pago

  Scenario: Verificar formulario de ingreso de datos del metodo de pago con tarjeta
    Given que soy un cliente que esta realizando un pago con tarjeta
    When llego al paso de ingresar los datos del metodo de pago
    Then deberia ver un formulario para ingresar los datos del metodo de pago


  Scenario: Verificar formulario de ingreso de datos del metodo de pago con Paypal
    Given que soy un cliente que esta realizando un pago con paypal
    When llego al paso de ingresar los datos de la cuenta de paypal
    Then deberia ver un formulario para ingresar los datos de usuario y contrasena de paypal