package co.com.udea.certificacion.autenticacion.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaypalFormPage {
    public static final Target USER_INPUT = Target.the("first name input")
            .located(By.id("email"));
    public static final Target PASSWORD_INPUT = Target.the("last name input")
            .located(By.id("password"));
    public static final Target NEXT_BUTTON = Target.the("next button")
            .located(By.id("continue-to-payment-button"));
    public static final Target PAYMENT_BUTTON = Target.the("login button")
            .located(By.id("paypal-payment-button"));
}
