package co.com.udea.certificacion.autenticacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.udea.certificacion.autenticacion.interactions.PaymentFormPage;
import co.com.udea.certificacion.autenticacion.models.PaymentDetails;



public class FillPaymentForm implements Task {

    private final PaymentDetails paymentDetails;

    public FillPaymentForm(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public static FillPaymentForm withDetails(PaymentDetails paymentDetails) {
        return new FillPaymentForm(paymentDetails);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(paymentDetails.getCardNumber()).into(PaymentFormPage.NUMBER_CARD_INPUT),
            Enter.theValue(paymentDetails.getExpirationDate()).into(PaymentFormPage.EXPIRATION_DATE_INPUT),
            Enter.theValue(paymentDetails.getCcv()).into(PaymentFormPage.CCV_INPUT),
            Enter.theValue(paymentDetails.getName()).into(PaymentFormPage.NAME_INPUT),
            Enter.theValue(paymentDetails.getPersonId()).into(PaymentFormPage.PERSON_ID_INPUT)
        );
    }
}

