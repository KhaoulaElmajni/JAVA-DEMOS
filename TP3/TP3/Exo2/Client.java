package TP3.Exo2;

import java.util.ArrayList;

public class Client {
    private String nom ;
    private String prenom ;
    private String adresse;
    private String email;
    private String ville;
    private String telephone;
    private ArrayList<Commande> listeCommandes;
    public Client(){
        this.nom = "";
        this.prenom = "";
        this.adresse = "";
        this.email = "";
        this.ville = "";
        this.telephone = "";
        this.listeCommandes = null;
    }

    public Client(String nom,String prenom,String adresse,String email,String ville,String telephone){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
        this.listeCommandes = new ArrayList<>();
    }

    public void ajouterCommande(Commande commande){
        for (Commande c:this.listeCommandes ) {
            if (c.equals(commande))
                break;
        }
        this.listeCommandes.add(commande);
    }

    @Override
    public boolean equals(Object o){
        Client client = (Client) o;
        boolean liste = false;
        if(this.listeCommandes.size() != client.listeCommandes.size())
            liste = false;
        else {
            for (int i = 0; i < this.listeCommandes.size(); i++) {
                if (this.listeCommandes.get(i) == client.listeCommandes.get(i))
                    liste = true;
                else
                    liste = false;
            }
        }
        return this.nom == client.nom && this.prenom ==client.prenom && this.adresse == client.adresse && this.ville == client.ville && this.email == client.email && this.telephone == client.telephone && liste;
    }

    @Override
    public String toString() {
        return "Les informations du Client : \n\tnom : " + nom  +
                "\n\tprenom : " + prenom +
                "\n\tadresse : " + adresse +
                "\n\temail : " + email +
                "\n\tville : " + ville +
                "\n\ttelephone : " + telephone ;
    }
}
