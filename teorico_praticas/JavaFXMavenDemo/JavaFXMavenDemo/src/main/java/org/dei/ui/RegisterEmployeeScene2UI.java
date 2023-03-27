package org.dei.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RegisterEmployeeScene2UI implements Initializable {

    private RegisterEmployeeUI registerEmployeeUI;

    @FXML
    private Button btnConfirm;
    @FXML
    private Button btnReturn;
    @FXML
    private Label lblEmployee;
    @FXML
    private Button btnCancel;

    /**
     * Initializes the UI class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void setRegisterEmployeeUI(RegisterEmployeeUI registerEmployeeUI) {
        this.registerEmployeeUI = registerEmployeeUI;
    }

    public void showEmployee() {
        String strEmployee = registerEmployeeUI.getController().getEmployee();
        this.lblEmployee.setMinWidth(strEmployee.length());
        this.lblEmployee.setText(strEmployee);
    }

    @FXML
    private void btnConfirmAction(ActionEvent event) {
        boolean registered = this.registerEmployeeUI.
                getController().registerEmployee();
        String notification;
        if (registered) {
            notification = "Register Employee Success.";
        } else {
            notification = "Register Employee Insuccess.";
        }
        this.registerEmployeeUI.toRegisterEmployeeScene3(notification);
        this.registerEmployeeUI.getController().setEmployee(null);
    }

    @FXML
    private void btnReturnAction(ActionEvent event) {
        this.registerEmployeeUI.toRegisterEmployeeScene1();
    }

    @FXML
    private void btnCancelAction(ActionEvent event) {
        this.registerEmployeeUI.getMainApp().toMainScene();
    }

}
