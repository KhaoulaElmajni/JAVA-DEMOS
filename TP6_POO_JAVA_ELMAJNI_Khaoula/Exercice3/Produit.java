package TP3.Exercice3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Produit implements Serializable {
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nbrStock;

    public Produit() {
    }

    public Produit(String nom, String marque, double prix, String description, int nbrStock) {
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbrStock = nbrStock;
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @XmlElement
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement
    public int getNbrStock() {
        return nbrStock;
    }

    public void setNbrStock(int nbrStock) {
        this.nbrStock = nbrStock;
    }
}
