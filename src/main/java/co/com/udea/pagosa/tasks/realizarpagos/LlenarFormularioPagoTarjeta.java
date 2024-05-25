package co.com.udea.pagosa.tasks.realizarpagos;

import co.com.udea.pagosa.models.DetallesPagoTarjeta;
import co.com.udea.pagosa.userinterfaces.formularioPagos.FormularioPagoTarjeta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


public class LlenarFormularioPagoTarjeta implements Task {

    private final DetallesPagoTarjeta detallesPago;

    public LlenarFormularioPagoTarjeta(DetallesPagoTarjeta paymentDetails) {
        this.detallesPago = paymentDetails;
    }

    public static LlenarFormularioPagoTarjeta conInfo(DetallesPagoTarjeta paymentDetails) {
        return new LlenarFormularioPagoTarjeta(paymentDetails);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(detallesPago.getCardNumber()).into(FormularioPagoTarjeta.NUMBER_CARD_INPUT),
            Enter.theValue(detallesPago.getExpirationDate()).into(FormularioPagoTarjeta.FECHA_EXPIRACION_INPUT),
            Enter.theValue(detallesPago.getCcv()).into(FormularioPagoTarjeta.CCV_INPUT),
            Enter.theValue(detallesPago.getName()).into(FormularioPagoTarjeta.NOMBRE_INPUT),
            Enter.theValue(detallesPago.getPersonId()).into(FormularioPagoTarjeta.ID_INPUT)
        );
    }
}

