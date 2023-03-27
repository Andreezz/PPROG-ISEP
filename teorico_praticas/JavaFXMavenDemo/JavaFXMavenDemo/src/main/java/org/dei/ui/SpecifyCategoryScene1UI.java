package org.dei.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class SpecifyCategoryScene1UI implements Initializable {

    private SpecifyCategoryUI specifyCategory;
    
    @FXML
    private Button btnNext;
    @FXML
    private Label lblAlert;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtDescription;
    @FXML
    private Button btnCancel;

    /**
     * Initializes the UI class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 
    
    public TextField getTxtId() {
        return this.txtId;
    } 

    public void setSpecifyCategory(SpecifyCategoryUI specifyCategory) {
        this.specifyCategory = specifyCategory;
    }
    
    public void showCategory() {
        this.txtId.setText(this.specifyCategory.getController().getCategoryId());
        this.txtDescription.setText(this.specifyCategory.getController().getCategoryDescription());
    }    

    @FXML
    private void btnNextAction(ActionEvent event) {
        try {
            this.specifyCategory.getController().
                    newCategory(txtId.getText(), txtDescription.getText());
            this.specifyCategory.toSpecifyCategoryScene2();
        } catch (IllegalArgumentException ex) {
            lblAlert.setText(ex.getMessage());
            if (ex.getMessage().toLowerCase().contains(" id")) {
                txtId.requestFocus();
            } else {
                txtDescription.requestFocus();
            }
        }        
    }

    @FXML
    private void txtIdKeyPressed(KeyEvent event) {
        this.lblAlert.setText(null);
    }

    @FXML
    private void txtDescriptionKeyPressed(KeyEvent event) {
        this.lblAlert.setText(null);
    }

    @FXML
    private void btnCancelAction(ActionEvent event) {
        this.specifyCategory.getMainApp().toMainScene();
    }
    
}
