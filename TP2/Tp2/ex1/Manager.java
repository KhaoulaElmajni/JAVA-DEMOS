package com.my.java.tp2.ex1;

public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, float salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public float calculerSalire() {
        return getSalaire()+(0.2f*getSalaire());
    }

    @Override
    public String toString() {
        return "Manager : "+ super.toString() +
                "Service='" + service + "'";
    }
}
