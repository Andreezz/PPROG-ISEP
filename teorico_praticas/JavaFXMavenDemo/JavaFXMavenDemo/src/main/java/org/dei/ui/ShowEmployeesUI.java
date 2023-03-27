package org.dei.ui;

import org.dei.controller.ShowEmployeesController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ShowEmployeesUI implements Initializable {

    private App mainApp;
    private ShowEmployeesController controller;
    
    @FXML
    private Button btnOK;
    @FXML
    private TextArea txtAreaEmployees;

    /**
     * Initializes the UI class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.controller = new ShowEmployeesController();
    }

    public App getMainApp() {
        return this.mainApp;
    }

    public ShowEmployeesController getController() {
        return this.controller;
    }
    
    public void setMainApp(App mainApp) {
        this.mainApp = mainApp;
    }    

    @FXML
    private void btnOKAction(ActionEvent event) {
        this.mainApp.toMainScene();
    }
    
    public void showEmployees(){
        this.txtAreaEmployees.setText(this.controller.getEmployees());
    }
    
}
