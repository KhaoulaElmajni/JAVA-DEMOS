package com.my.java.tp2.ex2;

public class Ordinateur {
    private String nom, marque, description;
    private float prix;
    private int stock;

    public Ordinateur() {
    }

    public Ordinateur(String nom, String marque, String description, float prix, int stock) {
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrixPourQuantite(int quantite) {
        return prix * quantite;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Ordinateur autre = (Ordinateur) object;
        return Float.compare(autre.prix, prix) == 0 && nom.equals(autre.nom) && marque.equals(autre.marque);
    }

    @Override
    public String toString() {
        return "Ordinateur : " +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", stock=" + stock;
    }
}
