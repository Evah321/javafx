package com.fx.javafx;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Text text1 = new Text("Name"); //Label
        Text text2 = new Text("Registered"); //Label

        TextField textfield = new TextField();
        ComboBox<String>combobox = new ComboBox<>();

        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600,400);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(textfield , 1 , 0);
        gridPane.add(button1, 1 ,1);

        gridPane.add(text2,0,2);
        gridPane.add(combobox, 1, 2);
        gridPane.add(button2, 1 , 3);

        Scene scene = new Scene(gridPane);
        stage.setTitle("OUR PAGE");
        stage.setScene(scene);
        stage.show();
    }
}
