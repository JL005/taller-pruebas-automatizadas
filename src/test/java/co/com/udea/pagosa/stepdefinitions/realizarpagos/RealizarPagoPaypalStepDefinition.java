package co.com.udea.pagosa.stepdefinitions.realizarpagos;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.models.DetallesCuentaPaypal;
import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.formulariopagos.VerificarSiElementoExiste;
import co.com.udea.pagosa.tasks.metodospago.SeleccionarMetodoPago;
import co.com.udea.pagosa.tasks.realizarpagos.LlenarFormularioPagoPaypal;
import co.com.udea.pagosa.tasks.reservas.SeleccionarReserva;
import co.com.udea.pagosa.userinterfaces.formularioPagos.FormularioPagoPaypal;
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

public class RealizarPagoPaypalStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");

    DetallesCuentaPaypal detallesCuenta = new DetallesCuentaPaypal("pepito@gmail.com", "123456");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
    }

    @Given("que soy un usuario que ha ingresado los datos correctos de mi cuenta de PayPal")
    public void queSoyUnUsuarioQueHaIngresadoLosDatosCorrectosDeMiCuentaDePayPal() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE), 
                SeleccionarMetodoPago.as("2-paypal"),
                Click.on(CargarReserva.BOTON_SIGUIENTE),
                LlenarFormularioPagoPaypal.conInfo(detallesCuenta)
                );
    }

    @When("intento realizar un pago con paypal")
    public void intentoRealizarUnPagoConPaypal() {
        this.usuario.attemptsTo(Click.on(FormularioPagoPaypal.BOTON_PAGO),
                VerificarSiElementoExiste.conCampos("payment-processing"));
    }

    @Then("deberia proceder a finalizar el pago con paypal")
    public void deberiaProcederAFinalizarElPagoConPaypal() throws InterruptedException {
        Thread.sleep(4000);
        this.usuario.attemptsTo(VerificarSiElementoExiste.conCampos("payment-success"));
        Thread.sleep(10000);
    }

}
