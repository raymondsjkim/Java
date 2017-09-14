
//************************************************************************
//  
//	https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Circle.html
//  
//************************************************************************

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloJavaFX extends Application
{
    //--------------------------------------------------------------------
    //  Creates and displays two Text objects in a JavaFX window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Text hello = new Text(50, 50, "Hello, JavaFX!");
        Text question = new Text(120, 80, "How's it going?");
        
        Circle head1 = new Circle(100, 50, 20);
        head1.setFill(Color.WHITE);    
        Circle head2 = new Circle(200, 60, 50);
        head2.setFill(Color.BLUE);    
        Circle head3 = new Circle(300, 70, 100);
        head3.setFill(Color.RED);    
        
        Group root = new Group(hello, question, head1, head2, head3);
        Scene scene = new Scene(root, 400, 300, Color.LIGHTGREEN);

     
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
