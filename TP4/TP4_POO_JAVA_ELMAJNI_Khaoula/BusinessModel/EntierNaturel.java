package TP4.BusinessModel;

public class EntierNaturel {
    private int val;
    public EntierNaturel(int val) throws NombreNegatifException {
        if (val<0) throw new NombreNegatifException("la valeur est negative",val);
        else this.val = val;
    }

    public int getVal() {
        return this.val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val<0) throw new NombreNegatifException("la valeur est negative",val);
        else this.val = val;
    }
    public void decrementer() throws NombreNegatifException{
       this.val--;
        if (this.val<0) throw new NombreNegatifException("la valeur est negative",this.val);
    }
}
