package co.com.udea.pagosa.tasks.formulariopagos;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.Arrays;
import java.util.List;

import co.com.udea.pagosa.userinterfaces.formularioPagos.ExistenciaElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class VerificarSiElementoExiste implements Task {

    private final List<String> camposFormulario;

    public VerificarSiElementoExiste(List<String> camposFormulario) {
        this.camposFormulario = camposFormulario;
    }

    public static VerificarSiElementoExiste conCampos(String... fieldIds) {
        return new VerificarSiElementoExiste(Arrays.asList(fieldIds));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (String campo : camposFormulario) {
            actor.should(
                    seeThat("The element with ID " + campo,
                            WebElementQuestion.the(ExistenciaElemento.byId(campo)),
                            WebElementStateMatchers.isVisible()));
        }
    }

}
