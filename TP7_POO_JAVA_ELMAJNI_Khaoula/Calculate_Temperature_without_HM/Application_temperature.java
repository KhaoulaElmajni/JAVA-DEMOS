package TP7.Calculate_Temperature;

import TP7.Calculate_Temperature.CalculateTmpThread;

import java.util.Scanner;

public class Application_temperature {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int nbr;
        System.out.println("Bonjour dans votre application de calcul de temperature");
        System.out.println("Veuillez saisir le nombre de régions pour calculer la propation de la température");
        nbr = reader.nextInt();
        for (int i = 0; i < nbr; i++) {
            Thread myThread = new Thread(new CalculateTmpThread((i*100000)));
            myThread.start();
        }
    }
}
