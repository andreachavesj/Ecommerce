package com.example.Ecommerce.response;

public class PaymentResponse {

    String message;

    Boolean status;

    public  PaymentResponse(String message, Boolean status){
        this.message = message;
        this.status = status;
    }

    public PaymentResponse(){
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
