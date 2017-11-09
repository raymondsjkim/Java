import java.util.Scanner;
import java.io.IOException;
import java.io.File;

// https://github.com/yl10030270/Javacourse_src/blob/master/term1/lab/lab11/SquareTest.java

public class SquareTest
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("C:/Users/csci145.INSTRUCTION.000/Desktop/SquareTest/src/magicData.txt"));
		int count = 1; //count which square we're on
		int size = scan.nextInt(); //size of next square
		
		
		//Expecting -1 at bottom of input file
		while (size != -1)
		 {
			//create a new Square of the given size
			Square sq = new Square(size);
			//call its read method to read the values of the square
			sq.readSquare(scan);
			System.out.println("\n******** Square " + count + " ********");
			//print the square
			//print the sums of its rows
			//print the sums of its columns
			//print the sum of the main diagonal
			//print the sum of the other diagonal
			//determine and print whether it is a magic square
			//get size of next square
			size = scan.nextInt();
		 }
	}
}
