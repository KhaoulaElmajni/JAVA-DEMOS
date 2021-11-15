package com.my.java.tp2.ex2;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Ordinateur> ordinateurs = new ArrayList<>();
        ordinateurs.add(new Ordinateur("ELITEBOOK 8470P", "HP", "HP ELITEBOOK 8470P", 3800f, 80));
        ordinateurs.add(new Ordinateur("ZENBOOK 13", "ASUS", "ASUS ZENBOOK 13", 6200f, 42));
        ordinateurs.add(new Ordinateur("MacBook Pro 2016", "APPLE", "APPLE MacBook Pro 2016", 12000f, 28));

        Categorie categorie = new Categorie("Catégorie1", "PCs PERFORMANTS", new ArrayList<>());
        for (Ordinateur ordinateur : ordinateurs)
            categorie.ajouterOrdinateur(ordinateur);

        Client client = new Client("ALAMY", "AYMAN", "123 HAY RIAD SALAM", "alamy@gmail.com", "MOHAMMEDIA", "0678546321");

        Commande commande = new Commande("R547913", "01-11-2021", "Réglée", client, new ArrayList<>());

        LigneCommande ligneCommande1 = new LigneCommande(4, commande, ordinateurs.get(0));
        LigneCommande ligneCommande2 = new LigneCommande(2, commande, ordinateurs.get(1));
        LigneCommande ligneCommande3 = new LigneCommande(3, commande, ordinateurs.get(2));

        commande.getLignesCommande().add(ligneCommande1);
        commande.getLignesCommande().add(ligneCommande2);
        commande.getLignesCommande().add(ligneCommande3);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-12s | %-12s | %-12s | %-8s | %-12s | %-12s | %-12s | %-14s |\n", "REF : ", commande.getReference(), "Date : ", commande.getDate(), "Etat : ", commande.getEtat(), "Client : ", commande.getClient().getNom()+" "+commande.getClient().getPrenom());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-16s | %-22s | %-8s | %-16s | %-12s | %-8s | %-12s |\n", "N°", "Produit", "Description", "Marque", "Catégorie", "Prix", "Quantité", "Total");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        int i = 1;
        double total = 0;
        for (LigneCommande ligne : commande.getLignesCommande()) {
            System.out.printf("| %-2d | %-16s | %-22s | %-8s | %-16s | %-8.2f DHs | %-8d | %-8.2f DHs |\n", i, ligne.getOrdinateur().getNom(), ligne.getOrdinateur().getDescription(), ligne.getOrdinateur().getMarque(), categorie.getDescription(), ligne.getOrdinateur().getPrix(), ligne.getQuantite(), ligne.getOrdinateur().getPrixPourQuantite(ligne.getQuantite()));
            i += 1;
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            total += ligne.getOrdinateur().getPrixPourQuantite(ligne.getQuantite());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-102s | %-8.2f DHs |\n", "Total", total);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

    }
}
