import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String ch ;
        char[] chars =new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] nb_occurrences = new int[26];

        System.out.println("Entrez une ligne de texte (max 100 caractères) : ");

        ch = reader.nextLine();
        for (int i = 0; i < 26; i++) {
            nb_occurrences[i]=compterOccurrences(ch,chars[i]);
        }
        System.out.println("la chaine "+ch+" contient :");
        for (int i = 0; i < 26; i++) {
            if(nb_occurrences[i]!=0)
                System.out.println(nb_occurrences[i]+" fois la lettre : "+chars[i]);
        }
    }
    public static int compterOccurrences(String ch, char recherche)
    {
        int nbr = 0;
        for (int i=0; i < ch.length(); i++){
            if (ch.charAt(i) == recherche)
                nbr++;
        }
        return nbr;
    }
}
