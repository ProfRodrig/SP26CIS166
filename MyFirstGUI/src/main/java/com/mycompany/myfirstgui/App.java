package com.mycompany.myfirstgui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    // fields
    private int windowWidth;
    private int windowHeight;
    private int currentImage;
    @Override
    public void start(Stage stage) 
    {
        windowWidth = 1080;
        windowHeight = 640;
        currentImage = 0; // 0 means dog, 1 means cat
        
       // Create Controls
        Label title = new Label("Click the button to change the image!");
        Image dogImage = new Image("https://media.tenor.com/58DNSt-Lvw0AAAAM/corgi-computer.gif");
        Image catImage = new Image("file:cat.gif");
        Image gallery[] = {new Image("file:bird.gif"), catImage, dogImage};
        ImageView imageDisplay = new ImageView(gallery[0]);
        Button flipButton = new Button("Flip Image!");
        
        // set Event Handler
        flipButton.setOnAction( event -> 
        {
            currentImage = (currentImage + 1) % gallery.length;
            //System.out.println("current Image is: " + gallery.length);
            imageDisplay.setImage(gallery[currentImage]);
        });
        
        
        // Image adjustments
        imageDisplay.setFitWidth(.50 * windowWidth);
        imageDisplay.setFitHeight(.50 * windowHeight);
        
        // Create layout elements and place controls in it
        VBox layout = new VBox(title, imageDisplay, flipButton);
        layout.setSpacing(.05 * windowHeight);
        layout.setAlignment(Pos.CENTER);
        
        // Create Scene and add layout to scene
        Scene scene1 = new Scene(layout, windowWidth, windowHeight);
        
        // Set the scene onto the stage
        stage.setScene(scene1);
        stage.show(); // displays the window
        
    }

    public static void main(String[] args) {
        launch();
    }

}