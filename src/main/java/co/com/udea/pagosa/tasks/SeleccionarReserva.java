package co.com.udea.pagosa.tasks;

import co.com.udea.pagosa.userinterfaces.reservas.CargarReserva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarReserva implements Task{

    private final String booking;

    public SeleccionarReserva(String booking) {
        this.booking = booking;
    }

    public static SeleccionarReserva as(String booking) {
        return new SeleccionarReserva(booking);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(CargarReserva.LISTADO_RESERVAS)
            ,
            Click.on(CargarReserva.RESERVA_A_ELEGIR.of(booking))
        );
    }
    
}
