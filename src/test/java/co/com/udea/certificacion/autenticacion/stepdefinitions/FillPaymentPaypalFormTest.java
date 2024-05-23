
package co.com.udea.certificacion.autenticacion.stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import co.com.udea.certificacion.autenticacion.models.PaypalPaymentDetails;
import co.com.udea.certificacion.autenticacion.tasks.FillPaypalPaymentForm;
import co.com.udea.certificacion.autenticacion.tasks.OpenThePage;
import co.com.udea.certificacion.autenticacion.tasks.SelectBooking;
import co.com.udea.certificacion.autenticacion.tasks.SelectPaymentMethod;
import co.com.udea.certificacion.autenticacion.userinterfaces.GetBooking;
import co.com.udea.certificacion.autenticacion.userinterfaces.PaypalFormPage;
import co.com.udea.certificacion.autenticacion.utils.Constants;

public class FillPaymentPaypalFormTest {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor user = Actor.named("Usuario");

    @Before
    public void init() {
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void user_should_be_able_to_fill_payment_form() throws InterruptedException {
        PaypalPaymentDetails paymentDetails = new PaypalPaymentDetails("pepito@gmail.com", "123456");
        user.attemptsTo(
                OpenThePage.at(Constants.URL),
                SelectBooking.as("25-booking"),
                Click.on(GetBooking.NEXT_BUTTON),
                SelectPaymentMethod.as("2-paypal"), 
                Click.on(PaypalFormPage.NEXT_BUTTON),
                FillPaypalPaymentForm.withDetails(paymentDetails),
                Click.on(PaypalFormPage.PAYMENT_BUTTON) 
        );
        Thread.sleep(5000);
    }
}

