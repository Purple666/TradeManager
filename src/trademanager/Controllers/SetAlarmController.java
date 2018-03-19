/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trademanager.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author skolniPC
 */
public class SetAlarmController implements Initializable {

    @FXML
    private AnchorPane window;
    @FXML
    private ImageView Close;
    
    
     private double initialX;
    private double initialY;
    private AnchorPane x;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CloseProgram(MouseEvent event) {
    }

    @FXML
    public void mousePressed(MouseEvent evt)
    {
        initialX=evt.getSceneX();
        initialY= evt.getSceneY();
    }
    
    @FXML
    private void moveWindow(MouseEvent  evt)        
    {
        x=(AnchorPane) evt.getSource();
        x.getScene().getWindow().setX(evt.getScreenX()-initialX);
        x.getScene().getWindow().setY(evt.getScreenY()-initialY); 

    }
    
}
