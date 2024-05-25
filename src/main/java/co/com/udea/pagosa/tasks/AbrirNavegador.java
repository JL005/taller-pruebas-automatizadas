package co.com.udea.pagosa.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

    private final String url;

    public AbrirNavegador(String url) {
        this.url = url;
    }

    public static AbrirNavegador at(String url) {
        return new AbrirNavegador(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
