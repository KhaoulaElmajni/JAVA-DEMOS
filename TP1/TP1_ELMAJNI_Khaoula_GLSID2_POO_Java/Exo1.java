import java.util.Arrays;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        // write your code here
        int nbr_notes, nb_etudiants=0;
        double moyenne=0,max,min;
        double note;
        String name;
        Scanner reader = new Scanner(System.in);
        System.out.println("veuillez entrer le nombre des notes : ");
        nbr_notes = reader.nextInt();
        double[] notes = new double[nbr_notes];

        for (int i=0;i<notes.length;i++){
            System.out.println("veuillez entrer note numero " + (i+1) + " : " );
            notes[i] = reader.nextDouble();
        }

        System.out.println("la lIste des notes : ");
        System.out.print("{ ");
        for (int i=0;i<notes.length;i++){
            System.out.print(notes[i] + " ");

        }
        System.out.print(" }");
        System.out.println("\nLa liste aprés le trie :");
        Arrays.sort(notes);
        System.out.print("{ ");
        for(double not:notes) {
            System.out.print(not+ " ");
        }
        System.out.print(" }");

        //calcule de la moyenne
        for(double not:notes) {
            moyenne +=not;
        }
        moyenne /=notes.length;
        System.out.println("\nla note moyenne est : "+moyenne);

        //calcul de note max
        max=min=notes[0];
        for(double not:notes) {
            if (max<not)
                max = not;
            if (min>not)
                min = not;
        }

        System.out.println("la note maximale est : "+max+"\nla note minimale est : "+min);
        System.out.println("veuillez saisir la note chercher : ");
        note = reader.nextDouble();
        for (double not:notes) {
            if(not == note)
                nb_etudiants++;
        }
        System.out.println("le nombre des etudiants ayant la note "+note+" est : "+nb_etudiants);
    }
}
