package TP3.Exercice3;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.util.List;

public interface IMetier<T>{
    public T add(T o);
    public List<T> getAll() throws JAXBException;
    public T findByNom(String nom);
    public void delete(String nom);
    public void saveAll()throws JAXBException;
}
