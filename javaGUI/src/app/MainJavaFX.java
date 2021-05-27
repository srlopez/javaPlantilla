package app;

import java.net.URL;

import aritmetica.Calculadora;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import ui.Controlador;

public class MainJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {
            // Preparamos los objetos que van a interaccionar
    
            Calculadora sistema = new Calculadora();
            // Controller
            Controlador controller = new Controlador(sistema);
            // Vista
            String fxmlPath = "/ui/Vista.fxml";
            URL location = getClass().getResource(fxmlPath);
            FXMLLoader fxmlLoader = new FXMLLoader(location);
            fxmlLoader.setController(controller);
            // RUN
            Parent root = (Parent) fxmlLoader.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle("Calculadora de Fracciones");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}