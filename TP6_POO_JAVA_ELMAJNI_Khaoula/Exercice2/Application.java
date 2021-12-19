package TP3.Exercice2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
       try{
           Scanner reader = new Scanner(System.in);
           int choix;
           String nom;

           DossierContact dossierContact = new DossierContact();

           dossierContact.ajouterContact("khaoula",0600000000l);
           dossierContact.ajouterContact("amine",0600005000l);
           dossierContact.ajouterContact("amine",0600005000l);
           dossierContact.ajouterContact("nouhaila",0600110203l);


           JAXBContext context = JAXBContext.newInstance(DossierContact.class);
           Marshaller marshaller = context.createMarshaller();
           marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
           Unmarshaller unmarshaller = context.createUnmarshaller();
           dossierContact = (DossierContact) unmarshaller.unmarshal(new File("dossierContact.xml"));

           System.out.println("_____________________Bienvenue dans votre espace de gestion des contacts_____________________");
           System.out.println("Menu: veuillez saisir un numero de choix parmi les suivants\n\t1.Rechercher un numéro de téléphone\n\t2.Ajouter un nouveau contact\n\t3.Supprimer un contact\n\t4.Changer le numéro de téléphone d’un contact\n\t5.Afficher la liste des contacts\n\t6.Quitter ce programme");

           while (true){
               System.out.println("Veuillez saisir votre choix :");
               choix = reader.nextInt();
               switch (choix){
                   case 1:
                       System.out.println("veuillez saisir le nom du contact recherche : ");
                       reader.nextLine();
                       nom = reader.nextLine();
                       Contact contact = dossierContact.rechercherContact(nom);
                       System.out.println(contact.getName());
                       if (contact!=null){
                           System.out.println("ce contact existe dans le dossier des contacts, voici ses details :");
                           System.out.println("name : "+contact.getName()+"\nphone : "+ contact.getPhone());
                       }else
                           System.out.println("Oups!! aucun contact avec ce nom n\'existe");
                       break;
                   case 2:
                       String name;
                       long phone;
                       System.out.println("veuillez saisir les coordonnées du contact à ajouter");
                       System.out.print("name : ");
                       reader.nextLine();
                       name = reader.nextLine();
                       System.out.print("phone : ");
                       phone = reader.nextInt();
                       dossierContact.ajouterContact(name,phone);
                       break;
                   case 3:
                       String name1;
                       System.out.println("veuillez saisir le nom du contact à supprimer :");
                       reader.nextLine();
                       name1 = reader.nextLine();
                       Contact contact2 = dossierContact.rechercherContact(name1);
                       dossierContact.supprimerContact(contact2);
                       break;
                   case 4:
                       System.out.println("veuillez saisir le nom du contact concerné par la modification: ");
                       reader.nextLine();
                       String name2 = reader.nextLine();
                       Contact c = dossierContact.rechercherContact(name2);
                       if(c != null){
                           System.out.println("entrer le nouveau numero : ");
                           for (int i = 0; i < dossierContact.getContacts().size(); i++) {
                               if (c.equals(dossierContact.getContacts().get(i)))
                                   dossierContact.getContacts().get(i).setPhone(reader.nextLong());
                           }
                       }
                       break;
                   case 5:
                       System.out.println("voici la liste des contacts dans le dossier des contacts : ");
                       dossierContact.afficherContacts();break;
                   case 6 :System.exit(0);
                   default:break;
               }
               marshaller.marshal(dossierContact,new File("dossierContact.xml"));
           }
       }catch (JAXBException e){
           System.out.println(e.getMessage());
       }
    }
}
