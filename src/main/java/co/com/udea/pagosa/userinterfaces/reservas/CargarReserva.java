package co.com.udea.pagosa.userinterfaces.reservas;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CargarReserva {

        public static final Target LISTADO_RESERVAS = Target.the("dropdown de reservas")
            .located(By.id("select-booking"));

        public static final Target RESERVA_A_ELEGIR = Target.the("reserva a elegir")
            .locatedBy("//li[@id='{0}']");

        public static final Target BOTON_SIGUIENTE = Target.the("botón siguiente")
            .located(By.id("continue-to-payment-button"));

}
