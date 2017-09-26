import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

// Created by T. Vo using a previous edition of Lewis book
// Modified by:

// Panel for the GUI that tallies votes for two candidates,
// Joe and Sam.

public class VoteCounterPaneFX extends GridPane
{
    private int votesForJoe;
    private Button joe;
    private Label labelJoe;

    public VoteCounterPaneFX()
    {
    	votesForJoe = 0;

    	joe = new Button("Vote for Joe");
//    	joe.setOnAction(this::processButtonPress);	// approach 1
        joe.setOnAction(new ButtonHandler());		// approach 2

    	labelJoe = new Label("Votes for Joe: " + votesForJoe);
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");
        
        add(joe, 0, 0);
        add(labelJoe, 1, 0);
    }
    
	//----------------------------------------------
	// Updates the appropriate vote counter when a 
	// button is pushed for one of the candidates.
	//----------------------------------------------
//    public void processButtonPress(ActionEvent event)	// approach 1
//    {
//	    votesForJoe++;
//	    labelJoe.setText("Votes for Joe: " + votesForJoe);
//    }

    private class ButtonHandler implements EventHandler<ActionEvent>	// approach 2
    {
        @Override
        public void handle(ActionEvent event)
        {
    	    votesForJoe++;
    	    labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
    
}
