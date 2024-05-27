package co.com.udea.pagosa.userinterfaces.metodospago;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MetodosPago {
        public static final Target LISTADO_METODOS_PAGO = Target.the("dropdown de metodos de pago")
                        .located(By.id("select-payment"));
        public static final Target LISTA_METODOS_PAGO = Target.the("lista de metodos de pago")
                        .located(By.cssSelector(".MuiMenuItem-root"));
        public static final Target METODO_PAGO_A_SELECCIONAR = Target.the("metodo de pago a seleccionar")
                        .locatedBy("//li[@id='{0}']");
        
}
