package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GetBookingInfo {
    public static final Target FECHA_RESERVA = Target.the("example span")
            .located(By.id("booking-date"));
    public static final Target PRECIO_SIN_IMPUESTOS = Target.the("example span")
            .located(By.id("booking-price-without-taxes"));
    public static final Target IMPUESTOS = Target.the("example span")
            .located(By.id("booking-taxes"));
    public static final Target PRECIO_TOTAL = Target.the("example span")
            .located(By.id("booking-total-price"));

}
