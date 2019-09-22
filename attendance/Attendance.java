
package attendance;

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



public class Attendance extends Application {
    
   @FXML
    private ImageView imageView;
    
    
   @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("DSCE Attendence System");
        stage.setScene(scene);
        stage.show();
        
         try 
        {
     
        Image image = new Image("@dsce.png");
        imageView = new ImageView(image);

        
        stage.setScene(scene);
        stage.show();
    } 
         catch(Exception e)
    {
        e.printStackTrace();
    }}

   
    public static void main(String[] args) {
        launch(args);
    }
    
    
}


