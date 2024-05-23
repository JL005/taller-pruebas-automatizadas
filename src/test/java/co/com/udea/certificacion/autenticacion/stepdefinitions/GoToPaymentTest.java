
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

import co.com.udea.certificacion.autenticacion.tasks.OpenThePage;
import co.com.udea.certificacion.autenticacion.tasks.SelectBooking;
import co.com.udea.certificacion.autenticacion.tasks.SelectPaymentMethod;
import co.com.udea.certificacion.autenticacion.userinterfaces.GetBooking;
import co.com.udea.certificacion.autenticacion.userinterfaces.PaymentFormPage;
import co.com.udea.certificacion.autenticacion.utils.Constants;

@RunWith(SerenityRunner.class)
public class GoToPaymentTest {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor user = Actor.named("Usuario");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void user_should_be_able_to_select_payment_method() {
        user.attemptsTo(
            OpenThePage.at(Constants.URL),
            SelectBooking.as("11-booking"),
            Click.on(GetBooking.NEXT_BUTTON),
            SelectPaymentMethod.as("0-tarjeta"),
            Click.on(PaymentFormPage.NEXT_BUTTON)
        );
        user.attemptsTo(
            OpenThePage.at(Constants.URL),
            SelectBooking.as("11-booking"),
            Click.on(GetBooking.NEXT_BUTTON),
            SelectPaymentMethod.as("1-tarjeta"),
            Click.on(PaymentFormPage.NEXT_BUTTON)
        );
        user.attemptsTo(
            OpenThePage.at(Constants.URL),
            SelectBooking.as("11-booking"),
            Click.on(GetBooking.NEXT_BUTTON),
            SelectPaymentMethod.as("2-paypal"),
            Click.on(PaymentFormPage.NEXT_BUTTON)
        );
        
    }
}

