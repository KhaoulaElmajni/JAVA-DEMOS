package JAXB;



import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Arrays;

@XmlRootElement
public class Student implements Serializable{
    private String cne;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private double [] note;

    public Student() {
    }

    public Student(String cne, String nom, Adresse adresse, String prenom, double[] note) {
        this.cne = cne;
        this.nom = nom;
        this.adresse = adresse;
        this.prenom = prenom;
        this.note = note;
    }
    @XmlAttribute
    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlElement
    public double[] getNote() {
        return note;
    }

    public void setNote(double[] note) {
        this.note = note;
    }

    @XmlElement
    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cne='" + cne + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                ", note=" + Arrays.toString(note) +
                '}';
    }
}

