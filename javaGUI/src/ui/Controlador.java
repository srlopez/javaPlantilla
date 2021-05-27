package ui;

import java.net.URL;
import java.util.ResourceBundle;

import aritmetica.Calculadora;
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
    private Label lblF1Imprpia;

    @FXML
    private Label lblF2Impropia;

    @FXML
    private Label lblF3Impropia;

    @FXML
    private Button btnCalcular;

    @FXML
    void btnCalcular_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtF1Num != null : "fx:id=\"txtF1Num\" was not injected: check your FXML file 'Untitled'.";
        assert txtF1Den != null : "fx:id=\"txtF1Den\" was not injected: check your FXML file 'Untitled'.";
        assert txtF2Num != null : "fx:id=\"txtF2Num\" was not injected: check your FXML file 'Untitled'.";
        assert txtF2Den != null : "fx:id=\"txtF2Den\" was not injected: check your FXML file 'Untitled'.";
        assert txtF3Num != null : "fx:id=\"txtF3Num\" was not injected: check your FXML file 'Untitled'.";
        assert txtF3Den != null : "fx:id=\"txtF3Den\" was not injected: check your FXML file 'Untitled'.";
        assert lblF1Imprpia != null : "fx:id=\"lblF1Imprpia\" was not injected: check your FXML file 'Untitled'.";
        assert lblF2Impropia != null : "fx:id=\"lblF2Impropia\" was not injected: check your FXML file 'Untitled'.";
        assert lblF3Impropia != null : "fx:id=\"lblF3Impropia\" was not injected: check your FXML file 'Untitled'.";
        assert btnCalcular != null : "fx:id=\"btnCalcular\" was not injected: check your FXML file 'Untitled'.";

        // force the field to be numeric only
        txtF1Num.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txtF1Num.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        txtF1Den.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txtF1Den.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        txtF2Num.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txtF2Num.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        txtF2Den.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txtF2Den.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }
}
