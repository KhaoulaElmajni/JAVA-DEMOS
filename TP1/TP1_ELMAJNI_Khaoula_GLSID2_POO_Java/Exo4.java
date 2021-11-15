import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String verbe;
        String[] pronoms = new String[]{"je","tu","il/elle","nous","vous","ils/elles"};
        String[] term = new String[]{"e","es","e","ons","ez","ent"};

        do{
            System.out.println("Entrez un verbe du premier groupe : chanter ");
            verbe = reader.nextLine();
            if(!verbe.endsWith("er"))
                System.out.println("fait attention!\nle verbe doit se terminer par er et => doit etre un verbe régulier");
        }while (!verbe.endsWith("er"));
        StringBuilder verbeBuilder = new StringBuilder(verbe);
        verbeBuilder = verbeBuilder.deleteCharAt(verbe.length()-1);
        verbeBuilder = verbeBuilder.deleteCharAt(verbe.length()-2);

        for (int i = 0; i < 6; i++) {
            System.out.println(pronoms[i] +" "+ verbeBuilder + term[i]);
        }
    }
}
