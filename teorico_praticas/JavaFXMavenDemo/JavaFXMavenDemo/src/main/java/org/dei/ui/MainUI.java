package org.dei.ui;

import org.dei.controller.ApplicationEM;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class MainUI implements Initializable {

    private App mainApp;

    @FXML
    private Button btnRegisterEmployee;
    @FXML
    private Button btnSpecifyCategory;
    @FXML
    private Button btnShowEmployees;

    /**
     * Initializes the UI class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.btnRegisterEmployee.setDisable(ApplicationEM.getInstance().getCompany().
                getRegisterCategories().getCategories().isEmpty());
        this.btnShowEmployees.setDisable(ApplicationEM.getInstance().getCompany().
                getRegisterEmployees().getEmployees().isEmpty());
    }

    public void setMainApp(App mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void btnRegisterEmployeeAction(ActionEvent event) {
        RegisterEmployeeUI registerEmployeesUI
                = new RegisterEmployeeUI(this.mainApp);
        registerEmployeesUI.toRegisterEmployeeScene1();
    }

    @FXML
    private void btnSpecifyCategoryAction(ActionEvent event) {
        SpecifyCategoryUI specifyCategoryUI
                = new SpecifyCategoryUI(this.mainApp);
        specifyCategoryUI.toSpecifyCategoryScene1();
    }

    @FXML
    private void btnShowEmployeesAction(ActionEvent event) {
        try {
            ShowEmployeesUI showEmployeesUI = (ShowEmployeesUI) this.mainApp.
                    replaceSceneContent("/fxml/ShowEmployees.fxml");
            showEmployeesUI.setMainApp(this.mainApp);
            showEmployeesUI.showEmployees();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
