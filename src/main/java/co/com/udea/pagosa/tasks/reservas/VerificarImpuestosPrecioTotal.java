package co.com.udea.pagosa.tasks.reservas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.hamcrest.Matchers;

import co.com.udea.pagosa.userinterfaces.reservas.InformacionReserva;

public class VerificarImpuestosPrecioTotal implements Task {
    private final String esperadoPrecioTotal;
    private final String esperadoImpuestos;

    public VerificarImpuestosPrecioTotal(String esperadoPrecioTotal, String esperadoImpuestos) {
        this.esperadoPrecioTotal = esperadoPrecioTotal;
        this.esperadoImpuestos = esperadoImpuestos;
    }

    public static VerificarImpuestosPrecioTotal con(String esperadoPrecioTotal, String esperadoImpuestos) {
        return new VerificarImpuestosPrecioTotal(esperadoPrecioTotal, esperadoImpuestos);
    }

    @Override
    @Subject("Verificar los impuestos y precio total")
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat("The value in the span",
                        Text.of(InformacionReserva.IMPUESTOS),
                        Matchers.equalTo(esperadoImpuestos)));
        actor.should(
                seeThat("The value in the span",
                        Text.of(InformacionReserva.PRECIO_TOTAL),
                        Matchers.equalTo(esperadoPrecioTotal)));
    }
}
