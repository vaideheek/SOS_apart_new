package com.example.apartment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.sql.*;
import java.util.ResourceBundle;

import java.net.URL;

import java.sql.Connection;

public class LoginController {
    @FXML
    private Button loginButton;


    public void loginButtonOnAction(ActionEvent event){
        Stage stage = (Stage)  loginButton.getScene().getWindow();
        stage.close();
    }
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /*public void validateLogin(){
        DBconnection connectNow = new DBconnection() ;
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM login_db.user_account WHERE username = '" + usernameTextField.getText() + "'AND password ='" + enterPasswordField.getText()  + "''";
        try{
            Statement statement = connectDB.createStatement();
            ResultSet QueryResult = statement.executeQuery(verifyLogin);

            while(QueryResult.next()){
                if(QueryResult.getInt(1)==1){
                    loginMesssagelabel.setText("ok");

                }else{
                    loginMesssagelabel.setText("Wrong username or password");
                }

            }

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }*/
}
