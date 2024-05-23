package co.com.udea.certificacion.autenticacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.udea.certificacion.autenticacion.models.PaypalPaymentDetails;
import co.com.udea.certificacion.autenticacion.userinterfaces.PaypalFormPage;

public class FillPaypalPaymentForm implements Task {
    private final PaypalPaymentDetails paymentDetails;

    public FillPaypalPaymentForm(PaypalPaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public static FillPaypalPaymentForm withDetails(PaypalPaymentDetails paymentDetails) {
        return new FillPaypalPaymentForm(paymentDetails);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(paymentDetails.getEmail()).into(PaypalFormPage.USER_INPUT),
            Enter.theValue(paymentDetails.getPassword()).into(PaypalFormPage.PASSWORD_INPUT)
        );
    }
}




