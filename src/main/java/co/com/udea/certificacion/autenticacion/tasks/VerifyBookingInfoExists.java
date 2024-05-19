package co.com.udea.certificacion.autenticacion.tasks;
    
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.TextContent;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.notNullValue;
import co.com.udea.certificacion.autenticacion.interactions.GetBookingInfo;

public class VerifyBookingInfoExists implements Task {

    public static VerifyBookingInfoExists isNotEmpty() {
        return new VerifyBookingInfoExists();
    }

    @Override
    @Subject("verify the span value")
    public <T extends Actor> void performAs(T actor) {
        actor.should(
            seeThat("The value in the span",
                TextContent.of(GetBookingInfo.FECHA_RESERVA),
                notNullValue())
        );
        actor.should(
            seeThat("The value in the span",
                TextContent.of(GetBookingInfo.PRECIO_SIN_IMPUESTOS),
                notNullValue())
        );
        actor.should(
            seeThat("The value in the span",
                TextContent.of(GetBookingInfo.IMPUESTOS),
                notNullValue())
        );
        actor.should(
            seeThat("The value in the span",
                TextContent.of(GetBookingInfo.PRECIO_TOTAL),
                notNullValue())
        );
    }
}

