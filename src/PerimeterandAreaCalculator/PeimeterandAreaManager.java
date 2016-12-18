package PerimeterandAreaCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PeimeterandAreaManager extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/PerimeterandAreaCalculator/myFXML.fxml"));
        root.getStylesheets().add(getClass().getResource("AreaAndPerimeter.css").toExternalForm());

        Scene scene = new Scene(root);
        primaryStage.setTitle("Area and Perimeter Calculator");
        primaryStage.setScene(scene);


       primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
