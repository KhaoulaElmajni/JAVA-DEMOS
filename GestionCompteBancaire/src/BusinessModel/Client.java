package BusinessModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Client {
    private int id_c;
    private String nom;
    private String prenom;
    //one to many
    private ArrayList<Compte> comptes;

    public Client(int id_c,String nom, String prenom){
        this.id_c = id_c;
        this.nom = nom;
        this.prenom = prenom;
        this.comptes = new ArrayList<>();
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(ArrayList<Compte> comptes) {
        this.comptes = comptes;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id_c == client.id_c && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom) && Objects.equals(comptes, client.comptes);
    }


}
