package TP3.Exercice3;

import javax.xml.bind.JAXBException;
import java.util.Scanner;

public class ApplicationProduit {
    public static void main(String[] args) throws JAXBException {
        Scanner reader = new Scanner(System.in);
        int choix;

        MetierProduitImpl metierProduit = new MetierProduitImpl();

        System.out.println("_____________________Bienvenue dans votre espace de gestion des produits et clients_____________________");
        System.out.println("Menu: veuillez saisir un numero de choix parmi les suivants\n\t1.Afficher la liste des produits.\n\t2.Rechercher un produit par son nom\n\t3.Ajouter un nouveau produit dans la liste\n\t4.Supprimer un produit par nom\n\t5.Sauvegarder les produits\n\t6.Quitter ce programme");

        while (true){
            System.out.println("Veuillez saisir votre choix :");
            choix = reader.nextInt();
            switch (choix){
                case 1:
                    System.out.println("voici la liste des produits");
                    metierProduit.afficher();
                    break;
                case 2:
                    String nom;
                    System.out.println("veuillez saisir le nom du produit cherché : ");
                    reader.nextLine();
                    nom = reader.nextLine();
                    Produit produit = metierProduit.findByNom(nom);
                    if (produit != null){

                        System.out.println("le produit existe et voilà ses coordonnées : \n\tnom : "+produit.getNom());
                        System.out.println("\tmarque : "+produit.getMarque()+"\n\tprix : "+produit.getPrix());
                        System.out.println("\tdescription : "+produit.getDescription()+"\n\temail : "+produit.getNbrStock());
                    }
                    break;
                case 3:
                    String nom1,marque,description;
                    double prix;
                    int nbrStock;
                    System.out.println("veuillez saisir les coordonnées du client ");
                    System.out.println("nom : ");
                    reader.nextLine();
                    nom1 = reader.nextLine();
                    System.out.println("marque : ");
                    marque = reader.nextLine();
                    System.out.println("prix : ");
                    prix = reader.nextDouble();
                    System.out.println("description : ");
                    reader.nextLine();
                    description = reader.nextLine();
                    System.out.println("Qte de stock : ");
                    nbrStock = reader.nextInt();
                    Produit p = new Produit(nom1,marque,prix,description,nbrStock);
                    metierProduit.add(p);
                    break;
                case 4:
                    String nom2;
                    System.out.println("vauillez saisir le nom du produit à supprimer");
                    reader.nextLine();
                    nom2 = reader.nextLine();
                    metierProduit.delete(nom2);

                    break;
                case 5:
                    metierProduit.saveAll();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }}
