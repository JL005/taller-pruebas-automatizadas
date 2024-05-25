package co.com.udea.pagosa.tasks.reservas;

import org.hamcrest.Matchers;

import co.com.udea.pagosa.userinterfaces.reservas.InformacionReserva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.TextContent;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerificarMensajeReservaNoEncontrada implements Task {

    public static VerificarMensajeReservaNoEncontrada existe() {
        return new VerificarMensajeReservaNoEncontrada();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat("Obtener el mensaje de no se encontraron datos para la reserva",
                        TextContent.of(InformacionReserva.NO_BOOKING_MESSAGE),
                        Matchers.equalTo("No se encontraron datos para la reserva")));
    }
}
