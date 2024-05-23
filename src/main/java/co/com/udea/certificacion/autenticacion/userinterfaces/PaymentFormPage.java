package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentFormPage {
    public static final Target NUMBER_CARD_INPUT = Target.the("first name input")
            .located(By.id("debitcard"));
    public static final Target EXPIRATION_DATE_INPUT = Target.the("last name input")
            .located(By.id("date"));
    public static final Target CCV_INPUT = Target.the("email input")
            .located(By.id("ccv"));
    public static final Target NAME_INPUT = Target.the("email input")
            .located(By.id("name"));
    public static final Target PERSON_ID_INPUT = Target.the("email input")
            .located(By.id("id"));
    public static final Target NEXT_BUTTON = Target.the("next button")
            .located(By.id("continue-to-payment-button"));
}
