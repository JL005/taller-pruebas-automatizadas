package co.com.udea.pagosa.stepdefinitions.formulariospagos;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.metodospago.SeleccionarMetodoPago;
import co.com.udea.pagosa.tasks.reservas.SeleccionarReserva;
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
import co.com.udea.pagosa.tasks.formulariopagos.VerificarFormularioTarjetaExiste;

public class VerificarFormularioTarjetaStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
    }

    @Given("que soy un cliente que esta realizando un pago")
    public void queSoyUnClienteQueEstaRealizandoUnPago() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
    }

    @When("llego al paso de ingresar los datos del metodo de pago")
    public void llegoAlPasoDeIngresarLosDatosDelMetodoDePago() {
        this.usuario.attemptsTo(SeleccionarMetodoPago.as("0-tarjeta"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
    }

    @Then("deberia ver un formulario para ingresar los datos del metodo de pago")
    public void deberiaVerUnFormularioParaIngresarLosDatosDelMetodoDePago() {
        this.usuario.attemptsTo(VerificarFormularioTarjetaExiste.conCampos("debitcard", "date", "ccv", "name", "id"));
    }
}
