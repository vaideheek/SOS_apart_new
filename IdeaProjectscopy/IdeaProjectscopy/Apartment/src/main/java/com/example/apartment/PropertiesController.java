package com.example.apartment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PropertiesController {

    @FXML
    Button debbutton;

    @FXML
    Button budbutton;

    @FXML
    Button szegbutton;

    @FXML
    Button pecsbutton;

    @FXML
    public void debButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        Stage stage = (Stage) debbutton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));

    }

    @FXML
    public void budButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        Stage stage = (Stage) budbutton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));

    }
    @FXML
    public void szegButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        Stage stage = (Stage) szegbutton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));

    }
    @FXML
    public void pecsButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        Stage stage = (Stage) pecsbutton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));

    }
}
