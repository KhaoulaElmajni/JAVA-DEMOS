package JAXB;

import jaxb1.Employee;
import jaxb2.Answer;
import jaxb2.Question;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class ApplicationXmlToObject {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Classe.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Classe classe = (Classe) unmarshaller.unmarshal(new File("classe.xml"));

            for (Student s:classe.getStudents() ) {
                System.out.println(s.getNom()+" "+s.getPrenom());
            }


        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
    }

