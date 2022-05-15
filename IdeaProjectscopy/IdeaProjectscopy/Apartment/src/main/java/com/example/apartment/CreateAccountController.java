package com.example.apartment;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.net.URL;

import java.sql.Connection;

public class CreateAccountController implements Initializable {

    @FXML
    private Button CreateAccountButton;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField EmailTextField;

    @FXML
    private TextField FirstNameTextField;

    @FXML
    private TextField LastNameTextField;

    @FXML
    private TextField UsernameTextField;

    @FXML
    private TextField enterConfirmPasswordField;

    @FXML
    private TextField enterPasswordField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFILE = new File("src/main/resources/com/image/logo.png");
        Image brandingImage = new Image(brandingFILE.toURI().toString());
        brandingImageView.setImage(brandingImage);
    }

    @FXML
    public void CreateAccountButtonOnAction(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("properties.fxml"));
        Stage stage = (Stage) CreateAccountButton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));




    }
}
