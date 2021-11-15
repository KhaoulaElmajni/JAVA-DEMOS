package TP3.Exo1;

public class Application {
    public static void main(String[] args) {
        Employe ingenieur1 = new Ingenieur("ELMAJNI","Khaoula","212639127097","elmajnikhaoula99@gmail.com",20000,"GLSID");
        Employe manager1 = new Manager("ELMAJNI","Khaoula","212639127097","elmajnikhaoula99@gmail.com",20000,"SSDIA");
        ingenieur1.afficher();
        manager1.afficher();
    }
}
