Feature: Validación automática de datos con método de pago seleccionado

  Scenario: Validar datos automáticamente con tarjeta de crédito
    Given que soy un usuario que ha ingresado los datos de mi tarjeta de crédito
    Then debería recibir una confirmación de que los datos son válidos

  Scenario: Validar datos automáticamente con tarjeta de débito
    Given que soy un usuario que ha ingresado los datos de mi tarjeta de débito
    Then debería recibir una confirmación de que los datos son válidos

  Scenario: Validar datos automáticamente con PayPal
    Given que soy un usuario que ha ingresado los datos de mi cuenta de PayPal
    When intento realizar un pago
    Then debería recibir una confirmación de que los datos son válidos
    And proceder con el pago.

  Scenario: Validar datos automáticamente con datos inválidos en Paypal
    Given que soy un usuario que ha ingresado datos incorrectos
    When intento realizar un pago
    Then debería recibir un mensaje indicando que los datos son inválidos


