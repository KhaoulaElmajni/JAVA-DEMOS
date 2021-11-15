import java.util.Scanner;

public class TableauTrie {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] tabTrie = new int[100];
        int elem;
        int choix;
        while (true){
            System.out.println("Bonjour dans votre application de traitement des tableaux d\'entiers!");
            System.out.println("voici le menu de choix des operations offertes par cette application : \n\tTaper 1 pour ajouter un entier\n\tTaper 2 pour supprimer un element\n\tTaper 3 pour afficher le tableau\n\tTaper 4 pour quitter");
            System.out.println("taper un choix");
            choix = reader.nextInt();
            //reader.nextLine();

            switch (choix){
                case 1:
                    elem=reader.nextInt();
                    if (tabTrie.length == 0)
                        tabTrie[0] = elem;
                    else
                        for (int i = 0; i < tabTrie.length; i++) {
                            if (elem<tabTrie[i]){
                                for (int j = tabTrie.length+1; j > i; j--) {
                                    tabTrie[j]=tabTrie[j-1];
                                }
                                tabTrie[i]=elem;
                            }
                            if (elem==tabTrie[i]){
                                for (int j = tabTrie.length+1; j > i; j--) {
                                    tabTrie[j]=tabTrie[j-1];
                                }
                                tabTrie[i+1]=elem;
                            }
                            if (elem>tabTrie[i]){
                                tabTrie[i]=elem;
                            }
                        }
                    ;break;
                case 2: reader.nextLine();
                    System.out.println("quel est l\'indice de l\'elemnet a supprimer");
                    int indice=reader.nextInt();
                    if (indice>tabTrie.length)
                        System.out.println("l\'indice saisi ne se trouve pas au tableau!!");
                    else {
                        for (int i = 0; i < tabTrie.length; i++) {
                            if (i==indice){
                                tabTrie[indice]=tabTrie[i+1];
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("{ ");
                    for(int elt:tabTrie) {
                        System.out.print(elt+" ");
                    }
                    System.out.println(" }");
                    break;
                case 4:
                    reader.nextLine();
                    break;
                default:
                    System.out.println("Frappez une touche pour revenir au menu");break;
            }
            reader.nextLine();
        }
    }
}
