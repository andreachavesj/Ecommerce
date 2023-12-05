package com.example.Ecommerce.Dto;

public class PaymentDTO {

    private int paymentid;
    private int idcard;

    private int cardnumber;

    private String name;

    private String expired;

    private int cvc;

    public PaymentDTO() {
    }

    public PaymentDTO(int paymentid, int idcard, int cardnumber, String name, String expired, int cvc) {
        this.paymentid = paymentid;
        this.idcard = idcard;
        this.cardnumber = cardnumber;
        this.name = name;
        this.expired = expired;
        this.cvc = cvc;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public int getIdcard() {
        return idcard;
    }

    public void setIdcard(int idcard) {
        this.idcard = idcard;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "idcard=" + idcard +
                ", cardnumber=" + cardnumber +
                ", name='" + name + '\'' +
                ", expired='" + expired + '\'' +
                ", cvc=" + cvc +
                '}';
    }
}
