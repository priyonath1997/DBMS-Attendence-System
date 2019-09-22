
package attendance;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;

import java.awt.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;



public class MainSceneController implements Initializable {

    @FXML
    private BorderPane rootLayout;
    
    @FXML
    private ImageView imageview;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        Image image=new Image("@dsce.png");
        imageview.setImage(image);
    }

    

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
         changeScene("ClassScene.fxml");
        
    }    

    @FXML
    private void setSTScene(ActionEvent event) {
        changeScene("STScene.fxml");
        
    }
    
    
    public  void changeScene(String scenePath){
        
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource(scenePath));
        AnchorPane pane = new AnchorPane();
           
    try{
            pane = (AnchorPane) loader.load();
            rootLayout.setCenter(pane);
        }
        catch(Exception e){

        }
     
    }

    @FXML
    private void setAttendanceScene(ActionEvent event) {
        changeScene("AttendanceScene.fxml");
    }
    
     @FXML
    private void setClassScene(ActionEvent event) {
        changeScene("ClassScene.fxml");
    }
    
}

