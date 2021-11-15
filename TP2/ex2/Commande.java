package com.my.java.tp2.ex2;

import java.util.ArrayList;
import java.util.Objects;

public class Commande {
   private String reference, date, etat;
   private Client client;
   private ArrayList<LigneCommande> lignesCommande;

    public Commande() {
    }

    public Commande(String reference, String date, String etat, Client client, ArrayList<LigneCommande> lignesCommande) {
        this.reference = reference;
        this.date = date;
        this.etat = etat;
        this.client = client;
        this.lignesCommande = lignesCommande;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Commande autre = (Commande) object;
        return reference.equals(autre.reference);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public ArrayList<LigneCommande> getLignesCommande() {
        return lignesCommande;
    }

    public void setLignesCommande(ArrayList<LigneCommande> lignesCommande) {
        this.lignesCommande = lignesCommande;
    }

    @Override
    public String toString() {
        return "Commande : " +
                "reference='" + reference + '\'' +
                ", client='" + client + '\'' +
                ", date='" + date + '\'' +
                ", etat='" + etat + '\'';
    }
}
