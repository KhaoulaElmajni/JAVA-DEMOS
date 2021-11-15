package Tp2.Exo2;

import java.util.Arrays;
import java.util.Scanner;

public class Questionnaire {
    Scanner reader = new Scanner(System.in);
    private String titre;
    private Question[] questions;
    public Questionnaire(String titre,Question[] questions){
        this.titre = titre;
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "\t\t\t\tQuestionnaire a propos du Theme : " + titre +"\n";
    }

    Question[] getQuestions(){
        return this.questions;
    }
}
