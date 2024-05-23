package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.userinterfaces.GetBooking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectBooking implements Task{

    private final String booking;

    public SelectBooking(String booking) {
        this.booking = booking;
    }

    public static SelectBooking as(String booking) {
        return new SelectBooking(booking);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(GetBooking.BOOKING_DROPDOWN)
            ,
            Click.on(GetBooking.BOOKING_OPTION.of(booking))
        );
    }
    
}
