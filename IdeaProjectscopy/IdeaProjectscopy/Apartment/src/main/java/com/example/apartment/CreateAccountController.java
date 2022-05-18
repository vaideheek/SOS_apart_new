package com.example.apartment;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
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
    private PasswordField PasswordField;

    @FXML
    private PasswordField ConfirmPassField;
    @FXML
    private Button SaveUserButton;
    @FXML
    private Label SavedMessageLabel;
    @FXML
    private Label MatchMessageLabel;



    @FXML
    public MenuItem back;

    @FXML
    public AnchorPane mainPane;
    @FXML
    public MenuBar topMenu;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    void SaveUserButtonOnAction(ActionEvent event) {

        if(PasswordField.getText().equals(ConfirmPassField.getText())){
            MatchMessageLabel.setText("");
            SaveUser();

        }else{
            MatchMessageLabel.setText("Password does not match");


        }

    }

    public void SaveUser(){

        DBconnection connect = new DBconnection();
        Connection connectdb = connect.getConnection();

        String firstname = FirstNameTextField.getText();
        String lastname = LastNameTextField.getText();
        String username = UsernameTextField.getText();
        String password = PasswordField.getText();

        String insertfields = "INSERT INTO new_db.user_tab(firstname,lastname,username,password)" +
                "VALUES ('" + firstname + "','" + lastname + "','" + username + "','" + password + "');";
        //String insertvalues = firstname + "','" + lastname + "','" + username + "','" + password + "');";
        //String inserttodb= insertfields + insertvalues;

        try{
            Statement statement = connectdb.createStatement();
             statement.executeUpdate(insertfields);

            SavedMessageLabel.setText("User Saved Successfully");

        }catch(Exception e){
            e.printStackTrace( );
            e.getCause();

        }


    }

    @FXML
    public void CreateAccountButtonOnAction(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("login-page.fxml"));
        Stage stage = (Stage) CreateAccountButton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));

    }

    @FXML
    public void Handleback(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("login-page.fxml"));
        Stage Stage = (Stage)this.topMenu.getScene().getWindow();
        Stage.setScene(new Scene(root, 600, 400));
}
}
