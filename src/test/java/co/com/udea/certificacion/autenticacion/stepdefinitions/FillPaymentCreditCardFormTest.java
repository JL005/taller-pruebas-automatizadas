/*
 * 
 
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
import co.com.udea.certificacion.autenticacion.models.PaymentDetails;
import co.com.udea.certificacion.autenticacion.tasks.FillPaymentForm;
import co.com.udea.certificacion.autenticacion.tasks.SelectPaymentMethod;

@RunWith(SerenityRunner.class)
public class FillPaymentCreditCardFormTest {

    @Managed
    WebDriver driver;

    private Actor user;
    

    @Before
    public void setUp() {
        user = Actor.named("User");
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void user_should_be_able_to_fill_payment_form() {
        PaymentDetails paymentDetails = new PaymentDetails("1234567890123456", "12/24", "123", "John Doe", "123456789");
        user.attemptsTo(
            OpenThePage.at(URL), // Ajusta la URL según tu aplicación
            SelectPaymentMethod.as("0-Tarjeta"), // Selecciona el método de pago antes de ir al formulario
            Click.on(PaymentFormPage.NEXT_BUTTON), // Hace clic en el botón que lleva al formulario
            FillPaymentForm.withDetails(paymentDetails) // Llena el formulario con los detalles del pago
        );
    }
}
*/