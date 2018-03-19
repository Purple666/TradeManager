/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trademanager.Controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author skolniPC
 */
public class AlarmController implements Initializable {

    @FXML
    private AnchorPane window;
    @FXML
    private Pane MenuPane1;
    @FXML
    private JFXButton Home;
    @FXML
    private JFXButton ImportData;
    @FXML
    private JFXButton Alarms;
    @FXML
    private JFXButton DetailedStatistics;
    @FXML
    private ImageView Close;
    @FXML
    private TableView<?> tableAlarms;
    @FXML
    private JFXButton SetAlarm;
    
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
    private void ChangeScene(ActionEvent event) {
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
