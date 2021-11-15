package Tp2.Exo1;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;
    public Personne(){
        this.nom = null;
        this.prenom = null;
        this.email = null;
        this.tel = null;
        this.age = 0;
    }
    public Personne(String nom,String prenom,String email,String tel,int age){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }
    public void afficher(){
        System.out.println("\tNom : "+this.nom+"\n\tPrenom : "+this.prenom+"\n\tEmail : "+this.email+"\n\tTelephone : "+this.tel+"\n\tAge : "+this.age);
    }


}
