import java.util.Scanner;
 
public class Square
{
    int[][] square;
 
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size) {
      square = new int[size][size];
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row) {
	    int sum = 0;
	    for(int i = 0; i < square.length; i++) {
	    	sum = sum + square[row][i];
	    }
	    return sum;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col) {
	    int sum = 0;
	    for(int i = 0; i < square.length; i++) {
	    	sum = sum + square[i][col];
	    }
	    return sum;
    }
 
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag() {
	    int sum = 0;
	    for(int i = 0; i < square[0].length; i++) {
	    	sum = sum + square[i][i];
	    }
	    return sum;
    }
 
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag() {
	    int sum = 0;
	    int x = square.length;
	    for(int i = 0; i < x; i++) {
	    	sum = sum + square[x-1-i][i];
	    }
	    return sum;
    }
 
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic(int[] sums) {
	    boolean bool = true;
		    for(int i = 0; i < sums.length; i++) {
			    if(i + 1 != sums.length) {
				    if(sums[i] == sums[i+1]) {
				    	bool = true;
				    } else {
					    i = sums.length;
					    bool = false;
				    }
			    }    
		    }
	    return bool;
    }
 
    //--------------------------------------
    //read info into the square from the input stream associated with the
    //Scanner parameter
    //--------------------------------------
    public void readSquare(Scanner scan) {
	    for (int row = 0; row < square.length; row++) {
		    for (int col = 0; col < square.length; col ++) {
		    	square[row][col] = scan.nextInt();
		    }
	    }
    }
 
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare() {
	    for(int row = 0; row < square.length; row++) {
			for (int col = 0; col < square.length; col++) {
				System.out.print(square[row][col] + " ");
			}
			System.out.println();
	    }
    }
 
}
