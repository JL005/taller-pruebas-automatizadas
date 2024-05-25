Feature: Validacion automatica de datos con método de pago seleccionado

  Scenario: Validar datos automaticamente con tarjeta de credito
    Given que soy un usuario que ha ingresado los datos de mi tarjeta de credito
    When intento realizar un pago
    Then deberia recibir una confirmacion de que los datos son válidos
    And proceder con el pago

  Scenario: Validar datos automaticamente con tarjeta de debito
    Given que soy un usuario que ha ingresado los datos de mi tarjeta de debito
    When intento realizar un pago
    Then deberia recibir una confirmacion de que los datos son validos
    And proceder con el pago

  Scenario: Validar datos automaticamente con PayPal
    Given que soy un usuario que ha ingresado los datos de mi cuenta de PayPal
    When intento realizar un pago
    Then deberia recibir una confirmacion de que los datos son validos
    And proceder con el pago.

  Scenario: Validar datos automaticamente con datos invalidos en Paypal
    Given que soy un usuario que ha ingresado datos incorrectos
    When intento realizar un pago
    Then deberia recibir un mensaje indicando que los datos son invalidos


