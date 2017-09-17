import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class SimpleDrawing extends Application
{
    //--------------------------------------------------------------------
    //  Creates and displays two Text objects in a JavaFX window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
    	int randRadius1, randRadius2, randRadius3;
    	int randWidth1, randWidth2, randWidth3;
    	int randHeight1, randHeight2, randHeight3;
		Random rand = new Random();
		/* Random radius for circles between 20 to 100 */
		randRadius1 = rand.nextInt(81) + 20; 
		randRadius2 = rand.nextInt(81) + 20; 
		randRadius3 = rand.nextInt(81) + 20; 
		/* Random width for rectangles between 50 to 150 */
		randWidth1 = rand.nextInt(101) + 50; 
		randWidth2 = rand.nextInt(101) + 50; 
		randWidth3 = rand.nextInt(101) + 50; 
		/* Random height for rectangles between 30 to 90 */
		randHeight1 = rand.nextInt(61) + 30; 
		randHeight2 = rand.nextInt(61) + 30; 
		randHeight3 = rand.nextInt(61) + 30;
    	
        Text hello = new Text(300, 290, "Raymond Kim"); // My name 
        Line myLine = new Line(300, 295, 395, 295);
        
        Circle circle1 = new Circle(200, 50, randRadius1);
        circle1.setFill(Color.GREEN);    
        Circle circle2 = new Circle(280, 100, randRadius2);
        circle2.setFill(Color.BLUE);    
        Circle circle3 = new Circle(320, 200, randRadius3);
        circle3.setFill(Color.RED);
        
        Rectangle rect1 = new Rectangle(10, 10, randWidth1, randHeight1);
        rect1.setFill(Color.ORANGE);
        Rectangle rect2 = new Rectangle(20, 100, randWidth2, randHeight2);
        rect2.setFill(Color.BLACK);
        Rectangle rect3 = new Rectangle(60, 200, randWidth3, randHeight3);
        rect3.setFill(Color.MAROON);
        
        
        Group root = new Group(hello, myLine, circle1, circle2, circle3, rect1, rect2, rect3);
        Scene scene = new Scene(root, 400, 300, Color.WHITE);

     
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
