package co.com.udea.certificacion.autenticacion.stepdefinitions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import co.com.udea.certificacion.autenticacion.tasks.OpenThePage;
import co.com.udea.certificacion.autenticacion.tasks.VerifyBookingInfo;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class SelectBookingErrorTest {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor user = Actor.named("Usuario");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void hu_1_success_case() throws InterruptedException  {
        user.attemptsTo(
            OpenThePage.at("https://modulo-pagos-a.vercel.app/modulo-pagos-a/booking?bookingId=80")
            
        );
        Thread.sleep(5000);
        user.attemptsTo(
            VerifyBookingInfo.with("No booking found", "", "", "", false)
        );
    }

}
