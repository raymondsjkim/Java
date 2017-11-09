import java.util.Scanner;
import java.io.*;
public class SquareTest
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("/Users/raymond_kim/Desktop/csci145_2/SquareTest/src/magicData.txt"));
		int count = 1; //count which square we're on
		int size = scan.nextInt(); //size of next square
		while (size != -1) {
            Square square = new Square(size);// create a new Square of the given size
            square.readSquare(scan);// call its read method to read the values of the square
            System.out.println("\n******** Square " + count + " ********");
            square.printSquare();// print the square
            System.out.println();
          	// print the sums of its rows
            for (int row = 0; row < size; row++) {
                System.out.println("The sum of row " + (row + 1) + " is "
                        + square.rowSum(row));
            }
            System.out.println();
            // print the sums of its columns
            for (int col = 0; col < size; col++) {
                System.out.println("The sum of col " + (col + 1) + " is " + square.colSum(col));
            }
            System.out.println();
            // print the sum of the main diagonal
            System.out.println("The sum of main diagonal is " + square.mainDiagSum());
            // print the sum of the other diagonal
            System.out.println("The sum of the other diagonal is "+ square.otherDiagSum());
            // determine and print whether it is a magic square
            if(square.isMagic()) {
            		System.out.println("The square is a magic square.");
            } else {
            		System.out.println("The square is not a magic square.");
            }
            // get size of next square
            size = scan.nextInt();
            count++;
        }
	}
}
