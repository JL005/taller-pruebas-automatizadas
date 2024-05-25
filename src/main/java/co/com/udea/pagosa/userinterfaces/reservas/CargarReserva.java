package co.com.udea.pagosa.userinterfaces.reservas;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CargarReserva {

        public static final Target LISTADO_RESERVAS = Target.the("first name input")
            .located(By.id("select-booking"));

        public static final Target RESERVA_A_ELEGIR = Target.the("payment method option")
            .locatedBy("//li[@id='{0}']");

        public static final Target BOTON_SIGUIENTE = Target.the("next button")
            .located(By.id("continue-to-payment-button"));

}
