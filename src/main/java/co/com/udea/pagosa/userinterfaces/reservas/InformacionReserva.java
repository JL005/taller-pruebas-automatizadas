package co.com.udea.pagosa.userinterfaces.reservas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionReserva {
        public static final Target FECHA_RESERVA = Target.the("valor de la fecha de reserva")
            .located(By.id("booking-date"));
        public static final Target PRECIO_SIN_IMPUESTOS = Target.the("valor del precio sin impuestos")
            .located(By.id("booking-price-without-taxes"));
        public static final Target IMPUESTOS = Target.the("valor de los impuestos")
            .located(By.id("booking-taxes"));
        public static final Target PRECIO_TOTAL = Target.the("valor del precio total de la reserva")
            .located(By.id("booking-total-price"));
            public static final Target NO_BOOKING_MESSAGE = Target.the("Mensaje de no reserva")
            .located(By.id("booking-none"));
}

