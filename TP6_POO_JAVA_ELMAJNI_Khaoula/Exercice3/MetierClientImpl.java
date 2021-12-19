package TP3.Exercice3;

import TP3.Exercice2.DossierContact;
import com.sun.xml.internal.ws.client.dispatch.JAXBDispatch;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MetierClientImpl implements IMetier<Client>{
    @XmlElement
    private List<Client> clients = new ArrayList<>();
    private static String nomFile="clients.xml";

    @Override
    public Client add(Client o) {
        if (this.clients.add(o))
            return o;
        else
            return null;
    }

    @Override
    public List<Client> getAll() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(MetierClientImpl.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        MetierClientImpl metierClient = (MetierClientImpl) unmarshaller.unmarshal(new File(nomFile));
        return metierClient.clients;
    }

    @Override
    public Client findByNom(String nom) {
        Client client = null ;
        for (Client c:this.clients ) {
            if (c.getNom().equals(nom)){
                client = c;
                break;
            }
        }
        return client;
    }

    @Override
    public void delete(String nom) {
        for (Client c:this.clients ) {
            if (c.getNom().equals(nom))
                this.clients.remove(c);
        }
    }

    @Override
    public void saveAll() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(MetierClientImpl.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(this,new File(nomFile));

    }

    public void afficher(){
        System.out.println("   Nom    |    prenom    |    adresse    |    telephone    |        email    ");
        for (Client c:this.clients ) {
            System.out.println(c.getNom()+"    |    "+c.getPrenom()+"    |    "+c.getAdresse()+"    |    "+c.getTel()+"    |    "+c.getEmail());
        }
    }
}
