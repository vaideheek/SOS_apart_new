import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class PleaseProvideControllerClassName {

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField homeTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField phoneTestField;

    @FXML
    private Button registerButton;

    public void registerButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.close();
    }

}
