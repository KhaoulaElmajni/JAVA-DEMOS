package Tp2.Exo2;

public class Reponse {
    private String titre;
    private boolean correcte;

    public Reponse(String titre,boolean correcte){
        this.titre = titre;
        this.correcte = correcte;
    }

    @Override
    public String toString() {
        return "\t" + titre;
    }
    boolean getCorrecte(){
        return this.correcte;
    }
}
