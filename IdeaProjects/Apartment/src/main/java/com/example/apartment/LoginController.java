package com.example.apartment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class LoginController {
    @FXML
    private Button loginButton;

    public void loginButtonOnAction(ActionEvent event){
        Stage stage = (Stage)  loginButton.getScene().getWindow();
        stage.close();
    }
}
