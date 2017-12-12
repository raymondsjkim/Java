import java.util.Scanner;

public class Square {
    int[][] square;
    int size;
    // --------------------------------------
    // create new square of given size
    // --------------------------------------
    public Square(int size) {
        square = new int[size][size];
        this.size = size;
    }
    // --------------------------------------
    // return the sum of the values in the given row
    // --------------------------------------
    public int rowSum(int row) {
    		int sum = 0;
    		for(int i = 0; i < square[row].length; i++) {
    			sum = sum + square[row][i];
    		}
    		return sum;
    }
    // --------------------------------------
    // return the sum of the values in the given column
    // --------------------------------------
    public int colSum(int col) {
    		int sum = 0;
    		for(int i = 0; i < square[col].length; i++) {
    			sum = sum + square[i][col];
    		}
    		return sum;
    }
    // --------------------------------------
    // return the sum of the values in the main diagonal
    // --------------------------------------
    public int mainDiagSum() {
        int sum = 0;
        for(int i = 0; i < size; i++) {
        		sum = sum + square[i][i];
        }
        return sum;
    }
    // --------------------------------------
    // return the sum of the values in the other ("reverse") diagonal
    // --------------------------------------
    public int otherDiagSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + square[i][size - 1 - i];
        }
        return sum;
    }
    // --------------------------------------
    // return true if the square is magic (all rows, cols, and diags have
    // same sum), false otherwise
    // --------------------------------------
    public boolean isMagic() {
        int sum = mainDiagSum();
        if (this.otherDiagSum() != sum) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (rowSum(i) != sum || colSum(i) != sum) {
                    return false;
                }
            }
            return true;
        }
    }
    // --------------------------------------
    // read info into the square from the input stream associated with the
    // Scanner parameter
    // --------------------------------------
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        } 
    }
    // ----------------------------------------
    // print the contents of the square, neatly formatted
    // ----------------------------------------
    public void printSquare() {
    		
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
