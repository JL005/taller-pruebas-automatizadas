package co.com.udea.pagosa.userinterfaces.formularioPagos;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPagoPaypal {
    public static final Target EMAIL_INPUT = Target.the("email input")
            .located(By.id("email"));
    public static final Target PASSWORD_INPUT = Target.the("password input")
            .located(By.id("password"));
    public static final Target BOTON_PAGO = Target.the("botón de pago")
            .located(By.id("paypal-payment-button"));
}
