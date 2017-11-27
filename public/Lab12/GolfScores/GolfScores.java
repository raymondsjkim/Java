/*  Program: Golf Scores
    Author: Raymond Kim
    Class: CSCI 145
    Date: 11/28/2017
    Description: This program processes golf scores
    and determines the winner.
    do anything with it.
	Exception(s): N/A
*/
// ************************************************************************
// GolfScores.java 
// ************************************************************************
import java.io.*;
import java.util.Scanner;
public class GolfScores {
	public static void main(String[] args) throws IOException {
		int par, g1, g2, g3, g4;
		String hole, winner = "";
		int golf1 = 0;
		int golf2 = 0;
		int golf3 = 0;
		int golf4 = 0;
		int shot1 = 0, shot2 = 0, shot3 = 0;
		String inputName = "/Users/raymond_kim/Desktop/ch12/GolfScores/src/golf18.txt";
		try
		 {
			// Set up scanner to input file
			Scanner scan = new Scanner(new File(inputName));
			while (scan.hasNextInt()) {
				hole = scan.nextLine();
				Scanner stringScan = new Scanner(hole);
				par = stringScan.nextInt();
				g1 = stringScan.nextInt();
				g2 = stringScan.nextInt();
				g3 = stringScan.nextInt();
				g4 = stringScan.nextInt();
				golf1 += g1;
				golf2 += g2;
				golf3 += g3;
				golf4 += g4;
			 }
			if(golf1 < golf2 && golf1 < golf3 && golf1 < golf4) {
				System.out.println("Golfer 1 is the winner with the score of " + golf1);
				System.out.println();
				shot1 = golf2 - golf1;
				shot2 = golf3 - golf1;
				shot3 = golf4 - golf1;
				System.out.println("Golfer 2 shot more by " + shot1 + " strokes.");
				System.out.println("Golfer 3 shot more by " + shot2 + " strokes.");
				System.out.println("Golfer 4 shot more by " + shot3 + " strokes.");
			}
			if(golf2 < golf1 && golf2 < golf3 && golf2 < golf4) {
				System.out.println("Golfer 2 is the winner with the score of " + golf2);
				System.out.println();
				shot1 = golf1 - golf2;
				shot2 = golf3 - golf2;
				shot3 = golf4 - golf2;
				System.out.println("Golfer 1 shot more by " + shot1 + " strokes.");
				System.out.println("Golfer 3 shot more by " + shot2 + " strokes.");
				System.out.println("Golfer 4 shot more by " + shot3 + " strokes.");
			}
			if(golf3 < golf1 && golf3 < golf2 && golf3 < golf4) {
				System.out.println("Golfer 3 is the winner with the score of " + golf3);
				System.out.println();
				shot1 = golf1 - golf3;
				shot2 = golf2 - golf3;
				shot3 = golf4 - golf3;
				System.out.println("Golfer 1 shot more by " + shot1 + " strokes.");
				System.out.println("Golfer 2 shot more by " + shot2 + " strokes.");
				System.out.println("Golfer 4 shot more by " + shot3 + " strokes.");
			}
			if(golf4 < golf1 && golf4 < golf2 && golf4 < golf3) {
				System.out.println("Golfer 4 is the winner with the score of " + golf4);
				System.out.println();
				shot1 = golf1 - golf4;
				shot2 = golf2 - golf4;
				shot3 = golf3 - golf4;
				System.out.println("Golfer 1 shot more by " + shot1 + " strokes.");
				System.out.println("Golfer 2 shot more by " + shot2 + " strokes.");
				System.out.println("Golfer 3 shot more by " + shot3 + " strokes.");
			}	
		 } catch (FileNotFoundException exception) {
			 System.out.println ("The file " + inputName + " was not found.");
		 } catch (IOException exception) {
			System.out.println (exception);
		 } catch (NumberFormatException e) {
			 System.out.println ("Format error in input file: " + e);
		 }
	}
}
