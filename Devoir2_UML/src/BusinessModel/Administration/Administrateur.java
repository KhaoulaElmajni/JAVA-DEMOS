package BusinessModel.Administration;

import BusinessModel.GestionCollaborateurs.*;

import java.util.ArrayList;
import java.util.Date;

public class Administrateur extends Personne {
    private String role;

    public Administrateur(int matricule, String nom, String prenom, String role) {
        super(matricule, nom, prenom);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //fct pour créer un collaborateur
    public Collaborateur creerCollaborateur(long matricule, String nom, String prenom, char sexe, Date dateEmbauche, BusinessUnit BU, Poste poste, Diplome diplome, Technologie technologie, Competence competence, Salaire salaire, Site site){
        return new Collaborateur(matricule,nom,prenom,sexe,dateEmbauche,BU,poste,diplome,technologie,competence,salaire,site);
    }

    //fct pour mentionner le manager actuel et le manager ancien pour un collaborateur
    public void managerAct_managerAncien(Collaborateur collaborateur,String ancienManager,String managerActuel){
        collaborateur.setAncienManagerRH(ancienManager);
        collaborateur.setManagerRHActuel(managerActuel);
    }

    //fct pour la création d'un manager RH
    public void setManagerRh(Collaborateur collaborateur){
        collaborateur.setEstManagerRH(true);
    }

    //fct pour la supprission d'un manager RH
    public void revokeManagerRH(Collaborateur collaborateur){
        collaborateur.setEstManagerRH(false);
    }

    //fct pour la modofication du salaire d'un collaborateur
    public void modifierSalaireCollab(Collaborateur collaborateur, Salaire salaire){
        collaborateur.getSalaires().add(salaire);
        collaborateur.setSalaireActuel(salaire);
    }

    //fct pour l'affctation des collaborateurs au manager RH
    public void affecterCollabAuManagerRH(ArrayList<Collaborateur> collaborateurs,Collaborateur managerRH){
        if (managerRH.isEstManagerRH()){
            managerRH.setCollabsManagerRH(collaborateurs);
        }
        for (Collaborateur collab:collaborateurs ) {
            collab.setManagerRHActuel(managerRH.getNom()+" "+managerRH.getPrenom());
        }
    }

    //fct pour importer les données depuis un fichier excel
    public void importerDonnees(){

    }

    //fct pour exporter les données dans un fichier excel
    public void exporterDonnees(){

    }
}
