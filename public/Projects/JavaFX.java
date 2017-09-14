import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFX extends Application
{
    //--------------------------------------------------------------------
    //  Creates and displays two Text objects in a JavaFX window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Text hello = new Text(50, 50, "Hello, JavaFX!");
        Text question = new Text(120, 80, "How's it going?");
        
        Circle head = new Circle(80, 70, 30);
        head.setFill(Color.WHITE);    
        
        
        Group root = new Group(hello, question, head);
        Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);

        
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Launches the JavaFX application. This method is not required
    //  in IDEs that launch JavaFX applications automatically.
    //--------------------------------------------------------------------
    public static void main(String[] args)
    {
        launch(args);
    }
}
