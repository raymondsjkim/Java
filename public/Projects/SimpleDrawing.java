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
    public void start(Stage primaryStage)
    {
    	int randRadius1, randRadius2, randRadius3; // radius for circles
    	int randCircleWidth1, randCircleWidth2, randCircleWidth3;  // circle location width
    	int randCircleHeight1, randCircleHeight2, randCircleHeight3; // circle location height
    	int randWidth1, randWidth2, randWidth3; // rectangle width
    	int randHeight1, randHeight2, randHeight3; // rectangle height
    	int randRectWidth1, randRectWidth2, randRectWidth3; // rectangle location width
    	int randRectHeight1, randRectHeight2, randRectHeight3; // rectangle location height
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
	/* Random width(0 to 400) and height(0 to 300) for each Circle location  */
	randCircleWidth1 = rand.nextInt(401) + 0; 
	randCircleWidth2 = rand.nextInt(401) + 0; 
	randCircleWidth3 = rand.nextInt(401) + 0;  
	randCircleHeight1 = rand.nextInt(301) + 0; 
	randCircleHeight2 = rand.nextInt(301) + 0;
	randCircleHeight3 = rand.nextInt(301) + 0;
	/* Random width(0 to 400) and height(0 to 300) for each Rectangle location  */
	randRectWidth1 = rand.nextInt(401) + 0; 
	randRectWidth2 = rand.nextInt(401) + 0; 
	randRectWidth3 = rand.nextInt(401) + 0; 
	randRectHeight1 = rand.nextInt(301) + 0;
	randRectHeight2 = rand.nextInt(301) + 0;
	randRectHeight3 = rand.nextInt(301) + 0;
    	/* Create text object with my name */
        Text hello = new Text(300, 290, "Raymond Kim"); // name 
        /* Create line object to underline my name */
        Line myLine = new Line(300, 295, 395, 295); // underline my name
        /* Create circle objects */
        Circle circle1 = new Circle(randCircleWidth1, randCircleHeight1, randRadius1);
        circle1.setFill(Color.GREEN);    
        Circle circle2 = new Circle(randCircleWidth2, randCircleHeight2, randRadius2);
        circle2.setFill(Color.BLUE);    
        Circle circle3 = new Circle(randCircleWidth3, randCircleHeight3, randRadius3);
        circle3.setFill(Color.RED);
        /* Create rectangle objects */
        Rectangle rect1 = new Rectangle(randRectWidth1, randRectHeight1, randWidth1, randHeight1);
        rect1.setFill(Color.ORANGE);
        Rectangle rect2 = new Rectangle(randRectWidth2, randRectHeight2, randWidth2, randHeight2);
        rect2.setFill(Color.BLACK);
        Rectangle rect3 = new Rectangle(randRectWidth3, randRectHeight3, randWidth3, randHeight3);
        rect3.setFill(Color.MAROON);
        /* add objects in root group */
        Group root = new Group(hello, myLine, circle1, circle2, circle3, rect1, rect2, rect3);
        /* add root group in scene and set the screen width, height, and background color */
        Scene scene = new Scene(root, 400, 300, Color.WHITE);
        /* set the title, set the scene, and display it */
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
