package Tp2.Exo2;

import java.util.Arrays;

public class Question {
    private String titre;
    private String description;
    private Reponse[] reponses;
    private int score;
    public Question(String titre,String description,int score,Reponse[] reponses){
        this.titre = titre;
        this.description = description;
        this.reponses = reponses;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Question a propos de \'" + titre +"\'";
    }
    Reponse[] getReponses(){
        return this.reponses;
    }
    String getDescription(){
        return this.description;
    }
    int getScore(){
        return this.score;
    }
}
