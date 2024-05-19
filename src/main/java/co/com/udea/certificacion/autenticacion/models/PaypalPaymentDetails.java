package co.com.udea.certificacion.autenticacion.models;

public class PaypalPaymentDetails {
    private final String email;
    private final String password;

    public PaypalPaymentDetails(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
