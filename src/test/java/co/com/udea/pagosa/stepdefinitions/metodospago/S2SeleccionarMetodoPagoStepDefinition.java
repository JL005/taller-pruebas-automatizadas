package co.com.udea.pagosa.stepdefinitions.metodospago;

import org.openqa.selenium.WebDriver;
import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.metodospago.ComprobarMetodoPago;
import co.com.udea.pagosa.tasks.metodospago.ContarMetodosPago;
import co.com.udea.pagosa.tasks.metodospago.SeleccionarMetodoPago;
import co.com.udea.pagosa.tasks.reservas.SeleccionarReserva;
import co.com.udea.pagosa.userinterfaces.metodospago.MetodosPago;
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

public class S2SeleccionarMetodoPagoStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
        setTheStage(new OnlineCast());
    }

    @Given("que soy un cliente que esta realizando una transaccion")
    public void queSoyUnClienteQueEstaRealizandoUnaTransaccion() throws InterruptedException {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
    }

    @And("tengo al menos dos opciones de metodos de pago disponibles")
    public void tengoAlMenosDosOpcionesDeMetodosDePagoDisponibles() throws InterruptedException {
        usuario.attemptsTo(
                Click.on(MetodosPago.LISTADO_METODOS_PAGO),
                ContarMetodosPago.dosOMas());
        Thread.sleep(4000);
    }

    @When("selecciono un metodo de pago")
    public void seleccionoUnMetodoDePago() throws InterruptedException {
        usuario.attemptsTo(
                AbrirNavegador.at(Constantes.URL + "/booking?bookingId=22"),
                SeleccionarMetodoPago.as("0-tarjeta"));
    }

    @Then("deberia ver la confirmacion de mi seleccion")
    public void deberiaVerLaConfirmacionDeMiSeleccion() throws InterruptedException {
        usuario.attemptsTo(
                ComprobarMetodoPago.conNombre("Tarjeta de cr\u00e9dito"));
        Thread.sleep(5000);
    }

}
