package TP7.Calculate_Temperature;

public class CalculateTmpThread implements Runnable{

    private final int rho = 1040;
    private double k=0.6, c=3650 ,deltaT=0.1,deltaX=0.01 ;
    private double t1[][] = new double[10][10];
    private double t2[][] = new double[10][10];
    private int nbrIteration;

    public CalculateTmpThread(int nbrIteration) {
        this.nbrIteration = nbrIteration;
    }

    public void afficher(double [][]tmp){

        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(tmp[k][i]+ " ");
            }
            System.out.println();
        }
    }
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                t1[i][j] = 0;
                t2[i][j] = 0;
            }
        }
        t1[4][4] = 30;
        t2[4][4] = 30;
        for (int u = 0; u < nbrIteration; u++) {
            for (int i = 1; i < 9; i++) {
                for (int j = 1; j < 9; j++) {
                    if (i!=4 || j!=4){
                        if (u%2 == 0){
                            t2[i][j] = t1[i][j] + ((deltaT * k)/(rho*c*deltaX * deltaX)) *(t1[i-1][j]+t1[i+1][j]+t1[i][j-1]+t1[i][j+1]-4*t1[i][j]);
                        }else {
                            t1[i][j] = t2[i][j] + ((deltaT * k)/(rho*c*deltaX * deltaX)) *(t2[i-1][j]+t2[i+1][j]+t2[i][j-1]+t2[i][j+1]-4*t2[i][j]);
                        }
                    }
                }
            }
        }
        afficher(t1);
    }
}
