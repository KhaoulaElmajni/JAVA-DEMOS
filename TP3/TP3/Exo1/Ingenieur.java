package TP3.Exo1;

public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(){
        super();
        this.specialite = "";
    }
    public Ingenieur(String nom,String prenom,String telephone,String email,double salaire,String specialite){
        super(nom, prenom,telephone,email,salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return this.getSalaire()+(this.getSalaire()*0.15);
    }

    @Override
    public void afficher() {
        System.out.println("Les informations d\'Ingenieur : ");
        System.out.println("\tNom : "+this.getNom()+"\n\tPrenom : "+this.getPrenom()+"\n\tTelephone : "+this.getTelephone()+"\n\tEmail : "+this.getEmail()+"\n\tSalaire : "+this.getSalaire()+"\n\tSpecialite : "+this.specialite);
    }

}
