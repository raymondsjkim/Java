/*  
  	Program: Project 4 (Advance Game of Roulette)
    Author: Raymond Kim, Anthony Zamora, and Dasol 
    Class: CSCI 145
    Date: 12/07/2017
    Description: This program loads games with data from an input data
    file. A player can be added or removed, Multiple games can be played, 
    up to 5 players per game, player can place multiple bets per round, 
    and a player can keep track of his/her chips.
	Exception(s): N/A
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Roulette {
	public static void main(String[] args) throws IOException {
		Wheel.welcomeMessage(); // welcome message and load game
		Wheel.MainMenu(); // display menu for games
	}
}
