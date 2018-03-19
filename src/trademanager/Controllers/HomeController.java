/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trademanager.Controllers;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author skolniPC
 */
public class HomeController implements Initializable {

    
    
    private double initialX,initialY;
    
    
    @FXML
    private AnchorPane window;
    
    @FXML
    private ImageView Close;
    
    
    private  AnchorPane x;
    
    private  boolean isWindowOpen = false;
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
    private TableView<?> tableAlarms;
    @FXML
    private JFXButton SetAlarm;
    
    
    
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
    
    @FXML
    private void CloseProgram()
    {
        Stage stage = (Stage) Close.getScene().getWindow();
        stage.close();
    }
    
    
    @FXML
    private void ChangeScene(ActionEvent event) throws IOException
    { 
        
        
        //// BUG - při změně scény lze otevřít SetAlarm okno vícekrát///
        AnchorPane pane;
        String ID = getButtonID(event);
        
        switch(ID)
        {
            case "DetailedStatistics":
                 System.out.println(ID);
                 pane=FXMLLoader.load(getClass().getResource("DetailedStatistics.fxml"));
                 window.getChildren().setAll(pane);
                 break;
                 
                 
            case "Home":
                pane=FXMLLoader.load(getClass().getResource("Home.fxml"));
                window.getChildren().setAll(pane);
                break;
                
                
                
            case "Alarms":
                pane=FXMLLoader.load(getClass().getResource("Alarms.fxml"));
                window.getChildren().setAll(pane);
                break;
                
                
                // Vytvořít Nové okno menší ne puvodní s tabulkou na import dat ( ručné / nebo přes excel soubor)
            case "SetAlarm":
                if(isWindowOpen== false)
                {
                    
                    FXMLLoader fxml = new FXMLLoader();
                    fxml.setLocation(getClass().getResource("SetAlarm.fxml"));
                    Scene scene = new Scene(fxml.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.show();
                    isWindowOpen =true;
                }
                else
                    System.out.println("okno je open");
                break;
            case "ImportData":
                pane=FXMLLoader.load(getClass().getResource("ImportData.fxml"));
                window.getChildren().setAll(pane);
                break;
                
             case "EnterTrade":
                
                break;
            
                
                
                 
        
        }
    
    
    }
    
    
    public  String getButtonID(ActionEvent event)
    {
       
        Button btn = (Button) event.getSource();
        
    
    return btn.getId();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
