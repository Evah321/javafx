package com.fx.javafx;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Text name = new Text("Name"); 
        Text registered = new Text("Registered"); 

        TextField txtRegistered = new TextField();
        ComboBox<String>cbxRegistered = new ComboBox<>();

        Button btnSave = new Button("Save");
        // btnSave.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        Button btnRemove = new Button("Remove");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600,400);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(name, 0, 0);
        gridPane.add(txtRegistered, 1, 0);
        gridPane.add(btnSave, 1, 1);

        gridPane.add(registered, 0, 2);
        gridPane.add(cbxRegistered, 1, 2);
        gridPane.add(btnRemove, 1, 3);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Movie Library System");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
