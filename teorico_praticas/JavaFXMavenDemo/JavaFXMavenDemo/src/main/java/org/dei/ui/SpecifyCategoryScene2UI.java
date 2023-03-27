package org.dei.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SpecifyCategoryScene2UI implements Initializable {

    private SpecifyCategoryUI specifyCategoryUI;
    
    @FXML
    private Button btnConfirm;
    @FXML
    private Button btnReturn;
    @FXML
    private Label lblCategory;
    @FXML
    private Button btnCancel;

    /**
     * Initializes the UI class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 

    public void setSpecifyCategoryUI(SpecifyCategoryUI specifyCategoryUI) {
        this.specifyCategoryUI = specifyCategoryUI;
    }
    
    public void showCategory() {
        this.lblCategory.setText(this.specifyCategoryUI.getController().getCategory());
    }    

    @FXML
    private void btnConfirmAction(ActionEvent event) {
        boolean registered = this.specifyCategoryUI.
                getController().registerCategory();
        String notification;
        if (registered) {
            notification = "Specify Category Success.";
        } else {
            notification = "Specify Category Insuccess.";
        }
        this.specifyCategoryUI.toSpecifyCategoryScene3(notification);        
    }


    @FXML
    private void btnReturnAction(ActionEvent event) {
        this.specifyCategoryUI.toSpecifyCategoryScene1();        
    }

    @FXML
    private void btnCancelAction(ActionEvent event) {
        this.specifyCategoryUI.getMainApp().toMainScene();
    }
    
}
