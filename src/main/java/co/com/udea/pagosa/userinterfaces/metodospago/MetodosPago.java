package co.com.udea.pagosa.userinterfaces.metodospago;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MetodosPago {
        public static final Target LISTADO_METODOS_PAGO = Target.the("payment method dropdown")
                        .located(By.id("select-payment"));
        public static final Target LISTA_METODOS_PAGO = Target.the("Payment methods")
                        .located(By.cssSelector(".MuiMenuItem-root"));
        public static final Target METODO_PAGO_A_SELECCIONAR = Target.the("payment method option")
                        .locatedBy("//li[@id='{0}']");
        
}
