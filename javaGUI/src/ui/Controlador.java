package ui;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import aritmetica.Calculadora;
import aritmetica.Fraccion;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador {
    Calculadora calculadora;

    public Controlador(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtF1Num;

    @FXML
    private TextField txtF1Den;

    @FXML
    private TextField txtF2Num;

    @FXML
    private TextField txtF2Den;

    @FXML
    private TextField txtF3Num;

    @FXML
    private TextField txtF3Den;

    @FXML
    private Label lblF1Impropia;

    @FXML
    private Label lblF2Impropia;

    @FXML
    private Label lblF3Impropia;

    @FXML
    private Button btnCalcular;

    @FXML
    void btnCalcular_click(ActionEvent event) {
        Fraccion f1 = new Fraccion(Integer.parseInt(txtF1Num.getText()), Integer.parseInt(txtF1Den.getText()));
        Fraccion f2 = new Fraccion(Integer.parseInt(txtF2Num.getText()), Integer.parseInt(txtF2Den.getText()));
        Fraccion f3 = calculadora.suma(f1, f2);
        System.out.println("Click "+f3.toString());

        String[] lista = f3.toString().split("/");
        txtF3Num.setText(lista[0]);
        txtF3Den.setText(lista[1]);
    }

    @FXML
    void initialize() {
        assert txtF1Num != null : "fx:id=\"txtF1Num\" was not injected: check your FXML file 'Untitled'.";
        assert txtF1Den != null : "fx:id=\"txtF1Den\" was not injected: check your FXML file 'Untitled'.";
        assert txtF2Num != null : "fx:id=\"txtF2Num\" was not injected: check your FXML file 'Untitled'.";
        assert txtF2Den != null : "fx:id=\"txtF2Den\" was not injected: check your FXML file 'Untitled'.";
        assert txtF3Num != null : "fx:id=\"txtF3Num\" was not injected: check your FXML file 'Untitled'.";
        assert txtF3Den != null : "fx:id=\"txtF3Den\" was not injected: check your FXML file 'Untitled'.";
        assert lblF1Impropia != null : "fx:id=\"lblF1Impropia\" was not injected: check your FXML file 'Untitled'.";
        assert lblF2Impropia != null : "fx:id=\"lblF2Impropia\" was not injected: check your FXML file 'Untitled'.";
        assert lblF3Impropia != null : "fx:id=\"lblF3Impropia\" was not injected: check your FXML file 'Untitled'.";
        assert btnCalcular != null : "fx:id=\"btnCalcular\" was not injected: check your FXML file 'Untitled'.";

        // A los campos de texto que son numericos le establecemos el listener para evitar letras
        List<TextField> lista = Arrays.asList(txtF1Num, txtF1Den, txtF2Num, txtF2Den);

        lista.stream().forEach((txt) -> {
            txt.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.matches("\\d*")) {
                        txt.setText(newValue.replaceAll("[^\\d]", ""));
                    }
                }
            });
        });
        lblF1Impropia.setVisible(false);
        lblF2Impropia.setVisible(false);
        lblF3Impropia.setVisible(false);
    }
}
