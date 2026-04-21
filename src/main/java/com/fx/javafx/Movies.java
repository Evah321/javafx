package com.fx.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.io.IOException;

public class Movies extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Text txtGenres = new Text("Genres:");
        Text txtName = new Text("Name:");
        Text txtRegistered = new Text("Registered:");
        TextField tfName = new TextField();

        ComboBox<String> cbxGenres = new ComboBox<>();
        ComboBox<String> cbxRegistered = new ComboBox<>();

        Button btnSave = new Button("Save");
        Button btnRemove = new Button("Remove");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(txtGenres, 0, 0);
        gridPane.add(cbxGenres, 1, 0);
        gridPane.add(txtName, 0, 1);
        gridPane.add(tfName, 1, 1);
        gridPane.add(btnSave, 1, 2);
        gridPane.add(txtRegistered, 0, 3);
        gridPane.add(cbxRegistered, 1, 3);
        gridPane.add(btnRemove, 1, 4);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Movies");
        stage.setScene(scene);
        stage.show();

    }
}
