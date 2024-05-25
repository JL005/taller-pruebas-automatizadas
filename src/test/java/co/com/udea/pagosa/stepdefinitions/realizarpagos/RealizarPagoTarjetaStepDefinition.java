package co.com.udea.pagosa.stepdefinitions.realizarpagos;

import org.openqa.selenium.WebDriver;

import co.com.udea.pagosa.models.DetallesPagoTarjeta;
import co.com.udea.pagosa.tasks.AbrirNavegador;
import co.com.udea.pagosa.tasks.metodospago.SeleccionarMetodoPago;
import co.com.udea.pagosa.tasks.realizarpagos.LlenarFormularioPagoTarjeta;
import co.com.udea.pagosa.tasks.reservas.SeleccionarReserva;
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

public class RealizarPagoTarjetaStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    private final Actor usuario = Actor.named("Usuario");
    
    private final DetallesPagoTarjeta detallesPago = new DetallesPagoTarjeta("1234567890123456", "12/24", "123", "John Doe", "123456789");

    @Before
    public void setUp() {
        this.usuario.can(BrowseTheWeb.with(this.driver));
    }

    @Given("que soy un usuario que ha ingresado los datos de mi tarjeta")
    public void queSoyUnUsuarioQueHaIngresadoLosDatosDeMiTarjeta() {
        this.usuario.attemptsTo(AbrirNavegador.at(Constantes.URL),
                SeleccionarReserva.as("20-booking"),
                Click.on(CargarReserva.BOTON_SIGUIENTE), 
                SeleccionarMetodoPago.as("0-tarjeta"),
                Click.on(CargarReserva.BOTON_SIGUIENTE),
                LlenarFormularioPagoTarjeta.conInfo(detallesPago));
    }
    @When("intento realizar un pago con tarjeta")
    public void intentoRealizarUnPagoConTarjeta() {
        System.out.println("FALTA IMPLEMENTAR");
    }
    @Then("deberia recibir una confirmacion de que los datos son validos")
    public void deberiaRecibirUnaConfirmacionDeQueLosDatosSonValidos() {
        System.out.println("FALTA IMPLEMENTAR");
    }

    @And("proceder con el pago con tarjeta")
    public void procederConElPagoConTarjeta() {
        System.out.println("FALTA IMPLEMENTAR");
    }
}
