package com.example.myheatmap;

import javafx.application.Platform;

public class CalculateTmpThread implements Runnable{

    private final int rho = 1040;
    private double k=0.6, c=3650 ,deltaT=0.1,deltaX=0.01 ;
    public static double t1[][] = new double[11][11];
    public static  double t2[][] = new double[11][11];
    private int nbrIteration;
    private static int t=0;

    public CalculateTmpThread(int nbrIteration) {
        this.nbrIteration = nbrIteration;
    }

   /* public void afficher(double [][]tmp){

        for (int k = 0; k < 11; k++) {
            for (int i = 0; i < 11; i++) {
                System.out.printf("%05.2f ",tmp[k][i]);
            }
            System.out.println();
        }
    }*/
    @Override
    public void run() {
        System.out.println("appel a la fct run du thread");

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                t1[i][j] = 0;
                t2[i][j] = 0;
            }
        }
        t1[5][5] = 30;
        t2[5][5] = 30;
        for (int u = 0; u < nbrIteration; u++) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if (i!=5 || j!=5){
                        if (u%2 == 0){
                            t2[i][j] = t1[i][j] + ((deltaT * k)/(rho*c*deltaX * deltaX)) *(t1[i-1][j]+t1[i+1][j]+t1[i][j-1]+t1[i][j+1]-4*t1[i][j]);
                        }else {
                            t1[i][j] = t2[i][j] + ((deltaT * k)/(rho*c*deltaX * deltaX)) *(t2[i-1][j]+t2[i+1][j]+t2[i][j-1]+t2[i][j+1]-4*t2[i][j]);
                        }
                    }
                }
            }
        }
        t++;
        System.out.println(t);
        if(t== Application_heatmap.nbr){
            System.out.println("ts les threads finis le calcul");
            Platform.runLater(new Runnable(){
                @Override
                public void run() {
                    Application_heatmap.afficherHeatMap();
                }
            });

        }
    }
}
