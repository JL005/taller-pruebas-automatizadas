package co.com.udea.certificacion.autenticacion.stepdefinitions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import co.com.udea.certificacion.autenticacion.tasks.OpenThePage;
import co.com.udea.certificacion.autenticacion.tasks.SelectBooking;
import co.com.udea.certificacion.autenticacion.tasks.VerifyBookingInfo;
import co.com.udea.certificacion.autenticacion.userinterfaces.GetBooking;
import co.com.udea.certificacion.autenticacion.utils.Constants;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class SelectBookingTest {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor user = Actor.named("Usuario");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void hu_1_success_case() {
        user.attemptsTo(
            OpenThePage.at(Constants.URL),
            SelectBooking.as("11-booking"),
            Click.on(GetBooking.NEXT_BUTTON),
            VerifyBookingInfo.with("12/5/2023", "$330,000", "$62,700", "$392,700",true)
        );
    }

}
