package com.fx.javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rentals extends Application {
    public void start(Stage stage) throws IOException {

        Text txtCustomer = new Text("Customer:");
        Text txtMovies = new Text("Movies:");
        Text txtGenre = new Text("Genre:");
        Text txtBorrowed = new Text("Borrowed:");
        Text txtReturned = new Text("Returned:");

        Button btnSave = new Button("Save");
        Button btnReturn = new Button("Return");

        ComboBox<String> cbxCustomer = new ComboBox<>();
        ComboBox<String> cbxMovies = new ComboBox<>();
        ComboBox<String> cbxGenre = new ComboBox<>();
        ComboBox<String> cbxBorrowed = new ComboBox<>();   
        ComboBox<String> cbxReturned = new ComboBox<>();

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);   
        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.add(txtCustomer, 0, 0);
        gridPane.add(cbxCustomer, 1, 0);
        gridPane.add(txtMovies, 0, 1);
        gridPane.add(cbxMovies, 1, 1);
        gridPane.add(txtGenre, 0, 2);
        gridPane.add(cbxGenre, 1, 2);
        gridPane.add(txtBorrowed, 0, 3);
        gridPane.add(cbxBorrowed, 1, 3);
        gridPane.add(txtReturned, 0, 4);
        gridPane.add(cbxReturned, 1, 4);    
        gridPane.add(btnSave, 1, 5);
        gridPane.add(btnReturn, 1, 6);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Rentals");
        stage.setScene(scene);
        stage.show();
    }
}
