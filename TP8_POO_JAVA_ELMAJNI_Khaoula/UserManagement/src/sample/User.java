package sample;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;


public class User implements Comparable, Serializable {
    private final SimpleStringProperty nom = new SimpleStringProperty("");
    private final SimpleStringProperty prenom = new SimpleStringProperty("");
    private final SimpleStringProperty adresse = new SimpleStringProperty("");
    private final SimpleStringProperty login = new SimpleStringProperty("");
    private final SimpleStringProperty password = new SimpleStringProperty("");


    public User(String nom, String prenom, String adresse, String login, String password) {
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
        setLogin(login);
        setPassword(password);
    }


    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public String getAdresse() {
        return adresse.get();
    }

    public void setAdresse(String adresse) {
        this.adresse.set(adresse);
    }

    public String getLogin() {
        return login.get();
    }

    public void setLogin(String login) {
        this.login.set(login);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    /*@Override
    public String toString() {
        return
                "nom = " + nom +
                ", prenom = " + prenom +
                ", adresse = " + adresse +
                ", email = " + login +
                ", password = " + password;
    }*/

    @Override
    public int compareTo(Object o) {
        User user = (User)o;
        if (this.nom.equals(user.getNom()))
            return 0;

        return 0;
    }
    @Override
    public String toString(){
        return "{user: \n\tnom : " +this.getNom()+";\n\tprenom : "+this.getPrenom()
                +";\n\tadresse : " +this.getAdresse()+";\n\tlogin : "+this.getLogin()+
                ";\n\tpassword : " +this.getPassword()+"\n}";
    }
}
