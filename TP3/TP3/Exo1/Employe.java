package TP3.Exo1;

public abstract class Employe {
    private String nom;
    private String prenom;
    public String telephone;
    private String email;
    private double salaire;
    public Employe(){
        this.nom = "";
        this.prenom = "";
        this.telephone = "";
        this.email = "";
        this.salaire = 0;
    }
    public Employe(String nom,String prenom,String telephone,String email,double salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.salaire = salaire;
    }
    public abstract double calculerSalaire();
    public abstract void afficher();
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String getTelephone(){
        return this.telephone;
    }
    public  String getEmail(){
        return this.email;
    }
    public double getSalaire(){
        return this.salaire;
    }
}
