import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Created by T. Vo using a previous edition of Lewis book
// Modified by: Raymond Kim

// Demonstrates a graphical user interface and event
// listeners to tally votes for two candidates, Joe and Sam.
public class VoteCounterFX extends Application
{
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new VoteCounterPaneFX(), 300, 150);
      
        primaryStage.setTitle("Vote Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
