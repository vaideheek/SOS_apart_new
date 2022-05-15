package com.example.apartment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import java.io.File;
import java.sql.*;
import java.util.ResourceBundle;

import java.net.URL;

import java.sql.Connection;

public class CreateAccountController implements Initializable {

    @FXML
    private Button CreateAccountButton;
    @FXML
    private ImageView brandingImageView;

    @Override
    public void initialize(URL url ,ResourceBundle resourceBundle){
        File brandingFILE = new File("src/main/resources/com/image/logo.png");
        Image brandingImage = new Image(brandingFILE.toURI().toString());
        brandingImageView.setImage(brandingImage);
    }

    public void CreateAccountButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) CreateAccountButton.getScene().getWindow();
        stage.close();
    }
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

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;


}
