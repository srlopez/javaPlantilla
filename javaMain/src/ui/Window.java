package ui;

// https://gluonhq.com/download/javafx-11-0-2-sdk-windows/
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Window extends Application {
    private static CtrlWindow ctrl; //Sólo funciona de esta manera.

    public Window(){
        super();
    }
    public Window(CtrlWindow ctrlw) {
        this();
        Window.ctrl = ctrlw;
    }

	public void show(String... arg0) {
        launch(arg0);
    }
    
    void setLayout(){}

    @Override
    public void start(Stage primaryStage) {
        int x1 = 90;
        int y1 = 40;
        int fsize = 50;
        Label f1 = new Label("f1"); f1.setLayoutX(x1-5); f1.setLayoutY(y1+8);
        TextField n1 = new TextField("3"); n1.setLayoutX(x1+20); n1.setLayoutY(y1);
        n1.setPrefWidth(fsize);          
        Label l1 = new Label("/");  l1.setLayoutX(x1+fsize+23); l1.setLayoutY(y1+8); 
        TextField n12 = new TextField("7"); n12.setLayoutX(x1+fsize+30); n12.setLayoutY(y1);
        n12.setPrefWidth(fsize);         
        
        int x2 = x1;
        int y2 = y1 + 45;
        Label f2 = new Label("f2"); f2.setLayoutX(x2-5); f2.setLayoutY(y2+8);
        TextField n2 = new TextField("2"); n2.setLayoutX(x2+20); n2.setLayoutY(y2);
        n2.setPrefWidth(fsize);          
        Label l2 = new Label("/");  l2.setLayoutX(x2+fsize+23); l2.setLayoutY(y2+8); 
        TextField n22 = new TextField("5"); n22.setLayoutX(x2+fsize+30); n22.setLayoutY(y2);
        n22.setPrefWidth(fsize);   
        Button btn = new Button("Calcula"); btn.setLayoutX(5); btn.setLayoutY(y2+40); 
        TextField res = new TextField("..."); res.setLayoutX(x2+20); res.setLayoutY(y2+40);
        res.setPrefWidth(fsize*2 + 10);   
        Button fin = new Button("A la Consola ..."); fin.setLayoutX(x2); fin.setLayoutY(y2+100);

        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String f1s = n1.getText()+"/"+n12.getText();
                String f2s = n2.getText()+"/"+n22.getText();
                System.out.println("handle  "+f1s+" "+f2s);
                String result = ctrl.useCase1(f1s, f2s);
                res.setText(result);
            }
        });

        fin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        
        AnchorPane root = new AnchorPane();
        root.getChildren().add(f1);
        root.getChildren().add(l1);
        root.getChildren().add(n1);
        root.getChildren().add(n12);
        root.getChildren().add(f2);
        root.getChildren().add(l2);
        root.getChildren().add(n2);
        root.getChildren().add(n22);
        root.getChildren().add(btn);
        root.getChildren().add(fin);
        root.getChildren().add(res);
        root.setStyle("-fx-font: 20 arial;");
        primaryStage.setTitle("Sistema MVC");
        primaryStage.setOnCloseRequest(e -> Platform.exit());
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}