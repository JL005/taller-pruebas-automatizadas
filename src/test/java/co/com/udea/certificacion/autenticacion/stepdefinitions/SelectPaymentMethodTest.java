/*
package co.com.udea.certificacion.autenticacion.stepdefinitions;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import co.com.udea.certificacion.autenticacion.interactions.OpenThePage;
import co.com.udea.certificacion.autenticacion.tasks.SelectPaymentMethod;

@RunWith(SerenityRunner.class)
public class SelectPaymentMethodTest {

    @Managed
    WebDriver driver;
    private static final String URL = "http://localhost:3000/modulo-pagos-a";
    private Actor user;

    @Before
    public void setUp() {
        user = Actor.named("User");
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void user_should_be_able_to_select_payment_method() {
        user.attemptsTo(
            OpenThePage.at(URL),
            SelectPaymentMethod.as("0-Tarjeta")
        );
        user.attemptsTo(
            SelectPaymentMethod.as("1-Tarjeta")
        );
        user.attemptsTo(
            SelectPaymentMethod.as("2-Paypal")
        );
        user.attemptsTo(
            SelectPaymentMethod.as("0-Tarjeta")
        );
    }
}

*/