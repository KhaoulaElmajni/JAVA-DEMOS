package com.my.java.tp2.ex1;

public class Ingenieur extends Employe {
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, float salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public float calculerSalire() {
        return getSalaire()+(0.15f*getSalaire());
    }

    @Override
    public String toString() {
        return "Ingenieur : "+ super.toString()+
                "Specialite='" + specialite + "'";
    }
}
