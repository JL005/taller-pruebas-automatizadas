package co.com.udea.certificacion.autenticacion.models;

public class BookingDetails {
 
    
    private String date;
    private String priceWithoutTaxes;
    private String taxes;
    private String totalPrice;

    public BookingDetails(String date, String priceWithoutTaxes, String taxes, String totalPrice) {
        this.date = date;
        this.priceWithoutTaxes = priceWithoutTaxes;
        this.taxes = taxes;
        this.totalPrice = totalPrice;
    }

    public String getDate() {
        return date;
    }

    public String getPriceWithoutTaxes() {
        return priceWithoutTaxes;
    }

    public String getTaxes() {
        return taxes;
    }

    public String getTotalPrice() {
        return totalPrice;
    }
}
