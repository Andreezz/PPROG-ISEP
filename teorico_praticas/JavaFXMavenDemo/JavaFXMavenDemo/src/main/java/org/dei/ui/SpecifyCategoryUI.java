package org.dei.ui;

import org.dei.controller.SpecifyCategoryController;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpecifyCategoryUI {

    private final App mainApp;
    private final SpecifyCategoryController controller;

    public SpecifyCategoryUI(App mainApp) {
        this.mainApp = mainApp;
        this.controller = new SpecifyCategoryController();
    }

    public App getMainApp() {
        return this.mainApp;
    }

    public SpecifyCategoryController getController() {
        return this.controller;
    }
    
    public void toSpecifyCategoryScene1() {
        try {
            SpecifyCategoryScene1UI specifyCategoryScene1UI = 
                    (SpecifyCategoryScene1UI) this.mainApp.
                            replaceSceneContent("/fxml/SpecifyCategory_1.fxml");
            specifyCategoryScene1UI.setSpecifyCategory(this);
            String category = this.getController().getCategory();
            if (category != null) {
                specifyCategoryScene1UI.showCategory();
            }
            specifyCategoryScene1UI.getTxtId().requestFocus();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void toSpecifyCategoryScene2() {
        try {
            SpecifyCategoryScene2UI specifyCategoryScene2UI = 
                    (SpecifyCategoryScene2UI) this.mainApp.
                            replaceSceneContent("/fxml/SpecifyCategory_2.fxml");
            specifyCategoryScene2UI.setSpecifyCategoryUI(this);
            specifyCategoryScene2UI.showCategory();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void toSpecifyCategoryScene3(String notification) {
        try {
            SpecifyCategoryScene3UI specifyCategoryScene3UI = 
                    (SpecifyCategoryScene3UI) this.mainApp.
                            replaceSceneContent("/fxml/SpecifyCategory_3.fxml");
            specifyCategoryScene3UI.setSpecifyCategoryUI(this);
            specifyCategoryScene3UI.showNotification(notification);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
