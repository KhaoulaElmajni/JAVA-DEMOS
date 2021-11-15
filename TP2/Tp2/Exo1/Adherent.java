package Tp2.Exo1;

public class Adherent extends Personne{
    private int numAdherent;
    public Adherent(String nom,String prenom,String email,String tel,int age,int numAdherent){
        super(nom,prenom,email,tel,age);
        this.numAdherent = numAdherent;
    }
    public void afficher(){
        System.out.println("Les infos d\'adherant : ");
        super.afficher();
        System.out.println("\tnumero d\'adheration : "+this.numAdherent);
    }
}
