package org.dei.ui;

import org.dei.controller.RegisterEmployeeController;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterEmployeeUI {

    private App mainApp;
    private RegisterEmployeeController controller;

    public RegisterEmployeeUI(App mainApp) {
        this.mainApp = mainApp;
        this.controller = new RegisterEmployeeController();
    }

    public App getMainApp() {
        return this.mainApp;
    }

    public RegisterEmployeeController getController() {
        return this.controller;
    }
    
    public void toRegisterEmployeeScene1() {
        try {
            RegisterEmployeeScene1UI registerEmployeeScene1UI
                    = (RegisterEmployeeScene1UI) this.mainApp.
                            replaceSceneContent("/fxml/RegisterEmployee_1.fxml");
            registerEmployeeScene1UI.setRegisterEmployeeUI(this);
            String employee = this.controller.getEmployee();
            registerEmployeeScene1UI.initComboBox();
            if (employee != null) {
                registerEmployeeScene1UI.showEmployee();
            }
            registerEmployeeScene1UI.getTxtNumber().requestFocus();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void toRegisterEmployeeScene2() {
        try {
            RegisterEmployeeScene2UI registerEmployeeScene2UI
                    = (RegisterEmployeeScene2UI) this.mainApp.
                            replaceSceneContent("/fxml/RegisterEmployee_2.fxml");
            registerEmployeeScene2UI.setRegisterEmployeeUI(this);
            String employee = this.getController().getEmployee();
            registerEmployeeScene2UI.showEmployee();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void toRegisterEmployeeScene3(String notification) {
        try {
            RegisterEmployeeScene3UI registerEmployeeScene3UI = 
                    (RegisterEmployeeScene3UI) this.mainApp.
                            replaceSceneContent("/fxml/RegisterEmployee_3.fxml");
            registerEmployeeScene3UI.setRegisterEmployeeUI(this);
            registerEmployeeScene3UI.showNotification(notification);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
