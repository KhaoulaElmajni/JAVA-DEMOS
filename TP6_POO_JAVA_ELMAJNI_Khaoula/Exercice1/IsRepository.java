package TP3.Exercice1;

import java.io.File;
import java.util.Scanner;

public class isRepository {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String chemin1,chemin2, chemin3 ;
        System.out.println("veuillez entrer Le chemin complet du répertoire que vous voulez lister son contenu : ");
        chemin1 = reader.nextLine();

            ls(chemin1);
        }
    public static void ls(String chemin){
        String chemin1,chemin2, chemin3 ;
        File file = new File(chemin);
        chemin3=chemin2= chemin;
        String contenu[] = file.list();
        String contenu2[];
        for (int i = 0; i < contenu.length; i++) {
            if(new File(file.getAbsolutePath()+"/"+contenu[i]).isDirectory()){
                chemin2 +="/"+contenu[i]+"/<DIR>";
                if (new File(file.getAbsolutePath()+"/"+contenu[i]).canRead())
                    chemin2 +=" r";
                if (new File(file.getAbsolutePath()+"/"+contenu[i]).canWrite())
                    chemin2 +="w";
                if (new File(file.getAbsolutePath()+"/"+contenu[i]).canExecute())
                    chemin2 +="x";

                chemin2 +="-";
                System.out.println(chemin2);
                System.out.println("__________________________________SUB FILES OF DIR "+contenu[i]+"__________________________________");
                ls(file+"/"+contenu[i]);
                System.out.println("__________________________________END OF SUB DIR "+contenu[i]+"__________________________________");
            }else {

                chemin2 +="/"+contenu[i]+"/<FICH>";
                if (new File(file.getAbsolutePath()+"/"+contenu[i]).isHidden())
                    chemin2 = chemin2+" h";
                if (new File(file.getAbsolutePath()+"/"+contenu[i]).canRead())
                    chemin2 = chemin2+" r";
                if (new File(file.getAbsolutePath()+"/"+contenu[i]).canWrite())
                    chemin2 +="w";
                if (new File(file.getAbsolutePath()+"/"+contenu[i]).canExecute())
                    chemin2 +="x";

                chemin2 +="-";
                System.out.println(chemin2);

            }
            chemin2 = chemin;
        }
    }
}

