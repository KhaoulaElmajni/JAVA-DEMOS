package TP4.Main;

import TP4.BusinessModel.EntierNaturel;
import TP4.BusinessModel.NombreNegatifException;

public class Application {
    public static void main(String[] args) {
        try {
            EntierNaturel entierNaturel1 = new EntierNaturel(3);
            System.out.println(entierNaturel1.getVal());
            entierNaturel1.setVal(-6);
            entierNaturel1.decrementer();
            entierNaturel1.decrementer();
            entierNaturel1.decrementer();
            entierNaturel1.decrementer();
            entierNaturel1.decrementer();
            entierNaturel1.decrementer();
        }catch (NombreNegatifException n){
            System.out.println(n.getMessage()+" la derniere valeur de l\'element est : "+n.getNombre());
        }
    }
}
