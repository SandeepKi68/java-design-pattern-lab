package org.example.OOPS;

abstract public class Card implements PaymentMethod {

    private final String cardNo;
    private final String userName;

    public Card(String cardNo, String name){
        this.cardNo = cardNo;
        this.userName = name;
    }
    public String getCardNo() {
        return cardNo;
    }
    public String getUserName() {
        return userName;
    }
}