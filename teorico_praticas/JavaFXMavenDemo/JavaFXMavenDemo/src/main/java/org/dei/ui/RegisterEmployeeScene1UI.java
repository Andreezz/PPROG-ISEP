package org.dei.ui;

import org.dei.controller.RegisterEmployeeController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class RegisterEmployeeScene1UI implements Initializable {

    private RegisterEmployeeUI registerEmployeeUI;

    @FXML
    private Button btnNext;
    @FXML
    private Label lblAlert;
    @FXML
    private TextField txtNumber;
    @FXML
    private TextField txtName;
    @FXML
    private ComboBox<String> cmbCategory;
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

    public TextField getTxtNumber() {
        return this.txtNumber;
    }

    public void initComboBox() {
        RegisterEmployeeController controller = this.registerEmployeeUI.
                getController();
        ObservableList<String> options
                = FXCollections.observableArrayList(controller.getCategoriesAsStringSet());
        this.cmbCategory.setItems(options);
    }

    public void showEmployee() {
        this.txtNumber.setText(this.registerEmployeeUI.getController().getNumber());
        this.txtName.setText(this.registerEmployeeUI.getController().getName());
        this.cmbCategory.setValue(this.registerEmployeeUI.getController().getCategory());
    }

    @FXML
    private void btnNextAction(ActionEvent event) {
        try {
            int number = Integer.parseInt(this.txtNumber.getText());
            String name = this.txtName.getText();
            String category = this.cmbCategory.
                    getSelectionModel().getSelectedItem();
            this.registerEmployeeUI.getController().
                    newEmployee(number, name, category);
            this.registerEmployeeUI.toRegisterEmployeeScene2();
        } catch (NumberFormatException ex) {
            this.lblAlert.setText("Invalid number!");
            this.txtNumber.requestFocus();
        } catch (IllegalArgumentException ex) {
            this.lblAlert.setText(ex.getMessage());
            if (ex.getMessage().toLowerCase().contains("name")) {
                this.txtName.requestFocus();
            } else {
                this.cmbCategory.requestFocus();
            }
        }
    }

    @FXML
    private void txtNumberKeyPressed(KeyEvent event) {
        this.lblAlert.setText(null);
    }

    @FXML
    private void txtNameKeyPressed(KeyEvent event) {
        this.lblAlert.setText(null);
    }

    @FXML
    private void cmbCategoryAction(ActionEvent event) {
        this.lblAlert.setText(null);
    }

    @FXML
    private void btnCancelAction(ActionEvent event) {
        this.registerEmployeeUI.getMainApp().toMainScene();
    }

}
