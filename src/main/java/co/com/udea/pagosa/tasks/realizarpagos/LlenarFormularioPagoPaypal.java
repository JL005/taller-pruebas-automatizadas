package co.com.udea.pagosa.tasks.realizarpagos;

import co.com.udea.pagosa.models.DetallesCuentaPaypal;
import co.com.udea.pagosa.userinterfaces.formularioPagos.FormularioPagoPaypal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioPagoPaypal implements Task {
    private final DetallesCuentaPaypal paymentDetails;

    public LlenarFormularioPagoPaypal(DetallesCuentaPaypal paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public static LlenarFormularioPagoPaypal conInfo(DetallesCuentaPaypal paymentDetails) {
        return new LlenarFormularioPagoPaypal(paymentDetails);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(paymentDetails.getEmail()).into(FormularioPagoPaypal.EMAIL_INPUT),
            Enter.theValue(paymentDetails.getPassword()).into(FormularioPagoPaypal.PASSWORD_INPUT)
        );
    }
}




