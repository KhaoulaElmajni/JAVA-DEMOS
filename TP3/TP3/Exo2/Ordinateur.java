package TP3.Exo2;

public class Ordinateur {
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nbrStock;
    private Categorie categorie;

    public Ordinateur(){
        this.nom = "";
        this.marque = "";
        this.prix = prix;
        this.description = "";
        this.nbrStock = 0;
        this.categorie = null;
    }
    public Ordinateur(String nom,String marque,double prix,String description,int nbrStock,Categorie categorie){
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbrStock = nbrStock;
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o){
        Ordinateur ordinateur = (Ordinateur) o;
        return this.nom == ordinateur.nom && this.marque ==ordinateur.marque && this.prix == ordinateur.prix && this.description == ordinateur.description && this.nbrStock == ordinateur.nbrStock && this.categorie == ordinateur.categorie;
    }

    public double getPrix(){
        return this.prix;
    }

    @Override
    public String toString() {
        return "les informations d\'Ordinateur : " +
                "\n\tnom : " + nom +
                "\n\tmarque : " + marque + '\'' +
                "\n\tprix : " + prix +
                "\n\tdescriptio : " + description + '\'' +
                "\n\tnbrStock : " + nbrStock +
                "\n\tcategorie : " + categorie ;
    }
}
