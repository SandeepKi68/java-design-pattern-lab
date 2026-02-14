package org.example.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("SandeepDebitCard",new DebitCard("406124898777","Sandeep Kishan"));
        ps.addPaymentMethod("SandeepCreditCard",new CreditCard("543209871234","Sandeep Kishan"));
        ps.addPaymentMethod("SandeepUPI",new UPI("87654321@ybl"));

        ps.makePayment("SandeepUPI");
        ps.makePayment("SandeepDebitCard");
    }
}
