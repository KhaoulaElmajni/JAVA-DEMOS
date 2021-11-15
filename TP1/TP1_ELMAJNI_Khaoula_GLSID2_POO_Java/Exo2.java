import java.util.Arrays;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choix;
        String chaine = "";


//pour s'assurer que les espacces a gauche et a droite suppr
        //System.out.println(Arrays.toString(ch.toString(ch.trim().split(" "))));


        while (true){
            System.out.println("Bonjour dans votre application de traitement des chaines de caracteres!");
            System.out.println("voici le menu de choix des operations offertes par cette application : \n\tTaper 1 pour saisir une chaine de caracteres\n\tTaper 2 pour pour afficher la chaine saisie\n\tTaper 3 pour inverser la chaine saisie\n\tTaper 4 pour compter les mots de la chaine de caracteres");
            choix = reader.nextInt();

            switch (choix){
                case 1:reader.nextLine();
                    chaine = reader.nextLine();break;
                case 2: reader.nextLine();
                    System.out.println(chaine);break;
                case 3:
                    StringBuilder chaineB = new StringBuilder(chaine);
                    chaine = chaineB.reverse().toString();
                    System.out.println(chaine);break;
                case 4:
                    String[] mots = chaine.split(" ");
                    System.out.println("le nombre des mots dans la chaine saisie est : "+mots.length);
                    break;
                default:
                    System.out.println("Frappez une touche pour revenir au menu");break;
            }
            reader.nextLine();
        }
    }
}
