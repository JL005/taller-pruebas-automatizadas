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
import co.com.udea.certificacion.autenticacion.tasks.VerifyBookingInfoExists;

@RunWith(SerenityRunner.class)
public class VerifySpanIsNotEmptyTest {

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
    public void user_should_see_span_is_not_empty() {
        user.attemptsTo(
            OpenThePage.at(URL),
            VerifyBookingInfoExists.isNotEmpty()
        );
    }
}
 */