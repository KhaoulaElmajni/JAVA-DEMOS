package Tp2.Exo1;

public class Auteur extends Personne{
    private int numAuteur;
    public Auteur(){
        super();
        this.numAuteur = 0;
    }
   /* public Auteur(Auteur auteur){
        super(auteur);
    }*/
    public Auteur(String nom,String prenom,String email,String tel,int age,int numAuteur){
        super(nom,prenom,email,tel,age);
        this.numAuteur = numAuteur;
    }
    public void afficher(){
        System.out.println("Les infos d\'auteur : ");
        super.afficher();
        System.out.println("\tnumero d\'auteur : "+this.numAuteur);
    }
}
