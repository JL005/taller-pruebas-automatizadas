package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.userinterfaces.GetPaymentMethod;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.actions.Click;

public class SelectPaymentMethod implements Task {

    private final String paymentMethod;

    public SelectPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public static SelectPaymentMethod as(String paymentMethod) {
        return new SelectPaymentMethod(paymentMethod);
    }

    @Override
    @Subject("select the payment method")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(GetPaymentMethod.PAYMENT_METHOD_DROPDOWN)
            ,
            Click.on(GetPaymentMethod.PAYMENT_METHOD_OPTION.of(paymentMethod))
        );
    }
}
