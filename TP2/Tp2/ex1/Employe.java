package com.my.java.tp2.ex1;

public abstract class Employe {
    private String nom, prenom, email, telephone;
    private float salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String email, String telephone, float salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract float calculerSalire();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Nom='" + nom + "'" +
                ", Prenom='" + prenom + "'" +
                ", Email='" + email + "'" +
                ", Telephone='" + telephone + "'" +
                ", Salaire=" + salaire+" DHs, ";
    }
}
