package co.com.udea.pagosa.models;

public class DetallesCuentaPaypal {
    private final String email;
    private final String password;

    public DetallesCuentaPaypal(String email, String password) {
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
