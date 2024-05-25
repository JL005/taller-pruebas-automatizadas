package co.com.udea.pagosa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import co.com.udea.pagosa.userinterfaces.metodospago.MetodosPago;

public class NumeroDeMetodosPago implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return Text.ofEach(MetodosPago.LISTA_METODOS_PAGO).answeredBy(actor).size();
    }

    public static NumeroDeMetodosPago disponible() {
        return new NumeroDeMetodosPago();
    }
}
