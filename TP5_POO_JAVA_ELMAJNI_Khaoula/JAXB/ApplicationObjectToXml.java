package JAXB;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationObjectToXml {

        public static void main(String[] args) throws Exception{

            Scanner reader = new Scanner(System.in);
            String nom, prenom, cne,ville;

            int i=0,nbrStd,numero,nbrNote,codePostale;
            double []notes;


            System.out.print("Bonjour donner le nombre des étudiants vous voulez : ");
            nbrStd = reader.nextInt();

            Classe classe = new Classe();
            while (i<nbrStd){
                reader.nextLine();
                System.out.println("les données de l'étudiant "+ (i+1) +" ");
                System.out.println("entrer le nom d\'etudiant  : ");
                nom = reader.nextLine();
                System.out.println("entrer le prenom d\'etudiant  : ");
                prenom = reader. nextLine();
                System.out.println("entrer le cne d\'etudiant  : ");
                cne = reader.nextLine();
                System.out.println("entrer la ville d\'etudiant  : ");
                ville = reader.nextLine();
                System.out.println("entrer le code postal d\'etudiant  : ");
                codePostale = reader.nextInt();
                System.out.println("entrer le numero d\'etudiant  : ");
                numero = reader.nextInt();
                Adresse adresse = new Adresse(ville,numero,codePostale);
                System.out.println("entrer le nombre des notes d\'etudiant  : ");
                nbrNote = reader.nextInt();
                notes = new double[nbrNote];
                for (int j=0;j<nbrNote;j++){
                    System.out.println("\tla note "+ (j+1)+" : ");
                    notes[j]=reader.nextDouble();
                }
                classe.addStudent(new Student(cne,nom,adresse,prenom,notes));
                i++;

            }



            JAXBContext contextObj = JAXBContext.newInstance(Classe.class);
            Marshaller marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshallerObj.marshal(classe, new File("classe.xml"));



    }
}
