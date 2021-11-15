package TP3.Exo2;

import java.util.ArrayList;

public class Categorie {
    private String nom;
    private String descrition;
    private ArrayList<Ordinateur> ordinateurs ;

    public Categorie(){
        this.nom = "";
        this.descrition = "";
        this.ordinateurs = null;
    }
    public Categorie(String nom,String descrition){
        this.nom = nom;
        this.descrition = descrition;
        this.ordinateurs = new ArrayList<>();
    }

    public void ajouterOrdinateur(Ordinateur ordinateur){
        for (Ordinateur o:this.ordinateurs ) {
            if (o.equals(ordinateur))
                break;
        }
        this.ordinateurs.add(ordinateur);
    }
    public void supprimerOrdinateur(Ordinateur ordinateur){
        for (Ordinateur o:this.ordinateurs ) {
            if (o.equals(ordinateur))
                this.ordinateurs.remove(ordinateur);
        }
    }
    public ArrayList<Ordinateur> rechercherParPrix(double prix){
        ArrayList<Ordinateur> listePrixChercher = new ArrayList<>();
        for (Ordinateur o:this.ordinateurs ) {
            if (o.getPrix() == prix){
                listePrixChercher.add(o);
            }
        }
        return listePrixChercher;
    }

    @Override
    public String toString() {
        return "Categorie : \n\tnom :  " + nom +
                "\n\tdescrition :  "+ descrition +
                "\n\tordinateurs : " + ordinateurs ;
    }
}
