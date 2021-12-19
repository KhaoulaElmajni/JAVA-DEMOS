module com.example.myheatmap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;
    requires javafx.swing;
    requires charts;

    opens com.example.myheatmap to javafx.fxml, javafx.graphics;
    exports com.example.myheatmap;

    opens com.example.heatmap to javafx.fxml, javafx.graphics;
    exports com.example.heatmap;


}
