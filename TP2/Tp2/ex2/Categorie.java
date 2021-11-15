package com.my.java.tp2.ex2;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;

public class Categorie {
    private String nom, description;
    private ArrayList<Ordinateur> ordinateurs;

    public Categorie() {
    }

    public Categorie(String nom, String description, ArrayList<Ordinateur> ordinateurs) {
        this.nom = nom;
        this.description = description;
        this.ordinateurs = ordinateurs;
    }

    public boolean ajouterOrdinateur(Ordinateur ordinateur) {
        if (!ordinateurs.contains(ordinateur)) {
            ordinateurs.add(ordinateur);
            return true;
        } else return false;
    }

    public boolean supprimerOrdinateur(Ordinateur ordinateur) {
        if (ordinateurs.contains(ordinateur)) {
            ordinateurs.remove(ordinateur);
            return true;
        } else return false;
    }

    ArrayList<Ordinateur> rechercherParPrix(float prix) {
        ArrayList<Ordinateur> returned = new ArrayList<>();
        for (Ordinateur ordinateur : ordinateurs) {
            if (ordinateur.getPrix() == prix)
                returned.add(ordinateur);
        }
        return returned;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Ordinateur> getOrdinateurs() {
        return ordinateurs;
    }

    public void setOrdinateurs(ArrayList<Ordinateur> ordinateurs) {
        this.ordinateurs = ordinateurs;
    }

    @Override
    public String toString() {
        return "Categorie : " +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", ordinateurs=" + ordinateurs;
    }
}
