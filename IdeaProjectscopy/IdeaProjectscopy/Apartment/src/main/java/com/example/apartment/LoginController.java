package com.example.apartment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import java.net.URL;

import java.sql.Connection;

public class LoginController /*implements Initializable */{
    @FXML
    private Button loginButton;

    @FXML
    private Button CreateAnAccountButton;



   @FXML
    public void loginButtonOnAction(ActionEvent event) {

       Stage stage = (Stage) loginButton.getScene().getWindow();
       stage.close();

   }

    public void CreateAnAccountButtonOnAction(ActionEvent event){
        Stage stage = (Stage)  CreateAnAccountButton.getScene().getWindow();
        stage.close();
    }

    
    



}
