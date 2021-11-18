package BusinessModel.GestionCollaborateurs;

public class Salaire {
    private int id;
    private double montant;

    public Salaire(int id, double montant) {
        this.id = id;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
