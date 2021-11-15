package Tp2.Exo1;

public class Application {
    public static void main(String[] args) {
        Adherent adherent1 = new Adherent("elmajni","khaoula","elmajnikhaoula99@gmail.com","+212639127097",22,01);
        adherent1.afficher();
        Livre livre1 = new Livre("elmajni","khaoula","elmajnikhaoula99@gmail.com","+212639127097",22,02,0001,"die empty");
        livre1.afficher();
    }
}
