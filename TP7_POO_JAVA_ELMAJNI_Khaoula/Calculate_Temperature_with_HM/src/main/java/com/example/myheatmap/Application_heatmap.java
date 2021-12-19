package com.example.myheatmap;


import com.example.heatmap.ColorMapping;
import com.example.heatmap.HeatMap;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Application_heatmap extends javafx.application.Application {


    public static int nbr;

    private static HeatMap heatMap;
    private  StackPane pane;

    @Override
    public void init() {
        pane                         = new StackPane();
        heatMap = new HeatMap(300, 300, ColorMapping.BLUE_CYAN_GREEN_YELLOW_RED);
    }

    public static void afficherHeatMap() {
        System.out.println("appel a afficherHeatMap !");

        for (int i = 1; i < 300; i+=10) {
            for (int j = 1; j < 300; j+=10) {
                int newi = i/28;
                int newj = j /28;
                int n = (int)CalculateTmpThread.t1[newi][newj];
                int stop = n/8;
                for (int k = 0; k < 1+stop; k++) {
                    heatMap.addEvent(i, j);
                }
            }
        }
    }



    protected static void traiter(int precisionNbr ) {

        System.out.println("appel a traiter");

        for (int i = 0; i < precisionNbr; i++) {
            Thread myThread = new Thread(new CalculateTmpThread((i)));
            myThread.start();
        }


    }


    @Override
    public void start(Stage stage) throws IOException {
        Pane layout = new Pane();
        layout.setPrefWidth(300);
        layout.setPrefHeight(300);

        pane.getChildren().setAll(layout, heatMap);
        Scene scene = new Scene(pane, 500, 500, Color.BLACK);

        stage.setTitle("la propagation de la temperature avec JavaFX HeatMap");
        stage.setScene(scene);
        stage.show();
        traiter(nbr=10000);
    }

    public static void main(String[] args) {
        launch();
    }

}
