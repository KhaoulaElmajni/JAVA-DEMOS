package BusinessModel;

public class OperationType {
    private int id_ot;
    private String nom;
    private String description;

    public OperationType(int id_ot, String nom, String description) {
        this.id_ot = id_ot;
        this.nom = nom;
        this.description = description;
    }

    public int getId_ot() {
        return id_ot;
    }

    public void setId_ot(int id_ot) {
        this.id_ot = id_ot;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
