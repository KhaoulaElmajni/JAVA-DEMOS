package TP3.Exo2;

public class Ligne_commande {
    private int quantite;
    private Commande commande;
    private Ordinateur ordinateur;

    public Ligne_commande(){
        this.quantite = 0;
        this.commande = null;
        this.ordinateur = null;
    }
    public Ligne_commande(int quantite,Commande commande,Ordinateur ordinateur){
        this.quantite = quantite;
        this.commande = commande;
        this.ordinateur = ordinateur;
    }

    @Override
    public String toString() {
        return "Les informations de la Ligne_commande : " +
                "\n\tquantite : " + quantite +
                "\n\tcommande : " + commande +
                "\n\tordinateur : " + ordinateur;
    }
}
