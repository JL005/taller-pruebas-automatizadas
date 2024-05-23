package co.com.udea.certificacion.autenticacion.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GetBooking {

        public static final Target BOOKING_DROPDOWN = Target.the("first name input")
            .located(By.id("select-booking"));

        public static final Target BOOKING_OPTION = Target.the("payment method option")
            .locatedBy("//li[@id='{0}']");

        public static final Target NEXT_BUTTON = Target.the("next button")
            .located(By.id("continue-to-payment-button"));

}
