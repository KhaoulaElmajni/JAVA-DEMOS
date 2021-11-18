package BusinessModel.GestionCollaborateurs;

import java.util.ArrayList;

public class Site {
    private int id;
    private String nom;
    private String local;
    private ArrayList<Collaborateur> collaborateurs;

    public Site(int id, String nom, String local) {
        this.id = id;
        this.nom = nom;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<Collaborateur> getCollaborateurs() {
        return collaborateurs;
    }

    public void setCollaborateurs(ArrayList<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }
}
