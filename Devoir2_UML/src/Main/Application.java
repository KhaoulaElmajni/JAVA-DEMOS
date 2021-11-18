package Main;

import BusinessModel.Administration.Administrateur;
import BusinessModel.GestionCollaborateurs.*;

import java.util.ArrayList;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Administrateur administrateur1 = new Administrateur(00001,"ELMAJNI","KHAOULA","Embassadeur PCMM");
        Administrateur administrateur2 = new Administrateur(00002,"CHOUKAIRI","AHMED","Responsable production");
        Administrateur administrateur3 = new Administrateur(00003,"ELMAJNI","AOUSS","Manager d\'agence");

        BusinessUnit BU1 = new BusinessUnit(01,"BU1");
        BusinessUnit BU2 = new BusinessUnit(02,"BU2");
        BusinessUnit BU3 = new BusinessUnit(03,"BU3");
        BusinessUnit BU4 = new BusinessUnit(04,"BU4");
        BusinessUnit BU5 = new BusinessUnit(05,"BU5");
        BusinessUnit BU6 = new BusinessUnit(06,"BU6");
        BusinessUnit BU7 = new BusinessUnit(07,"BU7");
        BusinessUnit BU8 = new BusinessUnit(8,"BU8");
        BusinessUnit BU9 = new BusinessUnit(9,"BU9");

        Poste poste1 = new Poste(01,"salarié1");
        Poste poste2 = new Poste(02,"salarié2");
        Poste poste3 = new Poste(03,"salarié3");
        Poste poste4 = new Poste(04,"salarié4");
        Poste poste5 = new Poste(05,"salarié5");
        Poste poste6 = new Poste(06,"salarié6");
        Poste poste7 = new Poste(07,"salarié7");
        Poste poste8 = new Poste(8,"salarié8");
        Poste poste9 = new Poste(9,"salarié9");


        Ecole ecole1 = new Ecole(01,"EST","nationale");
        Ecole ecole2 = new Ecole(02,"ENSET","nationale");
        Ecole ecole3 = new Ecole(03,"ENSA","internationale");
        Ecole ecole4 = new Ecole(04,"ENSIAS","nationale");
        Ecole ecole5 = new Ecole(05,"INSEA","internationale");
        Ecole ecole6 = new Ecole(06,"FST","internationale");
        Ecole ecole7 = new Ecole(07,"FS","internationale");
        Ecole ecole8 = new Ecole(8,"FP","nationale");
        Ecole ecole9 = new Ecole(9,"ENSEM","internationale");


        Diplome diplome1 = new Diplome(01,"Bac+2","étatique",ecole1);
        Diplome diplome2 = new Diplome(02,"Bac+3","étatique",ecole2);
        Diplome diplome3 = new Diplome(03,"Bac+5","étatique",ecole3);
        Diplome diplome4 = new Diplome(01,"Bac+2","étatique",ecole1);
        Diplome diplome5 = new Diplome(02,"Bac+3","étatique",ecole2);
        Diplome diplome6 = new Diplome(03,"Bac+5","étatique",ecole3);
        Diplome diplome7 = new Diplome(01,"Bac+2","étatique",ecole1);
        Diplome diplome8 = new Diplome(02,"Bac+3","étatique",ecole2);
        Diplome diplome9 = new Diplome(03,"Bac+5","étatique",ecole3);

        Technologie technologie1 = new Technologie(01,"JAVASCRIPT & Framework",5);
        Technologie technologie2 = new Technologie(02,"PHP & Framework",2);
        Technologie technologie3 = new Technologie(03,"JAVA & Framework",4);
        Technologie technologie4 = new Technologie(04,"DevOPs & Framework",1);
        Technologie technologie5 = new Technologie(05,"Big Data",3);
        Technologie technologie6 = new Technologie(06,"HTML/CSS",5);
        Technologie technologie7 = new Technologie(07,"Networking",5);
        Technologie technologie8 = new Technologie(8,"NanoTechnology",1);
        Technologie technologie9 = new Technologie(9,"Cloud Computing",4);

        Competence competence1 = new Competence(01,"esprit d\'équipe",1);
        Competence competence2 = new Competence(02,"Rigueur",3);
        Competence competence3 = new Competence(03,"Autonomie",5);
        Competence competence4 = new Competence(04,"Professionnalisme",2);
        Competence competence5 = new Competence(05,"3-Savoir",3);
        Competence competence6 = new Competence(06,"Autonomie",5);
        Competence competence7 = new Competence(07,"L’adaptation aux exigences",1);
        Competence competence8 = new Competence(8,"Rigueur",2);
        Competence competence9 = new Competence(9,"Autonomie",5);



        Salaire salaire1 = new Salaire(01,15000);
        Salaire salaire2 = new Salaire(02,30000);
        Salaire salaire3 = new Salaire(03,20000);
        Salaire salaire4 = new Salaire(04,15000);
        Salaire salaire5 = new Salaire(05,40000);
        Salaire salaire6 = new Salaire(06,26000);
        Salaire salaire7 = new Salaire(07,65000);
        Salaire salaire8 = new Salaire(8,10000);
        Salaire salaire9 = new Salaire(9,40500);

        Site site1 = new Site(01,"chantier1","local1");
        Site site2 = new Site(02,"atelier2","local2");
        Site site3 = new Site(03,"maintenance préventive","local3");
        Site site4 = new Site(04,"atelier1","local4");
        Site site5 = new Site(05,"atelier3","local5");
        Site site6 = new Site(06,"direction1","local6");
        Site site7 = new Site(07,"chantier2","local7");
        Site site8 = new Site(8,"atelier4","local8");
        Site site9 = new Site(9,"direction2","local9");


        Collaborateur collaborateur1 = administrateur1.creerCollaborateur(00001,"naim","fadi",'M',new Date(2021,04,12),BU1,poste1,diplome1,technologie1,competence1,salaire1,site1);
        Collaborateur collaborateur2 = administrateur1.creerCollaborateur(00002,"nadmi","madiha",'F',new Date(2020,11,31),BU2,poste2,diplome2,technologie2,competence2,salaire2,site2);
        Collaborateur collaborateur3 = administrateur1.creerCollaborateur(00003,"fahmi","nouran",'F',new Date(2018,01,15),BU3,poste3,diplome3,technologie3,competence3,salaire3,site3);

        Collaborateur collaborateur4 = administrateur2.creerCollaborateur(00004,"Fkak","Mohammed",'M',new Date(2020,10,17),BU4,poste4,diplome4,technologie4,competence4,salaire4,site4);
        Collaborateur collaborateur5 = administrateur2.creerCollaborateur(00005,"Alami","Khadija",'F',new Date(2016,9,02),BU5,poste5,diplome5,technologie5,competence5,salaire5,site5);
        Collaborateur collaborateur6 = administrateur2.creerCollaborateur(00006,"alaoui","Ali",'M',new Date(2019,05,25),BU6,poste6,diplome6,technologie6,competence6,salaire6,site6);

        Collaborateur collaborateur7 = administrateur3.creerCollaborateur(00007,"Nassri","faouzia",'F',new Date(2017,06,27),BU7,poste7,diplome7,technologie7,competence7,salaire7,site7);
        Collaborateur collaborateur8 = administrateur3.creerCollaborateur(10008,"saidi","sami",'M',new Date(2019,03,29),BU8,poste8,diplome8,technologie8,competence8,salaire8,site8);
        Collaborateur collaborateur9 = administrateur3.creerCollaborateur(10009,"bahij","fatiha",'F',new Date(2020,12,30),BU9,poste9,diplome9,technologie9,competence9,salaire9,site9);

        ArrayList<Collaborateur> collaborateurs = new ArrayList<>();
        collaborateurs.add(collaborateur2);
        collaborateurs.add(collaborateur3);
        collaborateurs.add(collaborateur4);

        administrateur1.setManagerRh(collaborateur1);
        administrateur1.affecterCollabAuManagerRH(collaborateurs,collaborateur1);
        administrateur1.modifierSalaireCollab(collaborateur4,salaire2);

        collaborateurs.clear();
        collaborateurs.add(collaborateur6);
        collaborateurs.add(collaborateur7);
        collaborateurs.add(collaborateur8);
        collaborateurs.add(collaborateur9);

        administrateur1.setManagerRh(collaborateur5);
        administrateur1.affecterCollabAuManagerRH(collaborateurs,collaborateur1);
        administrateur1.modifierSalaireCollab(collaborateur6,salaire9);

        collaborateur1.gererCollabsMAJ(collaborateur2);
        collaborateur1.gererCollabsMAJ(collaborateur4);


        collaborateur5.gererCollabsMAJ(collaborateur7);
        collaborateur5.gererCollabsMAJ(collaborateur8);

        collaborateur1.gererCollabParti(collaborateur3,new Date(2021,11,18));

    }
}
