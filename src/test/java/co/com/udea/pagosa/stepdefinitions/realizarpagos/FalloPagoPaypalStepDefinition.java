package co.com.udea.pagosa.stepdefinitions.realizarpagos;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.models.DetallesCuentaPaypal;
import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.metodospago.SeleccionarMetodoPago;
import co.com.udea.pagosa.tasks.realizarpagos.LlenarFormularioPagoPaypal;
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

public class FalloPagoPaypalStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    DetallesCuentaPaypal detallesCuenta = new DetallesCuentaPaypal("pepito@gmail.com", "eoeoeoeoeoe");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
    }

    @Given("que soy un usuario que ha ingresado datos incorrectos de mi cuenta de PayPal")
    public void queSoyUnUsuarioQueHaIngresadoDatosIncorrectosDeMiCuentaDePayPal() {
        // Write code here that turns the phrase above into concrete actions
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE),
                SeleccionarMetodoPago.as("2-paypal"),
                Click.on(CargarReserva.BOTON_SIGUIENTE),
                LlenarFormularioPagoPaypal.conInfo(detallesCuenta));
    }

    @When("intento realizar un pago con mi cuenta de PayPal")
    public void intentoRealizarUnPagoConMiCuentaDePayPal() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("FALTA IMPLEMENTAR");
    }

    @Then("deberia recibir un mensaje indicando que los datos son invalidos")
    public void deberiaRecibirUnMensajeIndicandoQueLosDatosSonInvalidos() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("FALTA IMPLEMENTAR");
    }
}
