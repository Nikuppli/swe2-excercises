package ch.juventus.fx2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class NewFxmlController {
    @FXML
    private Label actiontarget;
    @FXML
    private TextField name;

    @FXML
    protected void onSubmit(ActionEvent event) {
        String inputName = name.getText();
        actiontarget.setText("Submit button pressed, name is " + inputName);
    }
}
