package TP3.Exo2;

public class Commande {
    private String reference;
    private Client client;
    private String date;
    private String etatCommande;

    public Commande(){
        this.reference = "";
        this.client = null;
        this.date = "";
        this.etatCommande = "";
    }
    public Commande(String reference,Client client,String date,String etatCommande){
        this.reference = reference;
        this.client = client;
        this.date = date;
        this.etatCommande = etatCommande;
    }

    @Override
    public boolean equals(Object o){
        Commande commande = (Commande) o;
        return this.reference == commande.reference && this.date == commande.date && this.etatCommande == commande.etatCommande && this.client.equals(commande.client);
    }

    @Override
    public String toString() {
        return "les informations de la Commande : " +
                "\n\treference : " + reference +
                "\n\tclient : " + client.toString() +
                "\n\tdate : " + date +
                "\n\tetatCommande : " + etatCommande;
    }
}
