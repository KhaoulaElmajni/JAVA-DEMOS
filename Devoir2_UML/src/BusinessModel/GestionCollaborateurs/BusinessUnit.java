package BusinessModel.GestionCollaborateurs;

import java.util.ArrayList;

public class BusinessUnit {
    private int id;
    private String nom;
    private ArrayList<Collaborateur> collaborateurs;

    public BusinessUnit(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.collaborateurs = new ArrayList<>();
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

    public ArrayList<Collaborateur> getCollaborateurs() {
        return collaborateurs;
    }

    public void setCollaborateurs(ArrayList<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }
}
