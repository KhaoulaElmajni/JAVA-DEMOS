package Main;

import BusinessModel.Client;
import BusinessModel.Compte;
import BusinessModel.Operation;
import BusinessModel.OperationType;
import Exceptions.CompteException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CompteException {

        Scanner reader= new Scanner(System.in);
        int choix=0,comptesNbr=0,numero,choixOp,choixOpType;
        long numeroCompteDst,numeroCompteSrc;
        double solde,montant;
        String nom, prenom;
        Compte compteDstVirement;
        Compte compteSrc;
        ArrayList<Client> clients = new ArrayList<>();

        System.out.println("Bienvenue dans votre espace de gestion des comptes bancaitres");
        System.out.println("GUIDE D\'APPLICATION:\n\tPour créer un client veuillez saisir 1\n\tPour Quitter veuillez saisir 0");

        do{
            System.out.print("Votre choix : ");
            choix = reader.nextInt();
        }while(choix!=0 && choix!=1);

        if (choix == 0){
            System.exit(0);
        }else {
            //création de client
            reader.nextLine();
            System.out.print("Veuillez saisir les données du client \n\tnom :");
            nom = reader.nextLine();
            System.out.print("\tprenom : ");

            prenom = reader.nextLine();
            Client client1 = creerClient(01,nom,prenom);

            //création des comptes du client
            System.out.println("Combien de comptes vous désirez pour ce client : ");
            comptesNbr = reader.nextInt();
            for (int i = 0; i < comptesNbr; i++) {
                System.out.println("les données de compte "+(i+1) + " : ");
                System.out.println("numero : ");
                numero = reader.nextInt();
                System.out.println("solde : ");
                solde = reader.nextDouble();
                client1.getComptes().add(new Compte(i,numero,solde,client1));

            }
            clients.add(client1);

            do{
                System.out.println("Voulez-vous effectuer une operation sur un compte ?\n\t1 pour oui\n\t0 pour non");
                choixOp = reader.nextInt();
            }while(choixOp!=0 && choixOp!=1);
            if (choixOp == 1){
                loop1 : while (true){
                    do{
                        System.out.println("Quel type d\'operation ?\n\t0 pour quitter \n\t1 pour le retrait\n\t2 pour le virement");
                        choixOpType = reader.nextInt();
                    }while(choixOpType!=1 && choixOpType!=2 && choixOpType!=0);
                    switch (choixOpType){
                        case 0: break loop1;
                        case 1:
                            System.out.print("De quel compte (veuillez saisir le numéro de votre compte source): ");
                            numeroCompteSrc = reader.nextLong();
                            compteSrc = rechercherCompteParNumero(numeroCompteSrc,clients);
                            System.out.println("le montant à retirer : ");
                            montant = reader.nextDouble();
                            Operation operation1 = creerOperation(01,new Date(2021,01,23),new OperationType(01,"Retrait","retirer une somme d\'argent"),compteSrc,client1,montant);

                            try {
                                operation1.retirerArgent(montant);
                            }catch (CompteException compteException){
                                System.out.println(compteException.getMessage());
                            }
                            for (Compte c:client1.getComptes()) {
                                if (c == compteSrc)
                                    c.getOperations().add(operation1);
                            }
                            break;
                        case 2 :
                            System.out.println("le montant à verser : ");
                            montant = reader.nextDouble();
                            System.out.print("De quel compte (veuillez saisir le numéro de votre compte source): ");
                            numeroCompteSrc = reader.nextLong();
                            compteSrc = rechercherCompteParNumero(numeroCompteSrc,clients);
                            System.out.println("le numero du compte destinateur : ");
                            numeroCompteDst = reader.nextLong();
                            compteDstVirement = rechercherCompteParNumero(numeroCompteDst,clients);
                            Operation operation2 = creerOperation(01,new Date(2021,11,21),new OperationType(02,"Virement","verser une somme d\'argent à un autre compte"),compteSrc,client1,montant);

                            try {
                                operation2.verserArgent(montant,compteDstVirement);
                            }catch (CompteException compteException){
                                System.out.println(compteException.getMessage());
                            }
                            for (Compte c:client1.getComptes()) {
                                if (c == compteSrc)
                                    c.getOperations().add(operation2);
                                if (c== compteDstVirement)
                                    c.getOperations().add(operation2);
                            }
                            break;
                    }
                }
            }
        }

        //affichages des opérations des comptes
        System.out.println("---------------------DETAILS DES COMPTES DES CLIENTS---------------------");
        for (Client client :clients) {
            System.out.println("Nom du Client : "+client.getNom() +" "+ client.getPrenom());
            for (Compte compte: client.getComptes()) {
                System.out.println("Numéro du compte : "+compte.getNumero());
                System.out.println("Opérations : ");
                System.out.println(" Opération |               Date               |     Type     |      Montant    ");
                int i =0;
                for (Operation op :compte.getOperations()) {
                    System.out.println("     "+i+"     |   "+op.getDate()+"  |  "+op.getType().getNom()+"    |  "+op.getMontant());
                    i++;
                }
                System.out.println("\t\t\t\t\t\t\t\tSolde : "+compte.getSolde());
            }
        }
    }

    public static Client creerClient(int id,String nom,String prenom){
        return new Client(id, nom, prenom);
    }

    public static Operation creerOperation(int id,Date date,OperationType operationType,Compte compte,Client client, double montant){
        return new Operation(id,date,operationType,compte,client,montant);
    }

    public static Compte rechercherCompteParNumero(long numero,ArrayList<Client> clients)throws CompteException{
        Compte compte = null;
        for (Client client: clients) {
            for (Compte c: client.getComptes()) {
                if (c.getNumero() == numero)
                    compte = c;
            }
        }
        if (compte==null)
            throw new CompteException("aucun compte avec ce numero n\'existe!!!");
        return compte;
    }
}
