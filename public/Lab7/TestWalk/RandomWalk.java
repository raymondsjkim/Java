import java.util.Random;
public class RandomWalk {
	private int xCoord, yCoord, maxSteps, numSteps, boundary;
	public RandomWalk(int max, int edge) {
		xCoord = 0;
		yCoord = 0;
		numSteps = 0;
		maxSteps = max;
		boundary = edge;
	}
	public RandomWalk(int max, int edge, int startX, int startY) {
		maxSteps = max;
		boundary = edge;
		xCoord = startX;
		yCoord = startY;
		numSteps = 0;
	}
	// Simulates taking either a step up, down, left, right
	public void takeStep() {
		Random rand = new Random();
		int singleStep = rand.nextInt(4);
        switch (singleStep) {
	        case 0:  
	        		xCoord++; // up
	        		numSteps++;
	        		break;
	        case 1:  
	        		yCoord++; // right
	        		numSteps++;
	        		break;
	        case 2:  
	        		xCoord--; // down
	        		numSteps++;
	        		break;
	        case 3:  
	        		yCoord--; // left
	        		numSteps++;
	        		break;
	        	default:
	        		System.out.println("Error.");
        }
	}
	// returns true if number of steps taken is less than
	// the maximum number of steps, else returns false
	public boolean moreSteps() {
		if(numSteps < maxSteps) {
			return true;
		} else {
			return false;
		}
	}
	// return true if current position is on the square, 
	// else return false.
	public boolean inBounds() {
		if(xCoord <= boundary && xCoord >= boundary * (-1) && yCoord <= boundary && yCoord >= boundary * (-1)) {
			return true;
		} else {
			return false;
		}
	}
	// simulate a complete random walk
	public void walk() {
		while(this.moreSteps() && this.inBounds()) {
			this.takeStep();
		}
	}
	
	// ----------------------------------------------------------
	// Returns the person's name and age as a string.
	// ----------------------------------------------------------
	public String toString() {
		return "Steps: " + numSteps + " Position: (" + xCoord + ", " + yCoord + ")";
	}
}
