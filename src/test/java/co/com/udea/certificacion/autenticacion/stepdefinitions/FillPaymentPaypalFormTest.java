package co.com.udea.certificacion.autenticacion.stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import co.com.udea.certificacion.autenticacion.interactions.OpenThePage;
import co.com.udea.certificacion.autenticacion.interactions.PaymentFormPage;
import co.com.udea.certificacion.autenticacion.interactions.PaypalFormPage;
import co.com.udea.certificacion.autenticacion.models.PaypalPaymentDetails;
import co.com.udea.certificacion.autenticacion.tasks.FillPaymentForm;
import co.com.udea.certificacion.autenticacion.tasks.FillPaypalPaymentForm;
import co.com.udea.certificacion.autenticacion.tasks.SelectPaymentMethod;

public class FillPaymentPaypalFormTest {

    @Managed
    WebDriver driver;

    private Actor user;
    private static final String URL = "http://localhost:3000/modulo-pagos-a";

    @Before
    public void setUp() {
        user = Actor.named("User");
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void user_should_be_able_to_fill_payment_form() throws InterruptedException {
        PaypalPaymentDetails paymentDetails = new PaypalPaymentDetails("pepito@gmail.com", "123456");        user.attemptsTo(
                OpenThePage.at(URL), // Ajusta la URL según tu aplicación
                SelectPaymentMethod.as("2-Paypal"), // Selecciona el método de pago antes de ir al formulario
                Click.on(PaypalFormPage.NEXT_BUTTON), // Hace clic en el botón que lleva al formulario
                FillPaypalPaymentForm.withDetails(paymentDetails), // Llena el formulario con los detalles del pago
                Click.on(PaypalFormPage.PAYMENT_BUTTON) // Hace clic en el botón que lleva al formulario
                
        );
        Thread.sleep(10000);
    }
}
