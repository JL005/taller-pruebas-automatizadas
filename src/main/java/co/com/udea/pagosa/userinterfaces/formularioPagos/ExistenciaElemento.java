package co.com.udea.pagosa.userinterfaces.formularioPagos;

import net.serenitybdd.screenplay.targets.Target;

public class ExistenciaElemento {
        public static Target byId(String id) {
                return Target.the("Elemento con id " + id).locatedBy("#" + id);
        }
}
