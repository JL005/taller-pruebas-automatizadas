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
import co.com.udea.pagosa.tasks.formulariopagos.VerificarSiElementoExiste;

public class VerificarFormularioPaypalStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
    }

    @Given("que soy un cliente que esta realizando un pago con paypal")
    public void queSoyUnClienteQueEstaRealizandoUnPagoConPaypal() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
    }

    @When("llego al paso de ingresar los datos de la cuenta de paypal")
    public void llegoAlPasoDeIngresarLosDatosDeLaCuentaDePaypal() {
        this.usuario.attemptsTo(SeleccionarMetodoPago.as("2-paypal"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
    }

    @Then("deberia ver un formulario para ingresar los datos de usuario y contrasena de paypal")
    public void deberiaVerUnFormularioParaIngresarLosDatosDeUsuarioYContrasenaDePaypal() {
        this.usuario.attemptsTo(VerificarSiElementoExiste.conCampos("email", "password"));
    }

}
