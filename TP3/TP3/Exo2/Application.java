package TP3.Exo2;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Ordinateur ordinateur1 = new Ordinateur("Mac pro","Machintosh",10800,"un ordinateur portable destine aux experts",212,new Categorie("MAC","un type d\'excellent niveau"));
        Ordinateur ordinateur2 = new Ordinateur("Mac pro","Machintosh",10800,"un ordinateur portable destine aux experts",212,new Categorie("MAC","un type d\'excellent niveau"));
        Ordinateur ordinateur3 = new Ordinateur("Acer elite","ACER",4000,"un ordinateur portable destine aux employes",67,new Categorie("Acer","un type de bon niveau"));

        ArrayList<Ordinateur> ordinateurs = new ArrayList<>();
        ordinateurs.add(new Ordinateur("Elitebook","marque",3800,"un ordinateur portable destine aux etudiants",182,new Categorie("HP","un type de bon niveau")));
        ordinateurs.add(new Ordinateur("Mac pro","Machintosh",10800,"un ordinateur portable destine aux experts",212,new Categorie("MAC","un type d\'excellent niveau")));
        ordinateurs.add(new Ordinateur("Acer elite","ACER",4000,"un ordinateur portable destine aux employes",67,new Categorie("Acer","un type de bon niveau")));

        Categorie categorie1 = new Categorie("Acer","un type de bon niveau");
        Client client1 = new Client("ELMAJNI", "Khaoula","551 bloc 06 hay Pam","elmajnikhaoula99@gmail.com","Sidi Bennour","212639127097");

        Commande commande1 = new Commande("A01",client1,"01-11-2021","en cours");

        ArrayList<Ligne_commande> ligne_commandes = new ArrayList<>();
        ligne_commandes.add(new Ligne_commande(19,commande1,ordinateur1));
        ligne_commandes.add(new Ligne_commande(26,commande1,ordinateur2));
        ligne_commandes.add(new Ligne_commande(7,commande1,ordinateur3));

        System.out.println(commande1.toString());
    }
}
