package co.com.udea.pagosa.stepdefinitions.realizarpagos;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.models.DetallesPagoTarjeta;
import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.formulariopagos.VerificarSiElementoExiste;
import co.com.udea.pagosa.tasks.metodospago.SeleccionarMetodoPago;
import co.com.udea.pagosa.tasks.realizarpagos.LlenarFormularioPagoTarjeta;
import co.com.udea.pagosa.tasks.reservas.SeleccionarReserva;
import co.com.udea.pagosa.userinterfaces.formularioPagos.FormularioPagoTarjeta;
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

public class S1RealizarPagoTarjetaStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");
    
    private final DetallesPagoTarjeta detallesPago = new DetallesPagoTarjeta("378282246310005", "12/24", "123", "John Doe", "123456789");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
    }

    @Given("que soy un usuario que ha ingresado los datos de mi tarjeta")
    public void queSoyUnUsuarioQueHaIngresadoLosDatosDeMiTarjeta() throws InterruptedException {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE));
        Thread.sleep(2000);
        this.usuario.attemptsTo(SeleccionarMetodoPago.as("0-tarjeta"),
                Click.on(CargarReserva.BOTON_SIGUIENTE),
                LlenarFormularioPagoTarjeta.conInfo(detallesPago));
        Thread.sleep(2000);
    }

    @When("intento realizar un pago con tarjeta")
    public void intentoRealizarUnPagoConTarjeta() throws InterruptedException {
        this.usuario.attemptsTo(Click.on(FormularioPagoTarjeta.BOTON_PAGAR));
        Thread.sleep(2000);
    }

    @Then("deberia proceder con el pago con tarjeta")
    public void deberiaProcederConElPagoConTarjeta() throws InterruptedException {
        Thread.sleep(4000);
        this.usuario.attemptsTo(VerificarSiElementoExiste.conCampos("payment-success"));
        Thread.sleep(10000);
    }
}
