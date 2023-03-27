package pt.isep.tp8.listatelefonica.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import pt.isep.tp8.listatelefonica.controller.AplicacaoController;

public class JanelaPrincipalUI implements Initializable {
    private AplicacaoController appController;
    private Stage novoContactoStage;

    @FXML
    private TextArea txtBoxListaTelefonica;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarNovoContactoScene.fxml"));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            
            novoContactoStage = new Stage();
            novoContactoStage.initModality(Modality.APPLICATION_MODAL);
            novoContactoStage.setTitle("Novo Contacto");
            novoContactoStage.setResizable(false);
            novoContactoStage.setScene(scene);
            
            appController = new AplicacaoController();
            appController.preencherListaTelefonica();
            atualizaTextBoxListaTelefonica();
            
            AdicionarNovoContactoUI novoContactoUI = loader.getController();
            novoContactoUI.associarParentUI(this);
        } catch (IOException ex) {
            criarAleta(Alert.AlertType.ERROR, "Erro", ex.getMessage());
        }
    }

    public AplicacaoController getAplicacaoController() {
        return appController;
    }

    public void atualizaTextBoxListaTelefonica() {
        txtBoxListaTelefonica.setText(appController.getListaTelefonica());
    }

    @FXML
    private void mnuContactosNovoAction(ActionEvent event) throws IOException {
        novoContactoStage.show();
    }

    @FXML
    private void mnuContactosSairAction(ActionEvent event) {
        Window window = txtBoxListaTelefonica.getScene().getWindow();
        window.fireEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

    @FXML
    private void mnuOpcoesAcercaAction(ActionEvent event) {
        criarAleta(Alert.AlertType.INFORMATION, "Acerca",
                "@Copyright\nPPROG 2019/2020").show();
    }

    private Alert criarAleta(Alert.AlertType tipoAlerta, String cabecalho, String mensagem) {
        Alert alerta = new Alert(tipoAlerta);
        
        alerta.setTitle("Aplicação");
        alerta.setHeaderText(cabecalho);
        alerta.setContentText(mensagem);
        
        return alerta;
    }
}