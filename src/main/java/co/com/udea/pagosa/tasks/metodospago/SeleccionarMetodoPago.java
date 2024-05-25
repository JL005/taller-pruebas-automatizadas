package co.com.udea.pagosa.tasks.metodospago;

import co.com.udea.pagosa.userinterfaces.metodospago.MetodosPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarMetodoPago implements Task {

    private final String metodoPago;

    public SeleccionarMetodoPago(String paymentMethod) {
        this.metodoPago = paymentMethod;
    }

    public static SeleccionarMetodoPago as(String paymentMethod) {
        return new SeleccionarMetodoPago(paymentMethod);
    }

    @Override
    @Subject("select the payment method")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(MetodosPago.LISTADO_METODOS_PAGO),
            Click.on(MetodosPago.METODO_PAGO_A_SELECCIONAR.of(metodoPago))
        );
    }
}
