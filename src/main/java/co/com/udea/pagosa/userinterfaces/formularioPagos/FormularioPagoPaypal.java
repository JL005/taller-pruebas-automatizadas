package co.com.udea.pagosa.userinterfaces.formularioPagos;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPagoPaypal {
    public static final Target EMAIL_INPUT = Target.the("first name input")
            .located(By.id("email"));
    public static final Target PASSWORD_INPUT = Target.the("last name input")
            .located(By.id("password"));
    public static final Target BOTON_PAGO = Target.the("login button")
            .located(By.id("paypal-payment-button"));
}
