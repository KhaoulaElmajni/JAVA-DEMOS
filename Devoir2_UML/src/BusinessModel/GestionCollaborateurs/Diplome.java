package BusinessModel.GestionCollaborateurs;

public class Diplome {
    private int id;
    private String niveau;
    private String type;
    private Ecole ecole;

    public Diplome(int id, String niveau, String type, Ecole ecole) {
        this.id = id;
        this.niveau = niveau;
        this.type = type;
        this.ecole = ecole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }
}
