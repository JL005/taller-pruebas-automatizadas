package co.com.udea.pagosa.userinterfaces.formularioPagos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPagoTarjeta {
    public static final Target NUMBER_CARD_INPUT = Target.the("numero de tarjeta input")
            .located(By.id("debitcard"));
    public static final Target FECHA_EXPIRACION_INPUT = Target.the("fecha de expiración de la tarjeta input")
            .located(By.id("date"));
    public static final Target CCV_INPUT = Target.the("codigo de seguridad de la tarjeta input")
            .located(By.id("ccv"));
    public static final Target NOMBRE_INPUT = Target.the("nombre del tarjetahabiente input")
            .located(By.id("name"));
    public static final Target ID_INPUT = Target.the("documento de identificacion del tarjetahabiente input")
            .located(By.id("id"));
    public static final Target BOTON_PAGAR = Target.the("botón de pagar")
            .located(By.id("payment-button"));
}
