package org.dei.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SpecifyCategoryScene3UI implements Initializable {

    private SpecifyCategoryUI specifyCategoryUI;

    @FXML
    private Button btnOK;
    @FXML
    private Label lblNotification;

    /**
     * Initializes the UI class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 

    public void setSpecifyCategoryUI(SpecifyCategoryUI specifyCategoryUI) {
        this.specifyCategoryUI = specifyCategoryUI;
    }

    public void showNotification(String notification) {
        this.lblNotification.setText(notification);
    }    

    @FXML
    private void btnOKAction(ActionEvent event) {
        this.specifyCategoryUI.getMainApp().toMainScene();
    }
    
}
