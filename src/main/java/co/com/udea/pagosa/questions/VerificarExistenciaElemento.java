package co.com.udea.pagosa.questions;

import java.util.Arrays;
import java.util.List;

import co.com.udea.pagosa.userinterfaces.formularioPagos.ExistenciaElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class VerificarExistenciaElemento implements Question<Boolean>{
    
    private final List<String> elementIds;

    public VerificarExistenciaElemento(List<String> elementIds) {
        this.elementIds = elementIds;
    }

    public static VerificarExistenciaElemento forIds(String... elementIds) {
        return new VerificarExistenciaElemento(Arrays.asList(elementIds));
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        for (String elementId : elementIds) {
            if (!WebElementQuestion.valueOf(ExistenciaElemento.byId(elementId)).answeredBy(actor).isPresent()) {
                return false;
            }
        }
        return true;
    }
}
