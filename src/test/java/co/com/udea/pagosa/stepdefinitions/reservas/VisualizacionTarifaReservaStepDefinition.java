package co.com.udea.pagosa.stepdefinitions.reservas;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.reservas.SeleccionarReserva;
import co.com.udea.pagosa.tasks.reservas.VerificarFechaReservaPrecioSinImpuestos;
import co.com.udea.pagosa.tasks.reservas.VerificarImpuestosPrecioTotal;
import co.com.udea.pagosa.userinterfaces.reservas.CargarReserva;
import co.com.udea.pagosa.utils.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class VisualizacionTarifaReservaStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
        usuario.can(BrowseTheWeb.with(this.driver));
    }

    @Given("que soy un cliente que ha realizado unas reservas")
    public void queSoyUnClienteQueHaRealizadoUnasReservas() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL));
    }

    @When("accedo a la seccion de detalles de la reserva")
    public void accedoALaSeccionDeDetallesDeLaReserva() {
        this.usuario.attemptsTo(
                SeleccionarReserva.as("10-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
    }

    @Then("deberia ver la tarifa de la reserva")
    public void deberiaVerLaTarifaDeLaReserva() {
        this.usuario.attemptsTo(
                VerificarFechaReservaPrecioSinImpuestos.con("12/5/2023", "$330,000"));
    }

    @And("deberia ver los impuestos aplicados")
    public void deberiaVerLosImpuestosAplicados() {
        this.usuario.attemptsTo(
                VerificarImpuestosPrecioTotal.con("$392,700","$62,700"));

    }

}
