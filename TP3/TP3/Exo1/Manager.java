package TP3.Exo1;

public class Manager extends Employe{
    private String service;
    public Manager(){
        super();
        this.service = "";
    }

    public Manager(String nom,String prenom,String telephone,String email,double salaire,String service){
        super(nom, prenom,telephone,email,salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return this.getSalaire()+(this.getSalaire()*0.20);
    }

    @Override
    public void afficher() {
        System.out.println("Les informations du manager : ");
        System.out.println("\tNom : "+this.getNom()+"\n\tPrenom : "+this.getPrenom()+"\n\tTelephone : "+this.getTelephone()+"\n\tEmail : "+this.getEmail()+"\n\tSalaire : "+this.getSalaire()+"\n\tService : "+this.service);
    }
}
