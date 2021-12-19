package JAXB;

import java.io.Serializable;

public class Adresse implements Serializable{
    private String ville;
    private int numero;
    private int codePostale;

    public Adresse() {
    }

    public Adresse(String ville, int numero, int codePostale) {
        this.ville = ville;
        this.numero = numero;
        this.codePostale = codePostale;
    }


    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }
}
