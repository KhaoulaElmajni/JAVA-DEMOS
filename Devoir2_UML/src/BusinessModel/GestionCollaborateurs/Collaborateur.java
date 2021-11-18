package BusinessModel.GestionCollaborateurs;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Collaborateur extends Personne{
    Scanner reader = new Scanner(System.in);
    private String ancienManagerRH;
    private String managerRHActuel;
    private char sexe;
    private Date dateEmbauche;
    private Date dateDepart;
    private boolean ancienCollab;
    private boolean estManagerRH;
    private BusinessUnit BU;
    private ArrayList<Poste> postes;
    private Poste posteActuel;
    private ArrayList<Diplome> diplomes;
    private ArrayList<Technologie> technologies;
    private ArrayList<Competence> competences;
    private ArrayList<Salaire> salaires;
    private Salaire salaireActuel;
    private Site site;


    private ArrayList<Collaborateur> collabsManagerRH = new ArrayList<>();



    public Collaborateur(long matricule, String nom, String prenom,char sexe, Date dateEmbauche,BusinessUnit BU,Poste poste,Diplome diplome,Technologie technologie,Competence competence,Salaire salaire,Site site) {
        super(matricule, nom, prenom);
        this.ancienManagerRH = "";
        this.managerRHActuel = "";
        this.sexe = sexe;
        this.dateEmbauche = dateEmbauche;
        this.dateDepart = null;
        this.ancienCollab = false;
        this.estManagerRH = false;
        this.BU = BU;
        this.postes = new ArrayList<>();
        this.postes.add(poste);
        this.posteActuel = poste;
        this.diplomes = new ArrayList<>();
        this.diplomes.add(diplome);
        this.technologies = new ArrayList<>();
        this.technologies.add(technologie);
        this.competences = new ArrayList<>();
        this.salaires = new ArrayList<>();
        this.salaires.add(salaire);
        this.salaireActuel = salaire;
        this.site = site;
    }


    public BusinessUnit getBU() {
        return BU;
    }

    public void setBU(BusinessUnit BU) {
        this.BU = BU;
    }

    public ArrayList<Poste> getPostes() {
        return postes;
    }

    public void setPostes(ArrayList<Poste> postes) {
        this.postes = postes;
    }

    public Poste getPosteActuel() {
        return posteActuel;
    }

    public void setPosteActuel(Poste posteActuel) {
        this.posteActuel = posteActuel;
    }

    public ArrayList<Diplome> getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(ArrayList<Diplome> diplomes) {
        this.diplomes = diplomes;
    }

    public ArrayList<Technologie> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(ArrayList<Technologie> technologies) {
        this.technologies = technologies;
    }

    public ArrayList<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(ArrayList<Competence> competences) {
        this.competences = competences;
    }

    public ArrayList<Salaire> getSalaires() {
        return salaires;
    }

    public void setSalaires(ArrayList<Salaire> salaires) {
        this.salaires = salaires;
    }

    public Salaire getSalaireActuel() {
        return salaireActuel;
    }

    public void setSalaireActuel(Salaire salaireActuel) {
        this.salaireActuel = salaireActuel;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getAncienManagerRH() {
        return ancienManagerRH;
    }

    public void setAncienManagerRH(String ancienManagerRH) {
        this.ancienManagerRH = ancienManagerRH;
    }

    public String getManagerRHActuel() {
        return managerRHActuel;
    }

    public void setManagerRHActuel(String managerRHActuel) {
        this.managerRHActuel = managerRHActuel;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public boolean isAncienCollab() {
        return ancienCollab;
    }

    public void setAncienCollab(boolean ancienCollab) {
        this.ancienCollab = ancienCollab;
    }

    public boolean isEstManagerRH() {
        return estManagerRH;
    }

    public void setEstManagerRH(boolean estManagerRH) {
        this.estManagerRH = estManagerRH;
    }

    public void setCollabsManagerRH(ArrayList<Collaborateur> collabsManagerRH) {
        this.collabsManagerRH = collabsManagerRH;
    }

    public ArrayList<Collaborateur> getCollabsManagerRH() {
        return collabsManagerRH;
    }

    //fct pour rechercher un collaborateur dans la liste des collaborateurs gérés par un manager RH
    public Collaborateur rechercherCollab(Collaborateur collaborateur){
        for (Collaborateur c: this.getCollabsManagerRH()) {
            if (c.equals(collaborateur)){
                return c;
            }
        }
        return null;
    }

    //fct pour la màj des infos du collaborateur par le manager RH selon le hoix des infos
    public void gererCollabsMAJ(Collaborateur collaborateur){
        Collaborateur collab;
        if (this.estManagerRH){
            collab = this.rechercherCollab(collaborateur);
            if (collab!=null){
                System.out.println("que\'est ce que vous voulez modifier pour ce collaborateur?");
                System.out.println("\t1 pour nom\n\t2 pour prenom\n\t3 pour matricule\n\t4 pour sexe\n\t5 pour poste\n\t6 pour diplome \n\t7 pour technologie\n\t8 pour competence\n\t9 pour site");
                int choix = reader.nextInt();
                switch (choix){
                    case 1:
                        System.out.print("enter le nouveau nom : ");
                        collaborateur.setNom(reader.nextLine());break;
                    case 2:
                        System.out.print("enter le nouveau prenom : ");
                        collaborateur.setPrenom(reader.nextLine());break;
                    case 3:
                        System.out.print("enter le nouveau matricule : ");
                        collaborateur.setMatricule(reader.nextInt());break;
                    case 4:
                        System.out.print("enter le nouveau sexe : ");
                        collaborateur.setPrenom(reader.nextLine());break;
                    case 5:
                        System.out.print("enter le nouveau poste : ");
                        collaborateur.getPostes().add(new Poste(01,reader.nextLine()));break;
                    case 6:
                        System.out.print("enter le nouveau diplome (l\'id puis le niveau puis le type): ");
                        collaborateur.getDiplomes().add(new Diplome(reader.nextInt(),reader.nextLine(),reader.nextLine(),null));break;
                    case 7:
                        System.out.print("enter le nouveau technologie (l\'id puis nom puis le niveau d\'expertise) : ");
                        collaborateur.getTechnologies().add(new Technologie(reader.nextInt(),reader.nextLine(),reader.nextInt()));break;
                    case 8:
                        System.out.print("enter le nouveau competence (l\'id puis nom puis le niveau d\'expertise) : ");
                        collaborateur.getCompetences().add(new Competence(reader.nextInt(),reader.nextLine(),reader.nextInt()));break;
                    case 9:
                        System.out.print("enter le nouveau site (l\'id puis nom puis le local) : ");
                        collaborateur.setSite(new Site(reader.nextInt(),reader.nextLine(),reader.nextLine()));break;
                }
                for (Collaborateur c: this.getCollabsManagerRH()) {
                    if (c.equals(collab)){
                        c = collaborateur;
                    }
                }
            }
            else {
                System.out.println("ce collaborateur n\'existe pas ou n\'est pas géré par ce manager RH");
            }
        }
    }

    //fct pour la gestion d'un collaborateur parti par le manager RH
    public void gererCollabParti(Collaborateur collaborateur,Date date){
        if (this.estManagerRH && collaborateur.managerRHActuel == this.getNom()){
            collaborateur.dateDepart = date;
            collaborateur.ancienCollab = true;
            collabsManagerRH.remove(collaborateur);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collaborateur that = (Collaborateur) o;
        return sexe == that.sexe && ancienCollab == that.ancienCollab && estManagerRH == that.estManagerRH && Objects.equals(ancienManagerRH, that.ancienManagerRH) && Objects.equals(managerRHActuel, that.managerRHActuel) && Objects.equals(dateEmbauche, that.dateEmbauche) && Objects.equals(dateDepart, that.dateDepart) && Objects.equals(BU, that.BU) && Objects.equals(postes, that.postes) && Objects.equals(posteActuel, that.posteActuel) && Objects.equals(diplomes, that.diplomes) && Objects.equals(technologies, that.technologies) && Objects.equals(competences, that.competences) && Objects.equals(salaires, that.salaires) && Objects.equals(salaireActuel, that.salaireActuel) && Objects.equals(site, that.site) && Objects.equals(collabsManagerRH, that.collabsManagerRH);
    }

}
