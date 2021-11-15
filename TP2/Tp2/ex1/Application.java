package com.my.java.tp2.ex1;

public class Application {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("OMARY", "AHMED", "omary@gmail.com", "0798265712", 16000, "BACK-END");
        Manager manager = new Manager("CHARIF", "SAMIR", "charif@gmail.com", "06985723123", 28000, "MAINTENANCE");
        System.out.println(ingenieur);
        System.out.println(manager);
    }
}
