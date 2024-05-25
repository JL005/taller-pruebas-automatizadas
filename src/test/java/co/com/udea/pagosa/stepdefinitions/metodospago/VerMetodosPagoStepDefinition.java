package co.com.udea.pagosa.stepdefinitions.metodospago;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.metodospago.ContarMetodosPago;
import co.com.udea.pagosa.tasks.reservas.SeleccionarReserva;
import co.com.udea.pagosa.userinterfaces.metodospago.MetodosPago;
import co.com.udea.pagosa.userinterfaces.reservas.CargarReserva;
import co.com.udea.pagosa.utils.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class VerMetodosPagoStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
        setTheStage(new OnlineCast());
    }

    @Given("que soy un cliente que esta realizando una transaccions")
    public void queSoyUnClienteQueEstaRealizandoUnaTransaccions() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
    }

    @When("llego al paso de seleccion de metodo de pago")
    public void llegoAlPasoDeSeleccionDeMetodoDePago() {
        usuario.attemptsTo(
                Click.on(MetodosPago.LISTADO_METODOS_PAGO));
    }

    @Then("deberia ver al menos dos opciones de metodos de pago disponibles")
    public void deberiaVerAlMenosDosOpcionesDeMetodosDePagoDisponibles() {
        usuario.attemptsTo(
                ContarMetodosPago.dosOMas());
    }
}
