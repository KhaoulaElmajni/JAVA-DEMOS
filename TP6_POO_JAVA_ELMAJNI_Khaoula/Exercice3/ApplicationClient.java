package TP3.Exercice3;

import javax.xml.bind.JAXBException;
import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) throws JAXBException {
        Scanner reader = new Scanner(System.in);
        int choix;

        MetierClientImpl metierClient = new MetierClientImpl();

        System.out.println("_____________________Bienvenue dans votre espace de gestion des produits et clients_____________________");
        System.out.println("Menu: veuillez saisir un numero de choix parmi les suivants\n\t1.Afficher la liste des clients.\n\t2.Rechercher un client par son nom\n\t3.Ajouter un nouveau client dans la liste\n\t4.Supprimer un client par nom\n\t5.Sauvegarder les clients\n\t6.Quitter ce programme");

        while (true){
            System.out.println("Veuillez saisir votre choix :");
            choix = reader.nextInt();
            switch (choix){
                case 1:
                    System.out.println("voici la liste des clients");
                    metierClient.afficher();
                    break;
                case 2:
                    String nom;
                    System.out.println("veuillez saisir le nom du client cherché : ");
                    reader.nextLine();
                    nom = reader.nextLine();
                    Client client = metierClient.findByNom(nom);
                    if (client != null){
                        System.out.println("le client existe et voilà ses coordonnées : \n\tnom : "+client.getNom());
                        System.out.println("\tprenom : "+client.getPrenom()+"\n\tAdresse : "+client.getAdresse());
                        System.out.println("\ttelephone : "+client.getTel()+"\n\temail : "+client.getEmail());
                    }
                    break;
                case 3:
                    String nom1, prenom,adresse,tel,email;
                    System.out.println("veuillez saisir les coordonnées du client ");
                    System.out.println("nom : ");
                    reader.nextLine();
                    nom1 = reader.nextLine();
                    System.out.println("prenom : ");
                    prenom = reader.nextLine();
                    System.out.println("adresse : ");
                    adresse = reader.nextLine();
                    System.out.println("tel : ");
                    tel = reader.nextLine();
                    System.out.println("email : ");
                    email = reader.nextLine();
                    Client c = new Client(nom1,prenom,adresse,tel,email);
                    metierClient.add(c);
                    break;
                case 4:
                    String nom2;
                    System.out.println("vauillez saisir le nom du client à supprimer");
                    reader.nextLine();
                    nom2 = reader.nextLine();
                    metierClient.delete(nom2);

                    break;
                case 5:
                    metierClient.saveAll();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
