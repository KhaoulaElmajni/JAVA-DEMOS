package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("userLayout.fxml"));
        primaryStage.setTitle("Users Management");

        Scene scene = new Scene(root, 800, 600);
        //scene.getStylesheets().add(getClass().getResource("css/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("user.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
