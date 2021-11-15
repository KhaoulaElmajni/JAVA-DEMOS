package com.my.java.tp2.ex2;

import java.util.ArrayList;

public class Client {
    private String nom, prenom, adresse, email, ville, telephone;
    private ArrayList<Commande> commandes;

    public Client() {
    }

    public Client(String nom, String prenom, String adresse, String email, String ville, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
    }

    public Client(String nom, String prenom, String adresse, String email, String ville, String telephone, ArrayList<Commande> commandes) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
        this.commandes = commandes;
    }


    public boolean ajouterCommande(Commande commande) {
        if (!commandes.contains(commande)) {
            commandes.add(commande);
            return true;
        } else return false;
    }

    public boolean supprimerCommande(Commande commande) {
        if (commandes.contains(commande)) {
            commandes.remove(commande);
            return true;
        } else return false;
    }

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "Client : " +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", ville='" + ville + '\'' +
                ", telephone='" + telephone + '\'' +
                ", commandes=" + commandes;
    }
}
