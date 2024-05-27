package co.com.udea.pagosa.tasks.reservas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;
import co.com.udea.pagosa.userinterfaces.reservas.InformacionReserva;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerificarFechaReservaPrecioSinImpuestos implements Task {

    private final String esperadaFechaReserva;
    private final String esperadaPrecioSinImpuestos;

    public VerificarFechaReservaPrecioSinImpuestos(String esperadaFechaReserva, String esperadaPrecioSinImpuestos) {
        this.esperadaFechaReserva = esperadaFechaReserva;
        this.esperadaPrecioSinImpuestos = esperadaPrecioSinImpuestos;
    }

    public static VerificarFechaReservaPrecioSinImpuestos con(String esperadaFechaReserva,
            String esperadaPrecioSinImpuestos) {
        return new VerificarFechaReservaPrecioSinImpuestos(esperadaFechaReserva, esperadaPrecioSinImpuestos);
    }

    @Override
    @Subject("Verificar la fecha de reserva y el precio sin impuestos")
    public <T extends Actor> void performAs(T actor) {
        actor.should("Verifica si la fecha de la reserva y el precio sin impuestos son correctos",
                seeThat(Text.of(InformacionReserva.FECHA_RESERVA),
                        Matchers.equalTo(this.esperadaFechaReserva)),
                seeThat(Text.of(InformacionReserva.PRECIO_SIN_IMPUESTOS),
                        Matchers.equalTo(this.esperadaPrecioSinImpuestos)));
    }
}
