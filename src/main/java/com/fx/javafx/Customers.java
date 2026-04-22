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
import javafx.scene.control.*;


public class Customers extends Application  {
    private String custName;
    private String custPhone;
    private String custEmail;

    public Customers(){

    }
    public Customers (String n, String p , String e){
        custName= n;
        custPhone = p;
        custEmail = e;
    }
  public void start(Stage stage) throws IOException{
    Text name = new Text("Name");
    Text phone = new Text("Phone");
    Text email = new Text ("Email");
    Text registered = new Text ("Registered");

    TextField writeName = new TextField();
    TextField writePhone = new TextField();
    TextField writeEmail = new TextField();

    ComboBox<Customers> cbxRegistered = new ComboBox<>();
    Button btnSave = new Button ("Save Customer");
    Button btnRemove = new Button("Remove customer");

        btnSave.setOnAction(e -> {
            Customers c = new Customers(writeName.getText(), writePhone.getText(), writeEmail.getText());
            cbxRegistered.getItems().add(c);
            writeName.clear();
            writePhone.clear();
            writeEmail.clear();
        });

        btnRemove.setOnAction(e -> {
            cbxRegistered.getItems().remove(cbxRegistered.getValue());
        });

        GridPane grid = new GridPane();
        grid.add(name, 0, 0);
        grid.add(writeName, 1, 0);
        grid.add(phone, 0, 1);
        grid.add(writePhone, 1, 1);
        grid.add(email, 0, 2);
        grid.add(writeEmail, 1, 2);
        grid.add(btnSave, 1, 3);
        grid.add(registered, 0, 4);
        grid.add(cbxRegistered, 1, 4);
        grid.add(btnRemove, 1, 5);

        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(30)); 
        grid.setHgap(15);               
        grid.setVgap(20);               
        
        btnSave.setPrefWidth(180);
        btnRemove.setPrefWidth(180);
        cbxRegistered.setPrefWidth(180);
        writeName.setPrefWidth(180);
   

        Scene scene = new Scene(grid, 450, 500);
        stage.setTitle("Customer Registration");
        stage.setScene(scene);
        stage.show();

  }
  public String toString (){
    return custName;
  }
    public static void main(String[] args) {
        launch(args);
    
}

}  