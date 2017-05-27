package me.philcali.shopify.data.order;

public class PaymentDetails {
    private String avsResultCode;
    private String creditCardBin;
    private String cvvResultCode;
    private String creditCardNumber;
    private String creditCardCompany;

    public String getAvsResultCode() {
        return avsResultCode;
    }

    public String getCreditCardBin() {
        return creditCardBin;
    }

    public String getCreditCardCompany() {
        return creditCardCompany;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCvvResultCode() {
        return cvvResultCode;
    }

    public void setAvsResultCode(String avsResultCode) {
        this.avsResultCode = avsResultCode;
    }

    public void setCreditCardBin(String creditCardBin) {
        this.creditCardBin = creditCardBin;
    }

    public void setCreditCardCompany(String creditCardCompany) {
        this.creditCardCompany = creditCardCompany;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCvvResultCode(String cvvResultCode) {
        this.cvvResultCode = cvvResultCode;
    }
}
