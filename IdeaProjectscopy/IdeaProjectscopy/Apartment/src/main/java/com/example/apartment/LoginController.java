package com.example.apartment;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import java.net.URL;

import java.sql.Connection;

public class LoginController /*implements Initializable*/ {
    @FXML
    Button loginButton;

    @FXML
    Button CreateAnAccountButton;

    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;

    @FXML
    private Label loginMessagelabel;



    @FXML
    public void loginButtonOnAction(ActionEvent event) throws IOException {
        /*Parent root = FXMLLoader.load(getClass().getResource("properties.fxml"));
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));*/
        if(usernameTextField.getText().isBlank()==false && enterPasswordField.getText().isBlank()==false){
            validateLogin();
        }else {
            loginMessagelabel.setText("Please enter username and password");
        }


    }
    @FXML
    public void CreateAnAccountButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("createaccount.fxml"));
        Stage stage = (Stage)  CreateAnAccountButton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));
    }

    public void validateLogin(){
        DBconnection connectNow = new DBconnection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT count(1) FROM new_db.user_tab WHERE username = '" + usernameTextField.getText() + "' AND password = '" + enterPasswordField .getText() + "'";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next()){
                if(queryResult.getInt(1)==1){
                    //loginMessagelabel.setText("Success");
                    Parent root = FXMLLoader.load(getClass().getResource("properties.fxml"));
                    Stage stage = (Stage) loginButton.getScene().getWindow();
                    stage.setScene(new Scene(root, 600, 400));
                }else{
                    loginMessagelabel.setText("Wrong username or password");
                }

            }

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();

        }



    }
    /*@Override
    public void initialize (URL url, ResourceBundle rb){

    }*/





}