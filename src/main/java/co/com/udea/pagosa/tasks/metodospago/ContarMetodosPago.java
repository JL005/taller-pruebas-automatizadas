package co.com.udea.pagosa.tasks.metodospago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.udea.pagosa.questions.NumeroDeMetodosPago;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class ContarMetodosPago implements Task {

    public static ContarMetodosPago dosOMas() {
        return new ContarMetodosPago();
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(NumeroDeMetodosPago.disponible(), greaterThanOrEqualTo(2)));
    }

}
