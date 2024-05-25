package co.com.udea.pagosa.tasks.metodospago;

import co.com.udea.pagosa.userinterfaces.metodospago.MetodosPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprobarMetodoPago implements Task {

    private final String metodoPago;

    public ComprobarMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public static ComprobarMetodoPago conNombre(String metodoPago) {
        return new ComprobarMetodoPago(metodoPago);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(Text.of(MetodosPago.LISTADO_METODOS_PAGO),
                Matchers.equalTo(this.metodoPago)));
    }
}
