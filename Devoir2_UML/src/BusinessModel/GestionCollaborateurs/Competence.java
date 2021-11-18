package BusinessModel.GestionCollaborateurs;

public class Competence {
    private int id;
    private String nom;
    private int niveauExpertise;

    public Competence(int id, String nom, int niveauExpertise) {
        this.id = id;
        this.nom = nom;
        this.niveauExpertise = niveauExpertise;
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
}
