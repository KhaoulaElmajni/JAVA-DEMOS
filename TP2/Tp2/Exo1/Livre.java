package Tp2.Exo1;

public class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur ;
    public Livre(String nom,String prenom,String email,String tel,int age,int numAuteur,int ISBN,String titre){
        auteur = new Auteur(nom,prenom,email,tel,age,numAuteur);
        this.ISBN = ISBN;
        this.titre = titre;
    }
    public void afficher(){
        System.out.println("Les informations du livre : ");
        auteur.afficher();
        System.out.println("\tISBN : "+this.ISBN+"\n\ttitre : "+this.titre);
    }
}
