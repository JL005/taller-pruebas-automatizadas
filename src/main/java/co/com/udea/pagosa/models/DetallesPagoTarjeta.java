package co.com.udea.pagosa.models;

public class DetallesPagoTarjeta {

    private final String cardNumber;
    private final String expirationDate;
    private final String ccv;
    private final String name;
    private final String personId;
    
    public DetallesPagoTarjeta(String cardNumber, String expirationDate, String ccv, String name, String personId) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.ccv = ccv;
        this.name = name;
        this.personId = personId;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public String getCcv() {
        return ccv;
    }
    public String getName() {
        return name;
    }
    public String getPersonId() {
        return personId;
    }

    
}
