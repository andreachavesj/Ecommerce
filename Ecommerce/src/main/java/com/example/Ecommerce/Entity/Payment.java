package com.example.Ecommerce.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")

public class Payment {
    @Id
    @Column(name="payment_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentid;

    @Column(name = "user_idcard", length = 45)
    private int idcard;

    @Column(name = "card_number", length = 45)
    private int cardnumber;

    @Column(name = "card_name", length = 45)
    private String name;

    @Column(name = "card_expired", length = 45)
    private String expired;

    @Column(name = "card_cvc", length = 45)
    private int cvc;

    public Payment() {
    }

    public Payment(int paymentid, int idcard, int cardnumber, String name, String expired, int cvc) {
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
        return "Payment{" +
                "paymentid=" + paymentid +
                ", idcard=" + idcard +
                ", cardnumber=" + cardnumber +
                ", name='" + name + '\'' +
                ", expired='" + expired + '\'' +
                ", cvc=" + cvc +
                '}';
    }
}
