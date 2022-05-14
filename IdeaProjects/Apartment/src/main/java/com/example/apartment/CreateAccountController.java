package com.example.apartment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class CreateAccountController {

    @FXML
    private Button CreateAccountButton;

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

}
