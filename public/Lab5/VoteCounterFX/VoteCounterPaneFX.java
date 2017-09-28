import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

// Created by T. Vo using a previous edition of Lewis book
// Modified by: Raymond Kim

// Panel for the GUI that tallies votes for two candidates,
// Joe and Sam.
public class VoteCounterPaneFX extends GridPane
{
    private int votesForJoe, votesForSam;
    private Button joe, sam;
    private Label labelJoe, labelSam, labelMessage;

    public VoteCounterPaneFX()
    {
    	votesForJoe = 0;
    	joe = new Button("Vote for Joe");
    	joe.setOnAction(this::processButtonPress);	// approach 1
//        joe.setOnAction(new ButtonHandler());		// approach 2
    	labelJoe = new Label("Votes for Joe: " + votesForJoe);
    	votesForSam = 0;
    	sam = new Button("Vote for Sam");
    	sam.setOnAction(this::processButtonPress);	// approach 1
//        sam.setOnAction(new ButtonHandler());		// approach 2
    	labelSam = new Label("Votes for Sam: " + votesForSam);
    	labelMessage = new Label(); // label message to determine winning/tie status
    	// align button and labels
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");
        // add the button and labels
        add(joe, 0, 0);
        add(labelJoe, 1, 0);
        add(sam, 0, 1);
        add(labelSam, 1, 1);
        add(labelMessage, 0, 2);
    }
	//----------------------------------------------
	// Updates the appropriate vote counter when a 
	// button is pushed for one of the candidates.
    // Display message for winner or if tie.
	//----------------------------------------------
    public void processButtonPress(ActionEvent event)	// approach 1
    {
    	// determine which button was pressed and update the count
    	if(event.getSource() == joe) {
    	    votesForJoe++;
    	    labelJoe.setText("Votes for Joe: " + votesForJoe);  		
    	} else {
    		votesForSam++;
    		labelSam.setText("Votes for Sam: " + votesForSam); 
    	}
    	// determine who is winning or if they are tie
        if(votesForSam > votesForJoe) {
        	labelMessage.setText("Sam is winning!");
        } else if (votesForSam == votesForJoe) {
        	labelMessage.setText("They are tied!");
        } else {
        	labelMessage.setText("Joe is winning!");
        }    	
    }

//    private class ButtonHandler implements EventHandler<ActionEvent>	// approach 2
//    {
//        @Override
//        public void handle(ActionEvent event)
//        {
//	        if(event.getSource() == joe) {
//	    	    votesForJoe++;
//	    	    labelJoe.setText("Votes for Joe: " + votesForJoe);  		
//	    	} else {
//	    		votesForSam++;
//	    		labelSam.setText("Votes for Sam: " + votesForSam); 
//	    		System.out.println(votesForSam);
//	    	}   
//	        
//	        if(votesForSam > votesForJoe) {
//	        	labelMessage.setText(sam + " is winning!");
//	        } else if (votesForSam == votesForJoe) {
//	        	labelMessage.setText(joe + " and " + sam + " are tie!");
//	        } else {
//	        	labelMessage.setText(joe + " is winning!");
//	        }
//        }
//    }
}
