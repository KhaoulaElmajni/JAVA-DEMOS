package BusinessModel;

import Exceptions.CompteException;

import java.util.Date;
import java.util.Iterator;

public class Operation {
    private int id_o;
    private Date date;
    private OperationType type;
    private Compte compte;
    private Client client;
    private double montant;

    public Operation(int id_o, Date date, OperationType type, Compte compte, Client client, double montant) {
        this.id_o = id_o;
        this.date = date;
        this.type = type;
        this.compte = compte;
        this.client = client;
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public Operation(int id_o,Date date,OperationType type){
        this.id_o = id_o;
        this.date = date;
        this.type = type;
    }

    public int getId_o() {
        return id_o;
    }

    public void setId_o(int id_o) {
        this.id_o = id_o;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public boolean verserArgent(double montant,Compte compte_virement) throws CompteException {
        Iterator iterator = this.client.getComptes().iterator();
        Compte compteTmp = null;
        while (iterator.hasNext()){
            if (iterator.next().equals(this.compte)){
                compteTmp = compte;
                break;
            }
        }
        if (compteTmp!=null){
            if (this.compte.getSolde() >= montant){
                compte_virement.setSolde(compte_virement.getSolde() + montant);
                this.compte.setSolde(this.compte.getSolde() - montant);
                return true;
            }else {
                throw new CompteException("oups!!!\nle solde de ce client n\'est pas suffisant");
            }
        }else {
            throw new CompteException("oups!!!\nle compte n'appartient pas au client spécifié!!!");
        }
    }
    public boolean retirerArgent(double montant) throws CompteException{
        Iterator iterator = this.client.getComptes().iterator();
        Compte compteTmp = null;
        while (iterator.hasNext()){
            if (iterator.next().equals(this.compte)){
                compteTmp = compte;
                break;
            }
        }
        if (compteTmp!=null){
            if (this.compte.getSolde() >= montant){
                this.compte.setSolde(this.compte.getSolde() - montant);
                return true;
            }else {
                System.out.println(this.client.getComptes().get(1).getSolde()+" "+this.client.getComptes().get(1).getNumero());
                throw new CompteException("oups!!!\nle solde de ce client n\'est pas suffisant");
            }
        }else {
            throw new CompteException("oups!!!\nle compte n'appartient pas au client spécifié!!!");
        }
    }

}
