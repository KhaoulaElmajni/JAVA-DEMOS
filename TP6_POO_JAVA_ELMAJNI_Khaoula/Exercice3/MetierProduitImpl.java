package TP3.Exercice3;

import Serialisation.Student;
import TP3.Exercice2.DossierContact;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MetierProduitImpl implements IMetier<Produit>{
    @XmlElement
    private List<Produit> produits = new ArrayList<>();
    private static String nomFile="produits.xml";

    @Override
    public Produit add(Produit o) {
        if (this.produits.add(o))
            return o;
        else
            return null;
    }

    @Override
    public List<Produit> getAll() throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(MetierProduitImpl.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        MetierProduitImpl metierProduit = (MetierProduitImpl) unmarshaller.unmarshal(new File(nomFile));
        return metierProduit.produits;
    }

    @Override
    public Produit findByNom(String nom) {
        Produit produit = null ;
        for (Produit p:this.produits ) {
            if (p.getNom().equals(nom)){
                produit = p;
                break;
            }
        }
        return produit;
    }

    @Override
    public void delete(String nom) {
        for (Produit p:this.produits ) {
            if (p.getNom().equals(nom))
                this.produits.remove(p);
        }
    }

    @Override
    public void saveAll() throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(MetierProduitImpl.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(this,new File(nomFile));

    }

    public void afficher(){
        System.out.println("   Nom    |    marque    |    prix    |    dsecription    |    Qte stock   ");
        for (Produit p:this.produits ) {
            System.out.println(p.getNom()+"    |    "+p.getMarque()+"    |    "+p.getPrix()+"    |    "+p.getDescription()+"    |    "+p.getNbrStock());
        }
    }
}
