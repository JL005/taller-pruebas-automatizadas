package co.com.udea.certificacion.autenticacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.hamcrest.Matchers;
import co.com.udea.certificacion.autenticacion.userinterfaces.BookingInfoPage;

public class VerifyBookingInfo implements Task {

        private final String expectedFechaReserva;
        private final String expectedPrecioSinImpuestos;
        private final String expectedImpuestos;
        private final String expectedPrecioTotal;
        private final boolean shouldExist;

        public VerifyBookingInfo(String expectedFechaReserva, String expectedPrecioSinImpuestos,
                        String expectedImpuestos, String expectedPrecioTotal, boolean shouldExist) {
                this.expectedFechaReserva = expectedFechaReserva;
                this.expectedPrecioSinImpuestos = expectedPrecioSinImpuestos;
                this.expectedImpuestos = expectedImpuestos;
                this.expectedPrecioTotal = expectedPrecioTotal;
                this.shouldExist = shouldExist;
        }

        public static VerifyBookingInfo with(String expectedFechaSalida, String expectedPrecioSinImpuestos, String expectedImpuestos, String expectedPrecioTotal, boolean shouldExist) {
                return new VerifyBookingInfo(expectedFechaSalida, expectedPrecioSinImpuestos, expectedImpuestos, expectedPrecioTotal, shouldExist);
            }
        

        @Override
        @Subject("verify the span value")
        public <T extends Actor> void performAs(T actor) {
                if (shouldExist) {
                        actor.should(
                                        seeThat("The value in the span",
                                                        Text.of(BookingInfoPage.FECHA_RESERVA),
                                                        Matchers.equalTo(expectedFechaReserva)));
                        actor.should(
                                        seeThat("The value in the span",
                                                        Text.of(BookingInfoPage.PRECIO_SIN_IMPUESTOS),
                                                        Matchers.equalTo(expectedPrecioSinImpuestos)));
                        actor.should(
                                        seeThat("The value in the span",
                                                        Text.of(BookingInfoPage.IMPUESTOS),
                                                        Matchers.equalTo(expectedImpuestos)));
                        actor.should(
                                        seeThat("The value in the span",
                                                        Text.of(BookingInfoPage.PRECIO_TOTAL),
                                                        Matchers.equalTo(expectedPrecioTotal)));
                } else {
                        actor.should(
                                        seeThat("The value in the span",
                                                        TextContent.of(BookingInfoPage.NO_BOOKING_MESSAGE),
                                                        Matchers.equalTo("No se encontraron datos para la reserva")));
                }
                
        }
}
