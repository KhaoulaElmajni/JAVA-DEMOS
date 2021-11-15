package BusinessModel;

import java.util.ArrayList;
import java.util.Objects;

public class Compte {
    private int id_co;
    private long numero;
    private double solde;
    private ArrayList<Operation> operations;

    //many to one
    private Client client;
    public Compte(int id_co,long numero,double solde,Client client){
        this.id_co = id_co;
        this.numero = numero;
        this.solde = solde;
        this.client = client;
        operations = new ArrayList<>();
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getId_co() {
        return id_co;
    }

    public void setId_co(int id_co) {
        this.id_co = id_co;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return id_co == compte.id_co && numero == compte.numero && Double.compare(compte.solde, solde) == 0 && Objects.equals(client, compte.client);
    }
}
