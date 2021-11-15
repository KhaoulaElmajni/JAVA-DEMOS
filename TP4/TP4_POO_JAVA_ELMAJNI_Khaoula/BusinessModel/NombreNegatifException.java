package TP4.BusinessModel;

public class NombreNegatifException extends Exception{
    private int nombre;

    public NombreNegatifException(String msg,int nombre){
        super(msg);
        this.nombre = nombre;
    }
    public int getNombre() {
        return this.nombre;
    }

}
