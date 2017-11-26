/*  Program: Reading from and Writing to Text Files
    Author: Raymond Kim
    Class: CSCI 145
    Date: 11/28/2017
    Description: Reads student data from a text 
    file and writes data to another text file.
    do anything with it.
	Exception(s): N/A
*/
// ************************************************************************
// Warning.java 
// ************************************************************************
import java.io.PrintWriter;
import java.io.File;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Warning {
	public static void main(String[] args) throws IOException
	{
		DecimalFormat fmt = new DecimalFormat("0.00");
		int creditHrs; // number of semester hours earned
		double qualityPts; // number of quality points earned
		double gpa; // grade point (quality point) average
		String line, name, inputName = "/Users/raymond_kim/Desktop/ch12/Warning/src/student.dat";
		String outputName = "/Users/raymond_kim/Desktop/ch12/Warning/src/warning.dat";
		try
		 {
			// Set up scanner to input file
			Scanner scan = new Scanner(new File(inputName));
			// Set up the output file stream
			File file = new File (outputName);
			PrintWriter outFile = new PrintWriter (file);
			// Print a header to the output file
			outFile.println ();
			outFile.println ("Students on Academic Warning");
			outFile.println ();
			// Process the input file, one token at a time
			while (scan.hasNextLine()) {
				// Get the credit hours and quality points and
				// determine if the student is on warning. If so,
				// write the student data to the output file.
				line = scan.nextLine();
				Scanner stringScan = new Scanner(line);
				name = stringScan.next();
				creditHrs = stringScan.nextInt();
				qualityPts = stringScan.nextDouble();
				gpa = qualityPts/creditHrs;
				if(gpa < 2.0) {
					outFile.println(name+ " " + fmt.format(gpa));
				}
			 }
			// Close output file
			outFile.close();  
		 } catch (FileNotFoundException exception) {
			 System.out.println ("The file " + inputName + " was not found.");
		 } catch (IOException exception) {
			System.out.println (exception);
		 } catch (NumberFormatException e) {
			 System.out.println ("Format error in input file: " + e);
		 }
	}
}
