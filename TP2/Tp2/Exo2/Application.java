package Tp2.Exo2;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //String questionaire;
        //String[] tabQst = new String[5];
        //int[] tabQstRep = {1,1,2,2,2};
        int userRep;
        int userScore =0;
        Scanner reader = new Scanner(System.in);

        Reponse[] reponses1 = new Reponse[3];
        Reponse[] reponses2 = new Reponse[3];
        Reponse[] reponses3 = new Reponse[3];
        Reponse[] reponses4 = new Reponse[3];
        Reponse[] reponses5 = new Reponse[3];

        Question[] questions = new Question[5];

        reponses1[0] = new Reponse("1 : Une classe abstraite peut contenir du code dans le corp des méthodes qui possède ce qui n’est pas autorisé dans une interface",true);
        reponses1[1] = new Reponse("2 : Se sont les memes",false);
        reponses1[2] = new Reponse("3 : Tous ce qui précéde est vrai",false);
        Question question1 = new Question("Interface Vs Abstract","Quelle est la différence entre une interface et une classe abstraite?",4, reponses1);

        reponses2[0] = new Reponse("1 : Si nous affectons un objet de superclasse à une variable d’un type de sous-classe nous devons effectuer une conversion explicite",true);
        reponses2[1] = new Reponse("2 :  nous affectons un objet de superclasse à une variable d’un type de sous-classe nous devons effectuer une conversion implicite",false);
        reponses2[2] = new Reponse("3 : Tous ce qui précéde est vrai",false);
        Question question2 = new Question("Casting implicite Vs explicite","Comment savez-vous si un casting d’objet explicite est nécessaire?",4, reponses2);

        reponses3[0] = new Reponse("1 : Il n’est appelé qu’une seule fois alors qu’une méthode peut être appelée plusieurs fois.",false);
        reponses3[1] = new Reponse("2 : Un constructeur doit avoir le même nom que la classe et ne peuvent pas renvoyer de valeur.",true);
        reponses3[2] = new Reponse("3 : Tous ce qui précéde est vrai",false);
        Question question3 = new Question("Constructeur Vs Methode","Quelle est la différence entre un constructeur et une méthode?",4, reponses3);

        reponses4[0] = new Reponse("1 : Non c\'est impossible",false);
        reponses4[1] = new Reponse("2 : oui Nous Ajoutons une méthode main() à l’applet.",true);
        reponses4[2] = new Reponse("3 : il y a une possibilite",false);
        Question question4 = new Question("Classe"," Pouvez-vous écrire une classe Java qui pourrait être utilisée à la fois comme une applet et comme une application?",4, reponses4);

        reponses5[0] = new Reponse("1 : il permet de protéger les données uniquement",false);
        reponses5[1] = new Reponse("2 : il est inutile",false);
        reponses5[2] = new Reponse("3 : C’est un moyen d’organiser des fichiers lorsqu’un projet consiste en plusieurs modules.",true);
        Question question5 = new Question("Package","Expliquer l’utilisation des packages dans Java ?",4, reponses4);

        questions[0] = question1;
        questions[1] = question2;
        questions[2] = question3;
        questions[3] = question4;
        questions[4] = question5;

        Questionnaire questionnaire1 = new Questionnaire("POO JAVA",questions);

        //questionaire = questionnaire1.toString();
        //tabQst = questionaire.split(",");


        /*for (int i = 0; i < 5; i++) {
            System.out.println(tabQst[i]);
            System.out.print("veulliez saisir le numero de votre choix : ");
            do {
                userRep = reader.nextInt();
                if (userRep!=1 || userRep!=2 || userRep!=3)
                    System.out.println("Oops!!!\nle choix que vous avez entré n\'est pas valide.\nveuillez saisir un des choix 1,2 et 3");
            }while (userRep!=1 || userRep!=2 || userRep!=3);
            if (userRep == tabUserRep[i])
                userScore+=4;
        }*/

        ///System.out.println("votre score est : "+userScore);
        //int i=0;
        System.out.println("\tBienvenue dans votre Jeu du Questionaire\nIndication du Jeu : \n\tchaque questionnaire a 5 questions\n\tchaque question a 3 choix des reponses\n\tvous devez entrer le choix de reponse qui vous semble correcte\n\tchaque question correcte a pour 4 points\n\tvotre score final va etre affiche a la fin du quesionnaire\nBONNE CHANCE (^_^)!\n");
        System.out.println(questionnaire1.toString());

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+" "+questionnaire1.getQuestions()[i].toString());
            System.out.println(questionnaire1.getQuestions()[i].getDescription());
            for (int j = 0; j < 3; j++) {
                System.out.println(questionnaire1.getQuestions()[i].getReponses()[j].toString());
            }
            System.out.println("veulliez saisir le numero de votre choix : ");
            do {
                userRep = reader.nextInt();
                if (userRep!=1 & userRep!=2 & userRep!=3)
                    System.out.println("Oops!!!\nle choix que vous avez entré n\'est pas valide.\nveuillez saisir un des choix 1,2 et 3");
            }while (userRep!=1 & userRep!=2 & userRep!=3);

                if (questionnaire1.getQuestions()[i].getReponses()[userRep-1].getCorrecte() == true){
                    userScore+=questionnaire1.getQuestions()[i].getScore();
            }
        }
        /*for (String qst: tabQst) {
            System.out.println(qst);
        }*/
        if (userScore>10)
            System.out.println("Bien joue cher joueur\nvotre score est :"+userScore);
        else
            System.out.println("Malheureusement ! votre score est : "+userScore);

        System.out.println("******************La correction du Questionnaire : **************************\n");
        for (int i = 0; i <5 ; i++) {
            System.out.println(questionnaire1.getQuestions()[i].getDescription());
            for (int j = 0; j < 3; j++) {
                if (questionnaire1.getQuestions()[i].getReponses()[j].getCorrecte() == true){
                    System.out.println(questionnaire1.getQuestions()[i].getReponses()[j]);
                }
            }
        }
    }
}
