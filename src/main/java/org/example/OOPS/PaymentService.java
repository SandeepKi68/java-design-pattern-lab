package org.example.OOPS;

import java.util.HashMap;

public class PaymentService {

    HashMap<String,PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }
    public void addPaymentMethod(String name, PaymentMethod paymentMethod){
    paymentMethods.put(name,paymentMethod);
    }
    public void makePayment(String name){
     PaymentMethod paymentMethod = paymentMethods.get(name);
     paymentMethod.pay(); //Run Time Polymorphism
    }
}