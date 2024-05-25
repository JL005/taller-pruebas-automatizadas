package co.com.udea.pagosa.stepdefinitions.reservas;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.reservas.VerificarMensajeReservaNoEncontrada;
import co.com.udea.pagosa.utils.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class VisualizacionErrorTarifaReservaStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
        setTheStage(new OnlineCast());
    }

    @Given("que soy un cliente que ha realizado una reserva")
    public void queSoyUnClienteQueHaRealizadoUnaReserva() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL));
    }

    @When("accedo a la seccion de detalles de una reserva que no existe o no es mia")
    public void accedoALaSeccionDeDetallesDeUnaReservaQueNoExisteONoEsMia() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL + "/booking?bookingId=80"));
    }

    @Then("deberia ver un mensaje que me confirme que no se encontraron datos")
    public void deberiaVerUnMensajeQueMeConfirmeQueNoSeEncontraronDatos() {
        this.usuario.attemptsTo(
                VerificarMensajeReservaNoEncontrada.existe());
    }
}
