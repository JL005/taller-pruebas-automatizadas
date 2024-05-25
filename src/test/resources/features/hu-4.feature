Feature: Validacion automatica de datos con método de pago seleccionado

  Scenario: Validar datos automaticamente con tarjeta
    Given que soy un usuario que ha ingresado los datos de mi tarjeta
    When intento realizar un pago con tarjeta
    Then deberia proceder con el pago con tarjeta
    

  Scenario: Validar datos automaticamente con PayPal
    Given que soy un usuario que ha ingresado los datos correctos de mi cuenta de PayPal
    When intento realizar un pago con paypal
    Then deberia proceder a finalizar el pago con paypal

  Scenario: Validar datos automaticamente con datos invalidos en Paypal
    Given que soy un usuario que ha ingresado datos incorrectos de mi cuenta de PayPal
    When intento realizar un pago con mi cuenta de PayPal
    Then deberia recibir un mensaje indicando que los datos son invalidos


