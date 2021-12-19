
package TP3.Exercice2;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="dossier_contact")
public class DossierContact {
    List<Contact> contacts = new ArrayList<>();

    public DossierContact() {
    }

    public DossierContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void ajouterContact(String name, long phone){
        contacts.add(new Contact(name,phone));
    }

    public void supprimerContact(Contact contact){
        if (contacts.contains(contact)){
            contacts.remove(contact);
            System.out.println("le contact est supprimé avec succé");
        }else {
            System.out.println("le contact n\'existe pas dans le dossier des contacts");
        }
    }

    public Contact rechercherContact(String name){
        Contact contact = null;
        for (Contact c:contacts ) {
            if (c.getName().equals(name)) {
                contact =  c;
            }
        }
        return contact;
    }
    public void changerNumero(Contact contact,long newPhone){
        contact.setPhone(newPhone);
    }

    public void afficherContacts(){
        System.out.println("Numero |     Nom    |      Telephone       ");
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println((i+1) +"      |   "+contacts.get(i).getName()+"  |  "+contacts.get(i).getPhone());
        }
    }
}
