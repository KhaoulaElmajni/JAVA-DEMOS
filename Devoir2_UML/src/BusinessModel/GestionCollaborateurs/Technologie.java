package BusinessModel.GestionCollaborateurs;

import java.util.ArrayList;

public class Technologie {
    private int id;
    private String nom;
    private int niveauExpertise;
    private ArrayList<Collaborateur> collaborateurs;

    public Technologie(int id, String nom, int niveauExpertise) {
        this.id = id;
        this.nom = nom;
        this.niveauExpertise = niveauExpertise;
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

    public int getNiveauExpertise() {
        return niveauExpertise;
    }

    public void setNiveauExpertise(int niveauExpertise) {
        this.niveauExpertise = niveauExpertise;
    }

    public ArrayList<Collaborateur> getCollaborateurs() {
        return collaborateurs;
    }

    public void setCollaborateurs(ArrayList<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }
}
