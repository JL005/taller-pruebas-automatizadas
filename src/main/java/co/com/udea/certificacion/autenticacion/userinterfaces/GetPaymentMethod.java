package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GetPaymentMethod {
    public static final Target PAYMENT_METHOD_DROPDOWN = Target.the("payment method dropdown")
            .located(By.id("select-payment"));
    public static final Target PAYMENT_METHOD_OPTION = Target.the("payment method option")
            .locatedBy("//li[@id='{0}']");
}
